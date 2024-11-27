package com.project.api.Services.Implements;

import com.project.api.DataAccess.AddressRepository;
import com.project.api.Model.Address;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements CrudOperations<Address>, QueryOperation<AddressRepository> {
    @Autowired
    private AddressRepository _addressRepository; //Se inyecta la depedencia en el constructor automáticamente
    //public AddressService(AddressRepository addressRepository){ _addressRepository=addressRepository;}
    //Tal como se muestra arriba es lo mismo que hace el autowired.
    @Override
    public Address GetWithId(long id) { return _addressRepository.findById(id).orElse(null); }

    @Override
    public List<Address> GetAll() {return _addressRepository.findAll(); }

    @Override
    public void Create(Address entity) {
        if(entity.getAddressId()!=0){
            throw new IllegalArgumentException("Cannot create Address with an ID assigned");
        }
        _addressRepository.save(entity);
    }

    @Override
    public void Update(Address entity) {
        if (entity.getAddressId() == 0) {
            throw new IllegalArgumentException("Cannot update Address without an ID");
        }
        _addressRepository.save(entity);
    }

    @Override
    public void Delete(Address entity) {
        if (entity.getAddressId() == 0) {
            throw new IllegalArgumentException("Cannot delete Address without an ID");
        }
        _addressRepository.delete(entity);
    }

    @Override
    public void BulkCreate(List<Address> entities) {
        if(entities.stream().anyMatch(address->address.getAddressId()!=0) ){
            throw new IllegalArgumentException("Cannot save Addresses with Ids Assigned");
        }
        _addressRepository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<Address> entities) {
        if(entities.stream().anyMatch(address->address.getAddressId()==0) ){
            throw new IllegalArgumentException("Cannot update Addresses without Ids Assigned");
        }
        _addressRepository.saveAll(entities);

    }

    @Override
    public void BulkDelete(List<Address> entities) {
        if(entities.stream().anyMatch(address->address.getAddressId() == 0) ){
            throw new IllegalArgumentException("Cannot delete Addresses without Ids Assigned");
        }
        _addressRepository.saveAll(entities);
    }
    //Query Operations
    @Override
    public AddressRepository GetRepository() {
        return _addressRepository;
    }
}

package com.project.api.Services.Implements;

import com.project.api.DataAccess.AddressRepository;
import com.project.api.Model.Address;
import com.project.api.Services.Interfaces.CrudOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements CrudOperations<Address> {
    @Autowired
    private AddressRepository _addressRepository; //Se inyecta la depedencia en el constructor automáticamente
    //public AddressService(AddressRepository addressRepository){ _addressRepository=addressRepository;}
    //Tal como se muestra arriba es lo mismo que hace el autowired.
    @Override
    public Address GetWithId(long id) {
        return null;
    }

    @Override
    public void Create(Address entity) {

    }

    @Override
    public void Update(Address entity) {

    }

    @Override
    public void Delete(Address entity) {

    }

    @Override
    public void BulkCreate(List<Address> entities) {

    }

    @Override
    public void BulkUpdate(List<Address> entities) {

    }

    @Override
    public void BulkDelete(List<Address> entities) {

    }
}

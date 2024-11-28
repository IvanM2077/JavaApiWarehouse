package com.project.api.Services.Implements;

import com.project.api.DataAccess.Interfaces.ICountryRepository;
import com.project.api.Model.Country;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements CrudOperations<Country>, QueryOperation<ICountryRepository> {

    private ICountryRepository _repository;

    public CountryService(ICountryRepository repository){
        this._repository=repository;
    }


    @Override
    public Country GetWithId(long id) {
        return _repository.getById(id);
    }

    @Override
    public List<Country> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(Country entity) {
        if(entity.getCountryId() !=0){
            throw new IllegalArgumentException("Cannot create an entity with Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Update(Country entity) {
        if(entity.getCountryId() ==0){
            throw new IllegalArgumentException("Cannot update an entity without Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(Country entity) {
        if(entity.getCountryId() ==0){
            throw new IllegalArgumentException("Cannot delete an entity without Id assigned");
        }
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<Country> entities) {
        if(entities.stream().anyMatch(entity->entity.getCountryId() !=0)){
            throw new IllegalArgumentException("Cannot create entities with Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<Country> entities) {
        if(entities.stream().anyMatch(entity->entity.getCountryId() ==0)){
            throw new IllegalArgumentException("Cannot update entities without Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<Country> entities) {
        if(entities.stream().anyMatch(entity->entity.getCountryId() ==0)){
            throw new IllegalArgumentException("Cannot delete entities without Id assigned");
        }
        _repository.deleteAll(entities);
    }

    @Override
    public ICountryRepository GetRepository() {
        return _repository;
    }
}

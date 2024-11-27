package com.project.api.Services.Implements;

import com.project.api.DataAccess.CityRepository;
import com.project.api.Model.City;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements CrudOperations<City>, QueryOperation<CityRepository> {
    @Autowired
    private CityRepository _repository;
    //public CityService(CityRepository repository){this._repository = repository; }
    @Override
    public City GetWithId(long id){
        return _repository.findById(id).orElse(null );
    }

    @Override
    public List<City> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(City entity) {

    }

    @Override
    public void Update(City entity) {

    }

    @Override
    public void Delete(City entity) {

    }

    @Override
    public void BulkCreate(List<City> entities) {

    }

    @Override
    public void BulkUpdate(List<City> entities) {

    }

    @Override
    public void BulkDelete(List<City> entities) {

    }

    @Override
    public CityRepository GetRepository() {
        return null;
    }
}

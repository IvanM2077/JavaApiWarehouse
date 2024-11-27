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
        validateCreate(entity);
        _repository.save(entity);
    }

    @Override
    public void Update(City entity) {
        validateUpdate(entity);
        _repository.save(entity);
    }

    @Override
    public void Delete(City entity) {
        validateDelete(entity);
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<City> entities) {
        validateBulkCreate(entities);
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<City> entities) {
        validateBulkUpdate(entities);
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<City> entities) {
        validateBulkDelete(entities);
        _repository.deleteAll(entities);
    }

    @Override
    public CityRepository GetRepository() {
        return _repository;
    }
    
    public void validateCreate(City city){
        if(city.getCityId() != 0){throw  new IllegalArgumentException("Cannot create city with Id assigned");}
    }
    public void validateUpdate(City city){
        if(city.getCityId() == 0){throw  new IllegalArgumentException("Cannot update city with Id assigned");}
    }
    public void validateDelete(City city){
        if(city.getCityId() == 0){throw  new IllegalArgumentException("Cannot delete city with Id assigned");}
    }
    public void validateBulkCreate(List<City> cities){
    if(cities.stream().anyMatch(city -> city.getCityId()!=0)) throw new IllegalArgumentException("Cannot create city with Id assigned");
    }
    public void validateBulkUpdate(List<City> cities){
        if(cities.stream().anyMatch(city -> city.getCityId()!=0)) throw new IllegalArgumentException("Cannot update cities without Id assigned");
    }
    public void validateBulkDelete(List<City> cities){
        if(cities.stream().anyMatch(city -> city.getCityId()!=0)) throw new IllegalArgumentException("Cannot delete cities without Id assigned");
    }
}

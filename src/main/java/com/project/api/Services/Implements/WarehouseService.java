package com.project.api.Services.Implements;

import com.project.api.DataAccess.Interfaces.IWarehouseRepository;
import com.project.api.Model.Warehouse;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService implements CrudOperations<Warehouse>, QueryOperation<IWarehouseRepository> {

    //@Autowired
    private IWarehouseRepository _repository;
    public WarehouseService(IWarehouseRepository repository){this._repository=repository;}

    @Override
    public Warehouse GetWithId(long id) {
        return _repository.findById(id).orElse(null);
    }

    @Override
    public List<Warehouse> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(Warehouse entity) {
        if(entity.getWarehouseId() !=0){
            throw new IllegalArgumentException("Cannot save entity with ID assigned");
        }
        _repository.save(entity);

    }

    @Override
    public void Update(Warehouse entity) {
        if(entity.getWarehouseId() ==0){
            throw new IllegalArgumentException("Cannot update entity without ID assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(Warehouse entity) {
        if(entity.getWarehouseId() ==0){
            throw new IllegalArgumentException("Cannot delete entity without ID assigned");
        }
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<Warehouse> entities) {
        if(entities.stream().anyMatch(entity -> entity.getWarehouseId()!=0)){
            throw new IllegalArgumentException("Cannot save entities with ID assigned ");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<Warehouse> entities) {
        if(entities.stream().anyMatch(entity -> entity.getWarehouseId()==0)){
            throw new IllegalArgumentException("Cannot update entities without ID assigned ");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<Warehouse> entities) {
        if(entities.stream().anyMatch(entity -> entity.getWarehouseId()==0)){
            throw new IllegalArgumentException("Cannot delete entities without ID assigned ");
        }
        _repository.deleteAll(entities);
    }

    @Override
    public IWarehouseRepository GetRepository() {
        return null;
    }
}

package com.project.api.Services.Implements;

import com.project.api.DataAccess.Interfaces.IStatusRepository;
import com.project.api.Model.Status;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService implements CrudOperations<Status>,QueryOperation<IStatusRepository> {

    //@Autowired
    private IStatusRepository _repository;
    public StatusService(IStatusRepository repository){this._repository=repository;}

    @Override
    public Status GetWithId(long id) {
        return _repository.findById(id).orElse(null);
    }

    @Override
    public List<Status> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(Status entity) {
        if(entity.getStatusId() !=0 ){
            throw new IllegalArgumentException("Cannot create an entity with Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Update(Status entity) {
        if(entity.getStatusId() ==0 ){
            throw new IllegalArgumentException("Cannot update an entity without Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(Status entity) {
        if(entity.getStatusId() ==0){
            throw new IllegalArgumentException("Cannot delete an entity without Id assigned");
        }
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<Status> entities) {
        if(entities.stream().anyMatch(entity->entity.getStatusId() !=0)){
            throw new IllegalArgumentException("Cannot create entities with Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<Status> entities) {
        if(entities.stream().anyMatch(entity->entity.getStatusId()==0)){
            throw new IllegalArgumentException("Cannot update entities without Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<Status> entities) {
        if(entities.stream().anyMatch(entity->entity.getStatusId() ==0)){
            throw new IllegalArgumentException("Cannot delete entities without Id assigned");
        }
        _repository.deleteAll(entities);
    }

    @Override
    public IStatusRepository GetRepository() {
        return _repository;
    }
}

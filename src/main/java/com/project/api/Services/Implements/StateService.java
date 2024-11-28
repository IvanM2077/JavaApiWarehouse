package com.project.api.Services.Implements;

import com.project.api.DataAccess.Interfaces.IStateRepository;
import com.project.api.Model.State;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService implements CrudOperations<State>, QueryOperation<IStateRepository> {

    //@Autowired
    private IStateRepository _repository;
    public StateService(IStateRepository repository){this._repository= repository;}


    @Override
    public State GetWithId(long id) {
        return _repository.findById(id).orElse(null);
    }

    @Override
    public List<State> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(State entity) {
        if(entity.getStateId() !=0){
            throw new IllegalArgumentException("Cannot create an entity with Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Update(State entity) {
        if(entity.getStateId() ==0){
            throw new IllegalArgumentException("Cannot update an entity without Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(State entity) {
        if(entity.getStateId() ==0){
            throw new IllegalArgumentException("Cannot delete an entity without Id assigned");
        }
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<State> entities) {
        if(entities.stream().anyMatch(entity->entity.getStateId() !=0)){
            throw new IllegalArgumentException("Cannot create entities with Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<State> entities) {
        if(entities.stream().anyMatch(entity->entity.getStateId()==0)){
            throw new IllegalArgumentException("Cannot update entities without Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<State> entities) {
        if(entities.stream().anyMatch(entity->entity.getStateId() ==0)){
            throw new IllegalArgumentException("Cannot delete entities without Id assigned");
        }
        _repository.deleteAll(entities);
    }

    @Override
    public IStateRepository GetRepository() {
        return _repository;
    }
}

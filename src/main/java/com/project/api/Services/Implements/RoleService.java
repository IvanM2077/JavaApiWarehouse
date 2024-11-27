package com.project.api.Services.Implements;

import com.project.api.DataAccess.RoleRepository;
import com.project.api.Model.Role;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements CrudOperations<Role>, QueryOperation<RoleRepository> {
    @Autowired
    private RoleRepository _repository;
    @Override
    public Role GetWithId(long id) {
        return _repository.findById(id).orElse(null);
    }

    @Override
    public List<Role> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(Role entity) {
        if(entity.getRoleId() !=0){
            throw new IllegalArgumentException("Cannot create an entity with Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Update(Role entity) {
        if(entity.getRoleId() ==0){
            throw new IllegalArgumentException("Cannot update an entity without Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(Role entity) {
        if(entity.getRoleId() ==0){
            throw new IllegalArgumentException("Cannot delete an entity without Id assigned");
        }
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<Role> entities) {
        if(entities.stream().anyMatch(entity->entity.getRoleId() !=0)){
            throw new IllegalArgumentException("Cannot create entities with Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<Role> entities) {
        if(entities.stream().anyMatch(entity->entity.getRoleId() ==0)){
            throw new IllegalArgumentException("Cannot update entities without Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<Role> entities) {
        if(entities.stream().anyMatch(entity->entity.getRoleId() ==0)){
            throw new IllegalArgumentException("Cannot delete entities without Id assigned");
        }
        _repository.deleteAll(entities);
    }

    @Override
    public RoleRepository GetRepository() {
        return _repository;
    }
}

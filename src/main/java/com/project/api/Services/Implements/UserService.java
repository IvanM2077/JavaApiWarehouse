package com.project.api.Services.Implements;

import com.project.api.DataAccess.UserRepository;
import com.project.api.Model.User;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements CrudOperations<User>, QueryOperation<UserRepository> {
    @Autowired
    private UserRepository _repository;


    @Override
    public User GetWithId(long id) {
        return _repository.findById(id).orElse(null );
    }

    @Override
    public List<User> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(User entity) {
        _repository.save(entity);
    }

    @Override
    public void Update(User entity) {
    }

    @Override
    public void Delete(User entity) {

    }

    @Override
    public void BulkCreate(List<User> entities) {

    }

    @Override
    public void BulkUpdate(List<User> entities) {

    }

    @Override
    public void BulkDelete(List<User> entities) {

    }

    @Override
    public UserRepository GetQuery() {
        return this._repository;
    }
}

package com.project.api.Services.Implements;

import com.project.api.DataAccess.UserRepository;
import com.project.api.Model.User;
import com.project.api.Services.Interfaces.CrudOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements CrudOperations<User> {
    @Autowired
    private UserRepository repository;


    @Override
    public User GetWithId(long id) {
        return null;
    }

    @Override
    public void Create(User entity) {

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
}

package com.project.api.Services.Implements;

import com.project.api.DataAccess.Interfaces.IUserRepository;
import com.project.api.Model.User;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements CrudOperations<User>, QueryOperation<IUserRepository> {
    //@Autowired
    private IUserRepository _repository;
    public UserService(IUserRepository repository){this._repository = repository;}

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
        if(entity.getUserId() !=0){
            throw new IllegalArgumentException("Cannot save user with ID assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Update(User entity) {
        if(entity.getUserId() ==0){
            throw new IllegalArgumentException("Cannot update user without ID assigned");
        }
        _repository.save(entity);

    }

    @Override
    public void Delete(User entity) {
        if(entity.getUserId() ==0){
            throw new IllegalArgumentException("Cannot delete user without ID assigned");
        }
        _repository.delete(entity);
    }
    @Override
    public void BulkCreate(List<User> entities) {
        if(entities.stream().anyMatch(user -> user.getUserId()!=0)){
            throw new IllegalArgumentException("Cannot save users with ID assigned ");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<User> entities) {
        if(entities.stream().anyMatch(user -> user.getUserId()==0)){
            throw new IllegalArgumentException("Cannot update users without ID assigned ");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<User> entities) {
        if(entities.stream().anyMatch(user -> user.getUserId()==0)){
            throw new IllegalArgumentException("Cannot delete users without ID assigned ");
        }
        _repository.deleteAll(entities);
    }

    @Override
    public IUserRepository GetRepository() {
        return this._repository;
    }
}

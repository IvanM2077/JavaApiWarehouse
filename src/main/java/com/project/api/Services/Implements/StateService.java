package com.project.api.Services.Implements;

import com.project.api.DataAccess.StateRepository;
import com.project.api.Model.State;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService implements CrudOperations<State>, QueryOperation<StateRepository> {
    @Override
    public State GetWithId(long id) {
        return null;
    }

    @Override
    public List<State> GetAll() {
        return null;
    }

    @Override
    public void Create(State entity) {

    }

    @Override
    public void Update(State entity) {

    }

    @Override
    public void Delete(State entity) {

    }

    @Override
    public void BulkCreate(List<State> entities) {

    }

    @Override
    public void BulkUpdate(List<State> entities) {

    }

    @Override
    public void BulkDelete(List<State> entities) {

    }

    @Override
    public StateRepository GetRepository() {
        return null;
    }
}

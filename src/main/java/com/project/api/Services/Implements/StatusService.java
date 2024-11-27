package com.project.api.Services.Implements;

import com.project.api.DataAccess.StatusRepository;
import com.project.api.Model.Status;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService implements CrudOperations<Status>,QueryOperation<StatusRepository> {
    @Override
    public Status GetWithId(long id) {
        return null;
    }

    @Override
    public List<Status> GetAll() {
        return null;
    }

    @Override
    public void Create(Status entity) {

    }

    @Override
    public void Update(Status entity) {

    }

    @Override
    public void Delete(Status entity) {

    }

    @Override
    public void BulkCreate(List<Status> entities) {

    }

    @Override
    public void BulkUpdate(List<Status> entities) {

    }

    @Override
    public void BulkDelete(List<Status> entities) {

    }

    @Override
    public StatusRepository GetRepository() {
        return null;
    }
}

package com.project.api.Services.Implements;

import com.project.api.DataAccess.WarehouseRepository;
import com.project.api.Model.Warehouse;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService implements CrudOperations<Warehouse>, QueryOperation<WarehouseRepository> {
    @Override
    public Warehouse GetWithId(long id) {
        return null;
    }

    @Override
    public List<Warehouse> GetAll() {
        return null;
    }

    @Override
    public void Create(Warehouse entity) {

    }

    @Override
    public void Update(Warehouse entity) {

    }

    @Override
    public void Delete(Warehouse entity) {

    }

    @Override
    public void BulkCreate(List<Warehouse> entities) {

    }

    @Override
    public void BulkUpdate(List<Warehouse> entities) {

    }

    @Override
    public void BulkDelete(List<Warehouse> entities) {

    }

    @Override
    public WarehouseRepository GetRepository() {
        return null;
    }
}

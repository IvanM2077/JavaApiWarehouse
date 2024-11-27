package com.project.api.Services.Implements;

import com.project.api.DataAccess.WarehouseInventoryRepository;
import com.project.api.Model.WarehouseInventory;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseInventoryService implements CrudOperations<WarehouseInventory>, QueryOperation<WarehouseInventoryRepository> {
    @Override
    public WarehouseInventory GetWithId(long id) {
        return null;
    }

    @Override
    public List<WarehouseInventory> GetAll() {
        return null;
    }

    @Override
    public void Create(WarehouseInventory entity) {

    }

    @Override
    public void Update(WarehouseInventory entity) {

    }

    @Override
    public void Delete(WarehouseInventory entity) {

    }

    @Override
    public void BulkCreate(List<WarehouseInventory> entities) {

    }

    @Override
    public void BulkUpdate(List<WarehouseInventory> entities) {

    }

    @Override
    public void BulkDelete(List<WarehouseInventory> entities) {

    }

    @Override
    public WarehouseInventoryRepository GetRepository() {
        return null;
    }
}

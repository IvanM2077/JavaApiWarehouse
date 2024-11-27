package com.project.api.Services.Implements;

import com.project.api.DataAccess.OrderProductRepository;
import com.project.api.Model.OrderProduct;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductService implements CrudOperations<OrderProduct>, QueryOperation<OrderProductRepository> {
    @Override
    public OrderProduct GetWithId(long id) {
        return null;
    }

    @Override
    public List<OrderProduct> GetAll() {
        return null;
    }

    @Override
    public void Create(OrderProduct entity) {

    }

    @Override
    public void Update(OrderProduct entity) {

    }

    @Override
    public void Delete(OrderProduct entity) {

    }

    @Override
    public void BulkCreate(List<OrderProduct> entities) {

    }

    @Override
    public void BulkUpdate(List<OrderProduct> entities) {

    }

    @Override
    public void BulkDelete(List<OrderProduct> entities) {

    }

    @Override
    public OrderProductRepository GetRepository() {
        return null;
    }
}

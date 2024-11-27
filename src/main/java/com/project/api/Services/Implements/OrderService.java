package com.project.api.Services.Implements;

import com.project.api.DataAccess.OrderRepository;
import com.project.api.Model.Order;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements CrudOperations<Order>, QueryOperation<OrderRepository> {
    @Override
    public Order GetWithId(long id) {
        return null;
    }

    @Override
    public List<Order> GetAll() {
        return null;
    }

    @Override
    public void Create(Order entity) {

    }

    @Override
    public void Update(Order entity) {

    }

    @Override
    public void Delete(Order entity) {

    }

    @Override
    public void BulkCreate(List<Order> entities) {

    }

    @Override
    public void BulkUpdate(List<Order> entities) {

    }

    @Override
    public void BulkDelete(List<Order> entities) {

    }

    @Override
    public OrderRepository GetRepository() {
        return null;
    }
}

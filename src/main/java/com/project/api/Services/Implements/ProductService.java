package com.project.api.Services.Implements;

import com.project.api.DataAccess.ProductRepository;
import com.project.api.Model.Product;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements CrudOperations<Product>, QueryOperation<ProductRepository> {
    @Override
    public Product GetWithId(long id) {
        return null;
    }

    @Override
    public List<Product> GetAll() {
        return null;
    }

    @Override
    public void Create(Product entity) {

    }

    @Override
    public void Update(Product entity) {

    }

    @Override
    public void Delete(Product entity) {

    }

    @Override
    public void BulkCreate(List<Product> entities) {

    }

    @Override
    public void BulkUpdate(List<Product> entities) {

    }

    @Override
    public void BulkDelete(List<Product> entities) {

    }

    @Override
    public ProductRepository GetRepository() {
        return null;
    }
}

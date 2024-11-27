package com.project.api.Services.Implements;

import com.project.api.DataAccess.ProductMediaRepository;
import com.project.api.Model.ProductMedia;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMediaService implements CrudOperations<ProductMedia>, QueryOperation<ProductMediaRepository> {
    @Override
    public ProductMedia GetWithId(long id) {
        return null;
    }

    @Override
    public List<ProductMedia> GetAll() {
        return null;
    }

    @Override
    public void Create(ProductMedia entity) {

    }

    @Override
    public void Update(ProductMedia entity) {

    }

    @Override
    public void Delete(ProductMedia entity) {

    }

    @Override
    public void BulkCreate(List<ProductMedia> entities) {

    }

    @Override
    public void BulkUpdate(List<ProductMedia> entities) {

    }

    @Override
    public void BulkDelete(List<ProductMedia> entities) {

    }

    @Override
    public ProductMediaRepository GetRepository() {
        return null;
    }
}

package com.project.api.Services.Interfaces;

import java.util.List;

public interface CrudOperations<T> {
    T GetWithId(long id);
    List<T> GetAll();
    void Create(T entity);
    void Update(T entity);
    void Delete(T entity);
    void BulkCreate(List<T> entities);
    void BulkUpdate(List<T> entities);
    void BulkDelete(List<T> entities);
}


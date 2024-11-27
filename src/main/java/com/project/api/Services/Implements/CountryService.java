package com.project.api.Services.Implements;

import com.project.api.DataAccess.CountryRepository;
import com.project.api.Model.Country;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements CrudOperations<Country>, QueryOperation<CountryRepository> {
    @Override
    public Country GetWithId(long id) {
        return null;
    }

    @Override
    public List<Country> GetAll() {
        return null;
    }

    @Override
    public void Create(Country entity) {

    }

    @Override
    public void Update(Country entity) {

    }

    @Override
    public void Delete(Country entity) {

    }

    @Override
    public void BulkCreate(List<Country> entities) {

    }

    @Override
    public void BulkUpdate(List<Country> entities) {

    }

    @Override
    public void BulkDelete(List<Country> entities) {

    }

    @Override
    public CountryRepository GetRepository() {
        return null;
    }
}

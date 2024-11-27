package com.project.api.Services.Implements;

import com.project.api.DataAccess.RoleRepository;
import com.project.api.Model.Role;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements CrudOperations<Role>, QueryOperation<RoleRepository> {
    @Override
    public Role GetWithId(long id) {
        return null;
    }

    @Override
    public List<Role> GetAll() {
        return null;
    }

    @Override
    public void Create(Role entity) {

    }

    @Override
    public void Update(Role entity) {

    }

    @Override
    public void Delete(Role entity) {

    }

    @Override
    public void BulkCreate(List<Role> entities) {

    }

    @Override
    public void BulkUpdate(List<Role> entities) {

    }

    @Override
    public void BulkDelete(List<Role> entities) {

    }

    @Override
    public RoleRepository GetRepository() {
        return null;
    }
}

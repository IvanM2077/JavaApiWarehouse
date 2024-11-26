package com.project.api.Services.Dtos.Implements.User;

import com.project.api.Model.User;
import com.project.api.Services.Dtos.Interfaces.IPaginatedResponseMethods;

import java.util.List;

public class UserDtoResponse implements IPaginatedResponseMethods<User> {
    private List<User> records;
    private int count;
    private int pages;

    @Override
    public List<User> getRecords() {
        return this.records;
    }

    @Override
    public void setRecords(List<User> records) {
        this.records=records;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count=count;
    }

    @Override
    public int getPages() {
        return this.pages;
    }

    @Override
    public void setPages(int pages) {
        this.pages = pages;
    }

}

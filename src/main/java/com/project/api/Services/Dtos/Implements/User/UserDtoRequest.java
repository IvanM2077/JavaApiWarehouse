package com.project.api.Services.Dtos.Implements.User;

import com.project.api.Model.User;
import com.project.api.Services.Dtos.Interfaces.IPaginatedRequestMethods;

public class UserDtoRequest implements IPaginatedRequestMethods<User> {

    private int itemToShow;
    private int page;
    private String sort;
    private Boolean ascending;


    @Override
    public int getItemsToShow() {
        return itemToShow;
    }

    @Override
    public void setItemsToShow(int ItemToShow) {
        this.itemToShow = ItemToShow;
    }

    @Override
    public int getPage() {
        return this.page;
    }

    @Override
    public void setPage(int Page) {
        this.page = page;
    }

    @Override
    public String getSort() {
        return this.sort;
    }

    @Override
    public void setSort(String Sort) {
        this.sort= sort;
    }

    @Override
    public Boolean getAscending() {
        return this.ascending;
    }

    @Override
    public void setAscending(Boolean ascending) {
        this.ascending = ascending;
    }
}

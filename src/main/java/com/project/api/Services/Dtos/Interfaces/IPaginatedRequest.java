package com.project.api.Services.Dtos.Interfaces;

public interface IPaginatedRequest <T>{
    int getItemsToShow();
    void setItemsToShow(int ItemToShow);

    int getPage();
    void setPage(int Page);

    String getSort();
    void setSort(String Sort);

    Boolean getAscending();
    void setAscending();
}

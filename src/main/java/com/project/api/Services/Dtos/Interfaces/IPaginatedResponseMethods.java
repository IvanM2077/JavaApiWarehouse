package com.project.api.Services.Dtos.Interfaces;

import java.util.List;

public interface IPaginatedResponseMethods<T> {
    List<T> getRecords();
    void setRecords(List<T> records);
    int getCount();
    void setCount(int count);
    int getPages();
    void setPages(int pages);
}

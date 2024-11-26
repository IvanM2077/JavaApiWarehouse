package com.project.api.ModelTest;


import com.project.api.Model.City;
import com.project.api.Model.Warehouse;
import com.project.api.Model.WarehouseInventory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {

    private Warehouse warehouse;

    @BeforeEach
    public void  init(){
        this.warehouse = new Warehouse();
    }

    @Test
    public void testGetterAndSetterWarehouseId(){
        //Arrange
        Long expectedWarehouseId = 1L;
        //Act
        warehouse.setWarehouseId(expectedWarehouseId);
        //Assert
        assertEquals(expectedWarehouseId, warehouse.getWarehouseId());

    }
    @Test
    public void testGetterAndSetterWarehouseName(){
        //Arrange
        String expectedWarehouseName = "CEDIS";
        //Act
        warehouse.setWarehouseName(expectedWarehouseName);
        //Assert
        assertEquals(expectedWarehouseName, warehouse.getWarehouseName());
    }
    @Test
    public void testGetterAndSetterCity(){
        //Arrange
        City expectedCity = new City();
        expectedCity.setCityId(1L);
        //Act
        warehouse.setCity(expectedCity);
        //Assert
        assertEquals(expectedCity, warehouse.getCity());
    }
    @Test
    public void testGetterAndSetterWarehouseInventoryList(){
        //Arrange
        List<WarehouseInventory> expectedWarehouseList = List.of(new WarehouseInventory(), new WarehouseInventory());
        int counter = 0;
        for(var warehouseInvetory : expectedWarehouseList){warehouseInvetory.setWarehouseInventoryId(counter++);}
        //Act
        warehouse.setWarehouseInventoryList(expectedWarehouseList);
        //Assert
        assertEquals(expectedWarehouseList,warehouse.getWarehouseInventoryList());
        assertEquals(counter, (int)expectedWarehouseList.stream().count());
    }
}

package com.project.api.ModelTest;


import com.project.api.Model.Product;
import com.project.api.Model.Warehouse;
import com.project.api.Model.WarehouseInventory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarehouseInventoryTest {
    private WarehouseInventory warehouseInventory;
    @BeforeEach
    public void  init(){
        this.warehouseInventory = new WarehouseInventory();
    }

    @Test
    public void testGetterAndSetterWarehouseInventoryId(){
        //Arrange
        Long expectedWarehouseInventoryId = 1L;
        //Act
        warehouseInventory.setWarehouseInventoryId(expectedWarehouseInventoryId);
        //Assert
        assertEquals(expectedWarehouseInventoryId, warehouseInventory.getWarehouseInventoryId());

    }    @Test
    public void testGetterAndSetterWarehouse(){
        //Arrange
        Warehouse expectedWarehouse = new Warehouse();
        expectedWarehouse.setWarehouseId(1L);
        //Act
        warehouseInventory.setWarehouse(expectedWarehouse);
        //Assert
        assertEquals(expectedWarehouse,warehouseInventory.getWarehouse());
    }
    @Test
    public void testGetterAndSetterProduct(){
        //Arrange
        Product expectedProduct = new Product();
        expectedProduct.setProductId(1L);
        //Act
        warehouseInventory.setProduct(expectedProduct);
        //Assert
        assertEquals(expectedProduct,warehouseInventory.getProduct());
    }
    @Test
    public void testGetterAndSetterWarehouseAmount(){
        //Arrange
        int expectedWarehouseAmount = 1;
        //Act
        warehouseInventory.setWarehouseAmount(expectedWarehouseAmount);
        //Assert
        assertEquals(expectedWarehouseAmount, warehouseInventory.getWarehouseAmount());
    }


}

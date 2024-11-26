package com.project.api.ModelTest;

import com.project.api.Model.OrderProduct;
import com.project.api.Model.Product;
import com.project.api.Model.ProductMedia;
import com.project.api.Model.WarehouseInventory;
import jakarta.persistence.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ProductTest {
    private Product product;
    @BeforeEach
    public void init(){
        this.product= new Product();
    }


    @Test
    public void testGetterAndSetterProductId(){
        //Arrange
        Long expectedProductId = 1L;
        //Act
        product.setProductId(expectedProductId);
        //Assert
        assertEquals(expectedProductId, product.getProductId());
    }
    @Test
    public void testGetterAndSetterItem(){
        //Arrange
        String expectedItem = "Product name";
        //Act
        product.setItem(expectedItem);
        //Assert
        assertEquals(expectedItem, product.getItem());

    }
    @Test
    public void testGetterAndSetterDescription(){
        //Arrange
        String expectedDescription = "Product description";
        //Act
        product.setDescription(expectedDescription);
        //Assert
        assertEquals(expectedDescription, product.getDescription());
    }
    @Test
    public void testGetterAndSetterPrice(){
        //Arrange
        Double expectedPrice = 33.0;
        //Act
        product.setPrice(expectedPrice);
        //Assert
        assertEquals(expectedPrice,product.getPrice());

    }
    @Test
    public void testGetterAndSetterProductMedia(){
        //Arrange
        ProductMedia expectedProductMedia = new ProductMedia();
        expectedProductMedia.setProductMediaId(1L);
        //Act
        product.setProductMedia(expectedProductMedia);
        //Assert
        assertEquals(expectedProductMedia,product.getProductMedia());
    }
    @Test
    public void testGetterAndSetterWarehouseInventoryProducts(){
        //Arrange
        List<WarehouseInventory> expectedWarehouseInventoryProductsList = List.of(new WarehouseInventory(), new WarehouseInventory());
        int counter=0;
        for(var warehouseInventory: expectedWarehouseInventoryProductsList){warehouseInventory.setWarehouseInventoryId(counter++);}
        //Act
        product.setWarehouseInventoryProducts(expectedWarehouseInventoryProductsList);
        //Assert
        assertEquals(expectedWarehouseInventoryProductsList, product.getWarehouseInventoryProducts());
        assertEquals(counter, (int)product.getWarehouseInventoryProducts().stream().count());
    }
    @Test
    public void testGetterAndSetterOrderProducts(){
        //Arrange
        List<OrderProduct> expectedOrderProductsList = List.of(new OrderProduct(), new OrderProduct());
        int counter=0;
        for(var orderProduct: expectedOrderProductsList){orderProduct.setOrderProductId(counter++);}
        //Act
        product.setOrderProducts(expectedOrderProductsList);
        //Assert
        assertEquals(expectedOrderProductsList, product.getOrderProducts());
        assertEquals(counter, (int)product.getOrderProducts().stream().count());
    }


}

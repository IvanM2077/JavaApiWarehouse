package com.project.api.ModelTest;

import com.project.api.Model.Order;
import com.project.api.Model.OrderProduct;
import com.project.api.Model.Product;
import jakarta.persistence.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProductsTest {

    private OrderProduct orderProduct;
    @BeforeEach
    public void init(){
        this.orderProduct = new OrderProduct();
    }

    @Test
    public void testGetterAndSetterOrderProductId(){
        //Arrange
        Long expectedOrderProductId = 1L;
        //Act
        orderProduct.setOrderProductId(expectedOrderProductId);
        //Assert
        assertEquals(expectedOrderProductId, orderProduct.getOrderProductId());

    }
    @Test
    public void testGetterAndSetterOrder(){
        //Arrange
        Order expectedOrder = new Order();
        expectedOrder.setOrderId(1L);
        //Act
        orderProduct.setOrder(expectedOrder);
        //Assert
        assertEquals(expectedOrder, orderProduct.getOrder());
    }
    @Test
    public void testGetterAndSetterProduct(){
        //Arrange
        Product expectedProduct = new Product();
        expectedProduct.setProductId(1L);
        //Act
        orderProduct.setProduct(expectedProduct);
        //Assert
        assertEquals(expectedProduct, orderProduct.getProduct());
    }


}

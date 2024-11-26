package com.project.api.ModelTest;

import com.project.api.Model.Order;
import com.project.api.Model.OrderProduct;
import com.project.api.Model.Status;
import com.project.api.Model.User;
import jakarta.persistence.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class OrderTest {
    private Order order;
    @BeforeEach
    public void init(){
        this.order=new Order();
    }
    @Test
    public void testGetterAndSetterOrderId(){
        //Arrange
        Long expectedOrderId = 1L;
        //Act
        order.setOrderId(expectedOrderId);
        //Asserts
        assertEquals(expectedOrderId, order.getOrderId());
    }
    @Test
    public void testGetterAndSetterUser(){
        //Arrange
        User expectedUser = new User();
        expectedUser.setUserId(1L);
        //Act
        order.setUser(expectedUser);
        //Asserts
        assertEquals(expectedUser, order.getUser());
    }
    @Test
    public void testGetterAndSetterStatus(){
        //Arrange
        Status expectedStatus = new Status();
        expectedStatus.setStatusId(1L);
        //Act
        order.setStatus(expectedStatus);
        //Asserts
        assertEquals(expectedStatus, order.getStatus());
    }
    @Test
    public void testGetterAndSetterOrderProducts(){
        //Arrange
        List<OrderProduct> expectedOrderProducts = List.of(new OrderProduct(), new OrderProduct());
        int counter =0;
        for(var orderProduct : expectedOrderProducts){orderProduct.setOrderProductId(counter++);}
        //Act
        order.setOrderProducts(expectedOrderProducts);
        //Asserts
        assertEquals(expectedOrderProducts, order.getOrderProducts());
        assertEquals(counter, (int)order.getOrderProducts().stream().count());
    }
}

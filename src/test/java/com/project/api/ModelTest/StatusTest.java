package com.project.api.ModelTest;
import com.project.api.Model.Order;
import com.project.api.Model.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatusTest {

    private Status status;

    @BeforeEach
    public void  init(){
        this.status = new Status();
    }

    @Test
    public void testGetterAndSetterStatusId(){
        //Arrange
        Long expectedStatusId = 1L;
        //Act
        status.setStatusId(expectedStatusId);
        //Assert
        assertEquals(expectedStatusId, status.getStatusId());

    }
    @Test
    public void testGetterAndSetterStatusName(){
        //Arrange
        String expectedStatusName = "En pedido";
        //Act
        status.setStatusName(expectedStatusName);
        //Assert
        assertEquals(expectedStatusName, status.getStatusName());
    }
    @Test
    public void testGetterAndSetterStatusOrders(){
        //Arrange
        List<Order> expectedStatusOrder = List.of(new Order(), new Order());
        int counter = 0;
        for(var statusOrder: expectedStatusOrder){statusOrder.setOrderId(counter++);}
        //Act
        status.setStatusOrders(expectedStatusOrder);
        //Assert
        assertEquals(expectedStatusOrder, status.getStatusOrders());
        assertEquals(counter, status.getStatusOrders().stream().count());
    }
}

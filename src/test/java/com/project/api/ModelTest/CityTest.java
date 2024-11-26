package com.project.api.ModelTest;

import com.project.api.Model.Address;
import com.project.api.Model.City;
import com.project.api.Model.State;
import com.project.api.Model.Warehouse;
import jakarta.persistence.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {
    private City city;
    @BeforeEach
    public void init(){
        this.city = new City();
    }
    @Test
    public void testGetterAndSetterCityId(){
        //Arrange
        Long expectedCityId = 1L;
        //Act
        city.setCityId(expectedCityId);
        //Assert
        assertEquals(expectedCityId,city.getCityId());
    }    @Test
    public void testGetterAndSetterCityName(){
        //Arrange
        String expectedCityName = "Merida";
        //Act
        city.setCityName(expectedCityName);
        //Assert
        assertEquals(expectedCityName, city.getCityName());
    }    @Test
    public void testGetterAndSetterCodePostal(){
        //Arrange
        String expectedCodePostal = "97302";
        //Act
        city.setCodePostal(expectedCodePostal);
        //Assert
        assertEquals(expectedCodePostal, city.getCodePostal());
    }    @Test
    public void testGetterAndSetterState(){
        //Arrange
        State expectedState = new State();
        expectedState.setStateId(1L);
        //Act
        city.setState(expectedState);
        //Assert
        assertEquals(expectedState, city.getState());
    }    @Test
    public void testGetterAndSetterWarehouse(){
        Warehouse expectedWarehouse = new Warehouse();
        expectedWarehouse.setWarehouseId(1L);
        //Act
        city.setWarehouse(expectedWarehouse);
        //Assert
        assertEquals(expectedWarehouse, city.getWarehouse());
    }    @Test
    public void testGetterAndSetterAddresses(){
        List<Address> expectedAddresses = List.of(
                new Address(), new Address()
        );
        int Counter = 0;
        for(var address :expectedAddresses){
            address.setAddressId(Counter++);
        }
        //Act
        city.setAddresses(expectedAddresses);
        //Assert
        assertEquals(expectedAddresses, city.getAddresses());
        assertEquals(Counter, (int)city.getAddresses().size());
    }

}

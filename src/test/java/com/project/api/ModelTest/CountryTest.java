package com.project.api.ModelTest;

import com.project.api.Model.Country;
import com.project.api.Model.State;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class CountryTest {
    private Country country;
    @BeforeEach
    public void init(){
        this.country = new Country();
    }
    @Test
    public void testGetterAndSetterCountryId(){
        //Arrange
        Long expectedCountryId = 1L;
        //Act
        country.setCountryId(expectedCountryId);
        //Assert
        assertEquals(expectedCountryId, country.getCountryId());
    }
    @Test
    public void testGetterAndSetterCountryName(){
        //Arrange
        String expectedCountryName = "Mexico";
        //Act
        country.setCountryName(expectedCountryName);
        //Assert
        assertEquals(expectedCountryName, country.getCountryName());
    }
    @Test
    public void testGetterAndSetterStates(){
        //Arrange
        List<State> expectedStates = new ArrayList<>();
        expectedStates.add(new State());
        expectedStates.add(new State());
        int counter = 0;
        for(var state:expectedStates){state.setStateId(counter++);}
        //Act
        country.setStates(expectedStates);
        //Assert
        assertEquals(expectedStates, country.getStates());
        assertEquals(counter,(int)country.getStates().size());
    }

}

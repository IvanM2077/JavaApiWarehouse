package com.project.api.ServicesTest;

import com.project.api.DataAccess.Interfaces.ICityRepository;
import com.project.api.DbTest.DataProvider;
import com.project.api.Model.City;
import com.project.api.Services.Implements.CityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CityServiceTest {
    //Forma 2 de usar Mocks
    private ICityRepository iCityRepository;
    private CityService cityService;

    @BeforeEach
    public void init(){
        this.iCityRepository = mock(ICityRepository.class);
        this.cityService = new CityService(iCityRepository);
    }
    @Test
    public void testGetAll(){
        //arrange
        var cityListExpected = DataProvider.allCities();

        //act
        when(this.iCityRepository.findAll()).thenReturn(DataProvider.allCities());
        var cityListResult = cityService.GetAll();
        //assert
        assertNotNull(cityListResult);
        assertEquals(cityListExpected.size(), cityListResult.size());
        assertSame(cityListExpected, cityListResult);
    }
    @Test
    public void testGetWithId(){
        //arrange
        var expectedCity = DataProvider.getByIdCity();
        var expectedId = 1L;
        when(iCityRepository.findById(anyLong())).thenReturn(Optional.of(DataProvider.getByIdCity()));
        //act
        var result = cityService.GetWithId(expectedId);
        //assert
        assertNotNull(result);
        assertEquals(expectedCity.getCityId(), result.getCityId());

    }
    @Test
    public void testCreate(){
        //arrange
        var expectedCity = DataProvider.createCity();
        //act
        this.cityService.Create(expectedCity);
        //assert
        ArgumentCaptor<City> argumentCaptor = ArgumentCaptor.forClass(City.class);
        verify(this.iCityRepository).save(argumentCaptor.capture());
        assertEquals(expectedCity.getCityName(), argumentCaptor.getValue().getCityName());



    }    @Test
    public void testCreateThrowException(){
        //arrange
        var expectedCity = DataProvider.createCityThrowException();
        //act
        //assert
        assertThrows(IllegalArgumentException.class, ()->{this.cityService.Create(expectedCity);});

    }
    @Test
    public void testUpdate(){

    }
    @Test
    public void testUpdateThrowException(){
        //arrange
        var expectedCity = DataProvider.updateAndDeleteCityThrowException();
        //act
        //assert
        assertThrows(IllegalArgumentException.class, ()->{this.cityService.Create(expectedCity);});

    }
    @Test
    public void testDelete(){

    }
    @Test
    public void testDeleteThrowException(){
        //arrange
        var expectedCity = DataProvider.updateAndDeleteCity();
        //act
        //assert
        assertThrows(IllegalArgumentException.class, ()->{this.cityService.Create(expectedCity);});

    }
    @Test
    public void testBulkCreate(){

    }
    @Test
    public void testBulkCreateThrowException(){
        //arrange
        var expectedList = DataProvider.createCitiesThrowException();
        //act and assert
        assertThrows(IllegalArgumentException.class, ()->{this.cityService.BulkCreate(expectedList);})
    }
    @Test
    public void testBulkUpdate(){

    }
    @Test
    public void testBulkUpdateThrowException(){
        //arrange
        var expectedList = DataProvider.updateAndDeleteCitiesThrowException();
        //act and assert
        assertThrows(IllegalArgumentException.class, ()->{this.cityService.BulkUpdate(expectedList);})

    }
    @Test
    public void testBulkDelete(){

    }
    @Test
    public void testBulkDeleteThrowException(){
        //arrange
        var expectedList = DataProvider.updateAndDeleteCitiesThrowException();
        //act and assert
        assertThrows(IllegalArgumentException.class, ()->{this.cityService.BulkDelete(expectedList);})

    }


}

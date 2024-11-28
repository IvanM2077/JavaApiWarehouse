package com.project.api.ServicesTest;

import com.project.api.DataAccess.Interfaces.IAddressRepository;
import com.project.api.DbTest.DataProvider;
import com.project.api.Services.Implements.AddressService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class  AddressServiceTest {
    //Forma 1 de usar mocks
    @Mock
    private IAddressRepository iAddressRepository;
    @InjectMocks
    private AddressService addressService;
    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAll(){
        //Arrange
        //Act
        when(this.iAddressRepository.findAll()).thenReturn(DataProvider.getAllAddress());

        //Assert

    }
}

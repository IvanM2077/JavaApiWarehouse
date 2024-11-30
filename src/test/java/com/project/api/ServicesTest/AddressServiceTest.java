package com.project.api.ServicesTest;

import com.project.api.DataAccess.Interfaces.IAddressRepository;
import com.project.api.DbTest.DataProvider;
import com.project.api.Model.Address;
import com.project.api.Services.Implements.AddressService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
    public void testGetAll(){
        //Arrange
        var expectedResult =new ArrayList<Address>();
        for(int i =1; i<7 ;i++){var temp = new Address(); temp.setAddressId(i); expectedResult.add(temp);}
        //Act
        when(this.iAddressRepository.findAll()).thenReturn(DataProvider.getAllAddress());
        var actualResult = this.addressService.GetAll();
        //Assert
        assertNotNull(actualResult);
        assertEquals(expectedResult.stream().count(), actualResult.stream().count());
        assertEquals(expectedResult.stream().filter(x->x.getAddressId() ==1).findFirst().get().getAddressId(),actualResult.stream().filter(x->x.getAddressId() ==1).findFirst().get().getAddressId());
    }

    @Test
    public void testGetWithId(){
        //Arrange
        Long expectedAddressId = 1L;
        //Act
        when(this.iAddressRepository.findById(anyLong())).thenReturn(Optional.of(DataProvider.getByIdAddress()));
        var actualResult = this.addressService.GetWithId(expectedAddressId);
        //Assert
        System.out.println(actualResult.getAddressId());

        assertNotNull(actualResult);
        assertEquals(expectedAddressId, actualResult.getAddressId());
    }
    @Test
    public void testCreate(){
        //Arrange
        var expectedAddress = DataProvider.createAddress();
        //Act
        this.addressService.Create(expectedAddress);
        //Assert
        ArgumentCaptor<Address> addressArgumentCaptor = ArgumentCaptor.forClass(Address.class);
        verify(this.iAddressRepository).save(addressArgumentCaptor.capture());
        assertEquals(expectedAddress.getAddressName(), addressArgumentCaptor.getValue().getAddressName());

    }
    @Test
    public void testCreateThrowException(){
        //Arrange
        var expectedAddress = DataProvider.createAddressThrowException();
        //Act
        //this.addressService.Create(expectedAddress);
        //Assert
        //ArgumentCaptor<Address> addressArgumentCaptor = ArgumentCaptor.forClass(Address.class);
        //verify(this.iAddressRepository).save(addressArgumentCaptor.capture());
        assertThrows(IllegalArgumentException.class, ()->this.addressService.Create(expectedAddress));
    }
    @Test
    public void testUpdate(){
        //Arrange
        var expectedAddress = DataProvider.updateAndDeleteAddress();
        when(iAddressRepository.save(expectedAddress)).thenReturn(DataProvider.updateAndDeleteAddress());
        //Act
        this.addressService.Update(expectedAddress);
        //Assert
        ArgumentCaptor<Address> addressArgumentCaptor = ArgumentCaptor.forClass(Address.class);
        verify(this.iAddressRepository).save(addressArgumentCaptor.capture());
        assertEquals(expectedAddress.getAddressId(), addressArgumentCaptor.getValue().getAddressId());

    }
    @Test
    public void testUpdateThrowException(){
        //Arrange
        var expectedAddress = DataProvider.updateAndDeleteAddressThrowException();
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, ()->{this.addressService.Update(expectedAddress);});
    }
    @Test
    public void testDelete(){
        // Arrange
        var expectedAddress = DataProvider.updateAndDeleteAddress();
        doNothing().when(this.iAddressRepository).delete(expectedAddress);
        // Act
        this.addressService.Delete(expectedAddress);
        // Assert
        ArgumentCaptor<Address> addressArgumentCaptor = ArgumentCaptor.forClass(Address.class);
        verify(this.iAddressRepository).delete(addressArgumentCaptor.capture());
        assertEquals(expectedAddress.getAddressId(), addressArgumentCaptor.getValue().getAddressId());

    }
    @Test
    public void testDeleteThrowException(){
        //Arrange
        var expectedAddress = DataProvider.updateAndDeleteAddressThrowException();
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, ()->this.addressService.Delete(expectedAddress));
    }
    @Test
    public void testBulkCreate(){
        //Arrange
        var expectedId = 1L;
        var expectedArrayListAddress = DataProvider.bulkCreateAddress();
        when(iAddressRepository.saveAll(expectedArrayListAddress)).thenReturn(DataProvider.bulkCreateAddress());
        //Act
        this.addressService.BulkCreate(expectedArrayListAddress);
        // Assert
        ArgumentCaptor<List<Address>> addressArgumentCaptor = ArgumentCaptor.forClass(List.class); // Cambiado a captor de listas
        verify(iAddressRepository).saveAll(addressArgumentCaptor.capture());
        assertNotNull(addressArgumentCaptor.getValue());
        assertEquals(expectedArrayListAddress.size(), addressArgumentCaptor.getValue().size());
        System.out.println(expectedArrayListAddress.size());

    }    @Test
    public void testBulkCreateThrowException(){
        //Arrange
        var expectedAddressList = DataProvider.bulkCreateAddressThrowException();
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, ()->{this.addressService.BulkCreate(expectedAddressList);});
    }
    @Test
    public void testBulkUpdate(){
        //Arrange
        //Act
        //Assert
    }    @Test
    public void testBulkUpdateThrowException(){
        //Arrange
        //Act
        //Assert
    }
    @Test
    public void testBulkDelete(){
        //Arrange
        //Act
        //Assert
    }    @Test
    public void testBulkDeleteThrowException(){
        //Arrange
        //Act
        //Assert
    }




}

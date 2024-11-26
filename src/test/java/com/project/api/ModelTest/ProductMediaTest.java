package com.project.api.ModelTest;


import com.project.api.Model.Product;
import com.project.api.Model.ProductMedia;
import jakarta.persistence.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductMediaTest {
    private ProductMedia productMedia;
    @BeforeEach
    public void init(){
        this.productMedia = new ProductMedia();
    }

    @Test
    public void testGetterAndSetterProductMediaId(){
        //Arrange
        Long expectedProductMediaId = 1L;
        //Act
        productMedia.setProductMediaId(expectedProductMediaId);
        //Assert
        assertEquals(expectedProductMediaId, productMedia.getProductMediaId());

    }
    @Test
    public void testGetterAndSetterUrlFile(){
        //Arrange
        String expectedUrlFile = "UrlDir";
        //Act
        productMedia.setUrlFile(expectedUrlFile);
        //Assert
        assertEquals(expectedUrlFile, productMedia.getUrlFile());
    }
    @Test
    public void testGetterAndSetterMediaType(){
        //Arrange
        String expectedMediaType = "TipoArchivo";
        //Act
        productMedia.setMediaType(expectedMediaType);
        //Assert
        assertEquals(expectedMediaType, productMedia.getMediaType());
    }


    @Test
    public void testGetterAndSetterProduct(){
        //Arrange
        Product expectedProduct = new Product();
        expectedProduct.setProductId(1L);
        //Act
        productMedia.setProduct(expectedProduct);
        //Assert
        assertEquals(expectedProduct, productMedia.getProduct());
    }
}

package com.project.api;

import com.project.api.Model.Calculadora;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
class ApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void TestCalculadoraSuma() {
		// Arrange
		Calculadora calculadora = new Calculadora();
		int a = 1;
		int b = 1;
		int expectedResult = 2;
		// Act
		int actualResult = calculadora.resultSuma(a, b);
		// Assert
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCalculadoraRest() {
		// Arrange
		Calculadora calculadora = new Calculadora();
		int a = 1;
		int b = 1;
		int expectedResult = 0;
		// Act
		int actualResult = calculadora.resultRest(a, b);
		// Assert
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCalculadoraMultiply() {
		// Arrange
		Calculadora calculadora = new Calculadora();
		int a = 1;
		int b = 1;
		int expectedResult = 1;
		// Act
		int actualResult = calculadora.resultMultiply(a, b);
		// Assert
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@Test
	void testCalculadoraDivide() {
		// Arrange
		Calculadora calculadora = new Calculadora();
		int a = 1;
		int b = 1;
		int expectedResult = 1;
		// Act
		int actualResult = calculadora.resultDivide(a, b);
		// Assert
		Assertions.assertEquals(expectedResult, actualResult);
	}
}

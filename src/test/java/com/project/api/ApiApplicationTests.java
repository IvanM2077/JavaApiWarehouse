package com.project.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiApplicationTests {

	@Test
	public void testCommit(){
		//ARRANGE
		int number =1;

		//ACT

		//ASSERT
		Assertions.assertEquals(1,number);
	}
}

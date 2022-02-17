package com.JUnitTest.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.JUnitTest.calculadora.Calculadora;

class CalculadoraTest {
	
	Calculadora calculum;

	@BeforeEach  //CREACION DE LA INSTANCIA CON EL TEST BEFORE
	public void before() {
		System.out.println("Instancia creada correctamente");
		calculum = new Calculadora();
		
		calculum = new Calculadora(4);
		System.out.println(calculum.getId());
	}

	@AfterEach
	public void after() {
		System.out.println("All right");
		
	}

	@Test
	public void getName() {
		calculum.setId(4);
		String name = calculum.getNom();
		String result = "Rectangulo";
		assertEquals(result, name);
		System.out.println(name);
	}
	
	@Test
	public void 
}

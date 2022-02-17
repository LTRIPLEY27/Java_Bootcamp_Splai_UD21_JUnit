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

	@Test//TEST VERIFICA NOMBRE FIGURA
	public void testGetName() {
		calculum.setId(4);
		String name = calculum.getNom();
		String result = "Rectangulo";
		assertEquals(result, name);
		System.out.println(name);
	}
	
	@Test
	public void testGetAreaCuadrado() {
		int cuadrado = calculum.areacuadrado(6);
		int result = 36;
		assertEquals(result, cuadrado);
	}
	
	@Test
	public void testGetAreaCirculo() {
		int circulo = (int) calculum.areaCirculo(9);
		double result = 254.0;
		assertEquals(result, circulo);
	}
	
	
}

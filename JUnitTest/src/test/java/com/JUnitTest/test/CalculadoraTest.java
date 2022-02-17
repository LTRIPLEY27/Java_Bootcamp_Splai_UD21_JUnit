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
	}

	@AfterEach
	public void after() {
		System.out.println("All right");
		
	}

	@Test//TEST VERIFICA NOMBRE FIGURA
	public void testGetName() {
		calculum.setNom("Rombo");
		String name = calculum.getNom();
		String result = "Rombo";
		assertEquals(result, name);
		System.out.println(name);
	}
	
	@Test//TEST VERIFICA AREACUADRADO
	public void testGetAreaCuadrado() {
		int cuadrado = calculum.areacuadrado(6);
		int result = 36;
		assertEquals(result, cuadrado);
	}
	
	@Test//TEST VERIFICA AREACIRCULO
	public void testGetAreaCirculo() {
		int circulo = (int) calculum.areaCirculo(9);
		double result = 254.0;
		assertEquals(result, circulo);
	}
	
	@Test//TEST VERIFICA AREATRIANGULO
	public void testGetAreaTriangulo() {
		int triangulo = calculum.areatriangulo(4, 4);
		int result = 8;
		assertEquals(result, triangulo);
	}
	
	@Test//TEST VERIFICA AREARECTANGULO
	public void testGetAreaRectangulo() {
		int rectangulo = calculum.arearectangulo(5, 5);
		int result = 25;
		assertEquals(result, rectangulo);
	}
	
	@Test//TEST VERIFICA AREAPENTAGONO
	public void testGetAreaPentagono() {
		int pentagono = calculum.areapentagono(6, 6);
		int result = 18;
		assertEquals(result, pentagono);
	}
	
	@Test//TEST VERIFICA AREAROMBO
	public void testGetAreaRombo() {
		int rombo = calculum.areapentagono(7, 7);
		int result = 24;
		assertEquals(result, rombo);
	}
	
	@Test//TEST VERIFICA AREAROMBOIDE
	public void testGetAreaRomboide() {
		int romboide = calculum.arearomboide(8, 8);
		int result = 64;
		assertEquals(result, romboide);
	}
	
	@Test//TEST VERIFICA AREATRAPECIO
	public void testGetAreaTrapecio() {
		int trapecio = calculum.areatrapecio(9, 9, 9);
		int result = 81;
		assertEquals(result, trapecio);
	}
	
	@Test//TEST VERIFICA ID
	public void testGetID() {
		calculum.setId(5);
		int id = calculum.getId();
		int result = 5;
		assertEquals(result, id);
	}
	
	@Test//TEST VERIFICA figura
	public void testGetFigura() {
		String figura = calculum.figura(6);
		String result = "Rombo";
		assertEquals(result, figura);
	}
	
	@Test//TEST VERIFICA TOSTRING
	public void testGetToString() {
		calculum = new Calculadora(1);
		calculum.setArea(calculum.areacuadrado(9));
		String cuadrado = calculum.toString();
		String result = "Geometria [id=" + 1 + ", nom=cuadrado" + ", area=" + 81.0 + "]";
		assertEquals(result, cuadrado);
	}
}

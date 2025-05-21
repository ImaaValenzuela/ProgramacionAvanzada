package imaavalenzuela.figuras;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import imaavalenzuela.figuras.model.*;
import imaavalenzuela.figuras.model.figuras.*;

class FigurasTest {

	@Test
	void debeMoverPunto() {
		// Given
		Punto punto = new Punto(1,2);
		
		// When
		punto.mover(1, -1);
		
		// Then
		assertEquals(2, punto.getX());
		assertEquals(1, punto.getY());
	}
	
	@Test
	void debeCalcularAreaRectangulo() {
		// Given
		Rectangulo rectangulo = new Rectangulo(new Punto(0,0), new Punto (4, 5));
		
		
		// When
		double area = rectangulo.calcularArea();
		
		// Then
		assertEquals(20, area);
	}
	
	@Test
	void debeCalcularAreaElipse() {
		// Given
		Elipse elipse = new Elipse(new Punto(0,0), 3, 2);
		
		
		// When
		double area = elipse.calcularArea();
		
		// Then
		assertEquals(Math.PI * 3 * 2, area);
	}
	
	@Test
	void debeMoverFigura() {
		// Given
		Cuadrado cuadrado = new Cuadrado(new Punto (0,0), 2);
		
		
		// When
		cuadrado.mover(1, 1);
		
		// Then
		assertEquals(1, cuadrado.getEsquinaInferior().getX());
		assertEquals(1, cuadrado.getEsquinaInferior().getY());
	}
	
	@Test
	void debeOrdenarFiguras() {
		// Given
		ArrayList<Figura> figuras = new ArrayList<>();
		
		// When
        figuras.add(new Circulo(new Punto(0, 0), 2)); // area ~12.56
        figuras.add(new Cuadrado(new Punto(0, 0), 3)); // area = 9
        figuras.add(new Rectangulo(new Punto(0, 0), new Punto(1, 1))); // area = 1
		
        Collections.sort(figuras);
        
		// Then
        assertTrue(figuras.get(0).calcularArea() < figuras.get(1).calcularArea());
        assertTrue(figuras.get(1).calcularArea() < figuras.get(2).calcularArea());
	}
}

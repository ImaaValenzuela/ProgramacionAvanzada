package imaavalenzuela.torneoarqueria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import imaavalenzuela.torneoarqueria.model.Disparo;

class DisparoTest {

	@Test
	void debeCalcularDistanciaCorrectamente() {
		// Given
		Disparo disparo = new Disparo(1, 1);
		
		// When
		double distancia = disparo.calcularDistancia();
		
		// Then
		assertEquals(1, (int) distancia); // Casteo para que sea mas facil de testear
	}
	
	@Test
	void debeTenerPuntajeValido() {
		// Given
		Disparo disparo = new Disparo(1, 1);
		
		// When
		int puntaje = disparo.getPuntaje();
		
		// Then
		assertTrue(disparo.esValido());
	}
	
	@Test 
	void debeCalcularPuntaje() {
		// Given
		Disparo disparo = new Disparo (1, 1);
		
		// When
		int puntaje = disparo.calcularPuntaje();
		
		// Then
		assertEquals(1000, puntaje);
	}

}

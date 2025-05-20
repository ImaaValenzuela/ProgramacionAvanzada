package imaavalenzuela.torneoarqueria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import imaavalenzuela.torneoarqueria.model.Arquero;
import imaavalenzuela.torneoarqueria.model.Disparo;

class ArqueroTest {
	
	@Test
	void debeAgregarDisapro() {
		// Given
		Arquero arquero = new Arquero(1);
		Disparo disparo = new Disparo(2,2);
		
		// When
		arquero.agregarDisparo(disparo);
		
		// Then
		assertEquals(1, arquero.getDisparos().size());
	}
	
	@Test
	void debeLanzarExcepcionSiHayMenosDeCincoDisparos() {
		// Given
		Arquero arquero = new Arquero (1);
		Disparo disparo = new Disparo (2,2);
		Disparo disparo2 = new Disparo (2,2);
		Disparo disparo3 = new Disparo (2,2);
		Disparo disparo4 = new Disparo (2,2);
		
		// When
		arquero.agregarDisparo(disparo);
		arquero.agregarDisparo(disparo2);
		arquero.agregarDisparo(disparo3);
		arquero.agregarDisparo(disparo4);
		
		// Then
		try {
			arquero.calcularPuntajeTotal();
			fail("No se lanzo excepcion");
		} catch (Exception e) {
			assertTrue(e.getMessage().contains("descalificado"));
		}
	}
	
	@Test
	void debeCalcularPuntajeTotal() throws Exception {
	   // Given
		Arquero arquero = new Arquero(1);

		// When
	    arquero.agregarDisparo(new Disparo(1, 0)); // 1000
	    arquero.agregarDisparo(new Disparo(5, 0));   // 1000
	    arquero.agregarDisparo(new Disparo(15, 0));  // 500
	    arquero.agregarDisparo(new Disparo(20, 0)); // 500
	    arquero.agregarDisparo(new Disparo(25, 0)); // 100
	    arquero.agregarDisparo(new Disparo(30, 0)); // 100

	    int puntaje = arquero.calcularPuntajeTotal();

	    
	    // Then
	    assertEquals(3200, puntaje);
	}

}

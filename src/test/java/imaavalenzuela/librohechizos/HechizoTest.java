package imaavalenzuela.librohechizos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import imaavalenzuela.librohechizos.model.Hechizo;
import imaavalenzuela.librohechizos.model.hechizos.Agrandar;
import imaavalenzuela.librohechizos.model.Hechizable;
import imaavalenzuela.librohechizos.model.hechizable.Animal;

class HechizoTest {

	@Test
	void debePonerNombreEnMinusculaAgrandar() {
		// Given
		Hechizo hechizo = new Agrandar("AGRANDACION");
		// When
		
		// Then
		assertEquals("agrandacion", hechizo.getNombre());
	}
	
	@Test 
	void debeNoAgregarHechizoNulo() {
		//Given
		Hechizo hechizo = new Agrandar("");
		Hechizable hechizable = new Animal();
		
		// When
		hechizo.aplicarHechizo(hechizable);
		
		// Then
		assertNull(hechizable.getEstado());
	}

}

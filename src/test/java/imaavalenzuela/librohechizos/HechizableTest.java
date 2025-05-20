package imaavalenzuela.librohechizos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import imaavalenzuela.librohechizos.model.Hechizable;
import imaavalenzuela.librohechizos.model.hechizable.Animal;

class HechizableTest {

	@Test
	void debeCambiarEstado() {
		// Given
		Hechizable hechizable = new Animal();
		
		// When
		hechizable.setEstado("Agrandar");
		
		// Then
		assertEquals("Agrandar", hechizable.getEstado());
		
	}

}

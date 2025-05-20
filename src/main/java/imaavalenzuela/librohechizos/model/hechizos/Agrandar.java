package imaavalenzuela.librohechizos.model.hechizos;

import imaavalenzuela.librohechizos.model.Hechizable;
import imaavalenzuela.librohechizos.model.Hechizo;

public class Agrandar implements Hechizo{

	private String nombre;
	
	
	
	public Agrandar(String nombre) {
		super();
		this.nombre = nombre.toLowerCase();
	}

	@Override
	public void aplicarHechizo(Hechizable hechizable) {
		// TODO Auto-generated method stub
		hechizable.setEstado("Ahora soy más grande");
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}

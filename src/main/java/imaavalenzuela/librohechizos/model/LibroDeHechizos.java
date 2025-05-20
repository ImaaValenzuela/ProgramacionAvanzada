package imaavalenzuela.librohechizos.model;

import java.util.HashMap;
import java.util.Map;

public class LibroDeHechizos {

	private Map<String, Hechizo> hechizos = new HashMap<>();
	
	public void agregarHechizo(Hechizo hechizo) {
		// TODO Auto-generated method stub
		hechizos.put(hechizo.getNombre().toLowerCase(), hechizo);
	}

	public Hechizo buscar(String nombreHechizo) {
		// TODO Auto-generated method stub
		return hechizos.get(nombreHechizo.toLowerCase());
	}

}

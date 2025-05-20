package imaavalenzuela.librohechizos.model.hechizos;

import imaavalenzuela.librohechizos.model.Hechizable;
import imaavalenzuela.librohechizos.model.Hechizo;

public class Expelliarmus implements Hechizo{

	@Override
	public void aplicarHechizo(Hechizable hechizable) {
		// TODO Auto-generated method stub
		hechizable.setEstado("Me desarmaron");
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "expelliarmus";
	}
	
	

}
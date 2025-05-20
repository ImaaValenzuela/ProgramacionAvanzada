package imaavalenzuela.librohechizos.model.hechizable;

import imaavalenzuela.librohechizos.model.Hechizable;

public class Animal implements Hechizable {
	
	private String estado;

	@Override
	public String getEstado() {
		// TODO Auto-generated method stub
		return estado;
	}

	@Override
	public void setEstado(String estado) {
		// TODO Auto-generated method stub
		this.estado = estado;
	}

}

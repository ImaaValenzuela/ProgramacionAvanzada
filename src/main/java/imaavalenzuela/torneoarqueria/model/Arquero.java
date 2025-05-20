package imaavalenzuela.torneoarqueria.model;

import java.util.ArrayList;
import java.util.List;

public class Arquero{
	
	private int numero;
	private List<Disparo> disparos;
	
	public Arquero(int numero) {
		this.numero = numero;
		this.disparos = new ArrayList<>();
	}

	public void agregarDisparo(Disparo disparo) {
		if(disparo.esValido()) {
			disparos.add(disparo);
		}
	}
	
	public int calcularPuntajeTotal() throws Exception {
		if(disparos.size() < 5) {
			throw new Exception ("Participante " + numero + " descalificado: menos de 5 tiros válidos.");
		}

		// Ordenar de mayor a menor puntaje
		disparos.sort((d1, d2) -> Integer.compare(d2.getPuntaje(), d1.getPuntaje()));
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total += disparos.get(i).getPuntaje();
		}
		
		return total;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Disparo> getDisparos() {
		return disparos;
	}

	public void setDisparos(List<Disparo> disparos) {
		this.disparos = disparos;
	}
	
}

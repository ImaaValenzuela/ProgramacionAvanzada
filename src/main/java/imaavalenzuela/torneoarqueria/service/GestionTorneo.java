package imaavalenzuela.torneoarqueria.service;

import java.util.ArrayList;
import java.util.List;

import imaavalenzuela.torneoarqueria.model.Arquero;

public class GestionTorneo {
	private List<Arquero> participantes = new ArrayList<>();
	
	public void agregarParticipante(Arquero arquero) {
		participantes.add(arquero);
	}
	
	public String mostrarPodio() {
	    List<Resultado> resultados = new ArrayList<>();

	    for (Arquero arquero : participantes) {
	        try {
	            int puntaje = arquero.calcularPuntajeTotal();
	            resultados.add(new Resultado(arquero, puntaje));
	        } catch (Exception e) {
	            return "Descalificados";
	        }
	    }

	    resultados.sort((r1, r2) -> Integer.compare(r2.puntaje, r1.puntaje)); // Orden descendente

	    StringBuilder podio = new StringBuilder();
	    for (int i = 0; i < 3 && i < resultados.size(); i++) {
	        podio.append((i + 1))
	             .append("° puesto: Arquero ")
	             .append(resultados.get(i).arquero.getNumero())
	             .append(" con ")
	             .append(resultados.get(i).puntaje)
	             .append(" puntos.\n");
	    }

	    return podio.toString();
	}

	
	private static class Resultado {
	    Arquero arquero;
	    int puntaje;

	    Resultado(Arquero arquero, int puntaje) {
	        this.arquero = arquero;
	        this.puntaje = puntaje;
	    }
	}

}



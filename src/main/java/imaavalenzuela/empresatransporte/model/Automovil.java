package imaavalenzuela.empresatransporte.model;

import java.util.HashSet;
import java.util.Set;

public class Automovil extends Vehiculo {

    public Automovil() {
        this.volumenMaximo = 2.0;
        this.pesoMaximo = 500;
    }

    @Override
    public boolean puedeTransportar(Paquete paquete) {
        double volumenTotal = 0;
        double pesoTotal = 0;
        Set<String> destinos = new HashSet<>();

        for (Paquete p : paquetes) {
            volumenTotal += p.calcularVolumen();
            pesoTotal += p.getPeso();
            destinos.add(p.getDestino());
        }

        boolean destinoYaExiste = destinos.contains(paquete.getDestino());

        if (destinoYaExiste) return false;

        boolean excedeLimiteDestinos = destinos.size() == 3 && !destinos.contains(paquete.getDestino());

        return !excedeLimiteDestinos &&
                (volumenTotal + paquete.calcularVolumen() <= volumenMaximo) &&
                (pesoTotal + paquete.getPeso() <= pesoMaximo);
    }
}

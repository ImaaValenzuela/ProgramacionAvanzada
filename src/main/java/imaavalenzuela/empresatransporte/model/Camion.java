package imaavalenzuela.empresatransporte.model;

public class Camion extends Vehiculo {

    public Camion() {
        this.volumenMaximo = 20;
        this.pesoMaximo = 16000;
    }

    @Override
    public boolean puedeTransportar(Paquete paquete) {
        double volumenActual = 0;
        double pesoActual = 0;

        for (Paquete p : paquetes) {
            if (p != null) {
                volumenActual += p.calcularVolumen();
                pesoActual += p.getPeso();
            }
        }

        return (volumenActual + paquete.calcularVolumen() <= volumenMaximo)
                && (pesoActual + paquete.getPeso() <= pesoMaximo);
    }
}

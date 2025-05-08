package imaavalenzuela.empresatransporte.model;

public class Camion extends Vehiculo {

    public Camion() {
        this.volumenMaximo = 20.0;
        this.pesoMaximo = 16000;
    }

    @Override
    public boolean puedeTransportar(Paquete paquete) {
        double volumenTotal = 0;
        double pesoTotal = 0;

        for (Paquete p : paquetes) {
            volumenTotal += p.calcularVolumen();
            pesoTotal += p.getPeso();
        }

        return (volumenTotal + paquete.calcularVolumen() <= volumenMaximo) &&
                (pesoTotal + paquete.getPeso() <= pesoMaximo);
    }
}

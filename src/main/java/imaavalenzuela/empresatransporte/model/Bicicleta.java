package imaavalenzuela.empresatransporte.model;

public class Bicicleta extends Vehiculo {
    private String destino;

    public Bicicleta() {
        this.volumenMaximo = 0.125;
        this.pesoMaximo = 15;
    }

    @Override
    public boolean puedeTransportar(Paquete paquete) {
        double volumenTotal = 0;
        double pesoTotal = 0;

        for (Paquete p : paquetes) {
            volumenTotal += p.calcularVolumen();
            pesoTotal += p.getPeso();
        }

        boolean mismoDestino = destino == null || destino.equals(paquete.getDestino());
        return mismoDestino &&
                (volumenTotal + paquete.calcularVolumen() <= volumenMaximo * 2) &&
                (pesoTotal + paquete.getPeso() <= pesoMaximo);
    }

    @Override
    public void agregarPaquete(Paquete paquete) {
        if (destino == null) {
            destino = paquete.getDestino();
        }
        super.agregarPaquete(paquete);
    }
}

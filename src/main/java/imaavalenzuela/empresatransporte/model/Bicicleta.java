package imaavalenzuela.empresatransporte.model;

public class Bicicleta extends Vehiculo{
    private String destino;

    public Bicicleta() {
        this.volumenMaximo = 0.125 * 2; // Cumpliendo que solo puede llevar dos paquetes.
        this.pesoMaximo = 15;
    }

    @Override
    public boolean puedeTransportar(Paquete paquete) {
        double volumenActual = 0;
        double pesoActual = 0;
        int cantidadPaquetes = 0;

        for(Paquete paq : paquetes) {
            if(paq != null){
                volumenActual = volumenActual + paq.calcularVolumen();
                pesoActual = pesoActual + paq.getPeso();
                cantidadPaquetes++;
            }
        }

        if (cantidadPaquetes >= 2){
            return false;
        }

        if (destino== null){
            destino = paquete.getDestino();
        }

        return paquete.calcularVolumen() <= 0.125
                && (volumenActual + paquete.calcularVolumen() <= pesoMaximo) &&
                (pesoActual + paquete.getPeso() <= pesoMaximo)
                && destino.equals(paquete.getDestino());
    }
}

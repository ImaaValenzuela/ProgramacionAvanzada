package imaavalenzuela.empresatransporte.model;

public class Automovil extends Vehiculo {
    private String[] destinos = new String[3]; // Tendria que ser final? Preguntar.

    public Automovil() {
        this.volumenMaximo = 2;
        this.pesoMaximo = 500;
    }

    @Override
    public boolean puedeTransportar(Paquete paquete) {
        double volumenActual = 0;
        double pesoActual = 0;
        int ciudadesUsadas = 0;

        for (Paquete p : paquetes) {
            if (p != null) {
                volumenActual += p.calcularVolumen();
                pesoActual += p.getPeso();
            }
        }

        boolean destinoExiste = false;
        for (String d : destinos) {
            if (d != null && d.equals(paquete.getDestino())) {
                destinoExiste = true;
                break;
            }
        }

        if (!destinoExiste) {
            for (int i = 0; i < destinos.length; i++) {
                if (destinos[i] == null) {
                    destinos[i] = paquete.getDestino();
                    destinoExiste = true;
                    break;
                }
            }
        }

        return destinoExiste
                && (volumenActual + paquete.calcularVolumen() <= volumenMaximo)
                && (pesoActual + paquete.getPeso() <= pesoMaximo);
    }
}
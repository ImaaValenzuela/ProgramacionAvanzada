package imaavalenzuela.empresatransporte.model;

public abstract class Vehiculo {
    protected Paquete[] paquetes = new Paquete[10]; // Valor por default 10.
    protected double volumenMaximo;
    protected double pesoMaximo;

    public abstract boolean puedeTransportar(Paquete paquete);

    public void agregarPaquete(Paquete paquete){
        if (puedeTransportar(paquete)){
            for (int i = 0; i < paquetes.length; i++){
                if (paquetes[i] == null) {
                    paquetes[i] = paquete;
                    break;
                }
            }
        }
    }

}

package imaavalenzuela.empresatransporte.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    protected List<Paquete> paquetes = new ArrayList<>();
    protected double volumenMaximo;
    protected double pesoMaximo;

    public abstract boolean puedeTransportar(Paquete paquete);

    public void agregarPaquete(Paquete paquete){
        if (puedeTransportar(paquete)){
            paquetes.add(paquete);
            }
    }

    public List<Paquete> getPaquetes(){
        return paquetes;
    }
}


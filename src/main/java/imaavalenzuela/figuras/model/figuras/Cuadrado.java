package imaavalenzuela.figuras.model.figuras;

import imaavalenzuela.figuras.model.Punto;

public class Cuadrado extends Rectangulo{

    public Cuadrado(Punto esquinaInferiorIzquierda, double lado) {
        super(esquinaInferiorIzquierda,
              new Punto(esquinaInferiorIzquierda.getX() + lado, esquinaInferiorIzquierda.getY() + lado));
    }

}

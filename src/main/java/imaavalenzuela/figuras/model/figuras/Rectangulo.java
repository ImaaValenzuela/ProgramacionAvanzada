package imaavalenzuela.figuras.model.figuras;

import imaavalenzuela.figuras.model.Figura;
import imaavalenzuela.figuras.model.Punto;

public class Rectangulo extends Figura{

	private Punto esquinaInferior;
	private Punto esquinaSuperior;
	
	
	
	public Rectangulo(Punto esquinaInferior, Punto esquinaSuperior) {
		super();
		this.esquinaInferior = esquinaInferior;
		this.esquinaSuperior = esquinaSuperior;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		double base = esquinaSuperior.getX() - esquinaInferior.getX();
		double altura = esquinaSuperior.getY() - esquinaInferior.getY();
		return base * altura;
	}

	@Override
	public void mover(double x, double y) {
		// TODO Auto-generated method stub
		esquinaSuperior.mover(x, y);
		esquinaInferior.mover(x, y);
		
	}

	public Punto getEsquinaInferior() {
		return esquinaInferior;
	}

	public void setEsquinaInferior(Punto esquinaInferior) {
		this.esquinaInferior = esquinaInferior;
	}

	public Punto getEsquinaSuperior() {
		return esquinaSuperior;
	}

	public void setEsquinaSuperior(Punto esquinaSuperior) {
		this.esquinaSuperior = esquinaSuperior;
	}
	
	

}

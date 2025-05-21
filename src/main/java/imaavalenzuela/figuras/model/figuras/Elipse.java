package imaavalenzuela.figuras.model.figuras;

import imaavalenzuela.figuras.model.Figura;
import imaavalenzuela.figuras.model.Punto;

public class Elipse extends Figura{

	private Punto centro;
	private double radioMayor;
	private double radioMenor;
	
	
	
	public Elipse(Punto centro, double radioMayor, double radioMenor) {
		super();
		this.centro = centro;
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * radioMayor * radioMenor;
	}

	@Override
	public void mover(double x, double y) {
		// TODO Auto-generated method stub
		centro.mover(x, y);;
	}
	
	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(double radioMenor) {
		this.radioMenor = radioMenor;
	}

}

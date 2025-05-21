package imaavalenzuela.figuras.model;

public abstract class Figura implements Comparable <Figura>{ // Generico
	
	public abstract double calcularArea();
	
	public abstract void mover(double x, double y);
	
	@Override
	public int compareTo(Figura otra) {
		return Double.compare(this.calcularArea(), otra.calcularArea());
	}
	
	
}

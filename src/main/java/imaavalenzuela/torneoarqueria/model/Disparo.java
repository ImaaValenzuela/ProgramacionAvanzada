package imaavalenzuela.torneoarqueria.model;

public class Disparo {
	private double x;
	private double y;
	private int puntaje;
	
	
	public Disparo(double x, double y) {
		this.x = x;
		this.y = y;
		this.puntaje = calcularPuntaje();
	}
	
	public double calcularDistancia() {
		return Math.sqrt(x * x + y * y); 
	}
	
	public int calcularPuntaje() {
        double distancia = calcularDistancia();
        if (distancia <= 10) return 1000;
        if (distancia <= 20) return 500;
        if (distancia <= 30) return 200;
        if (distancia <= 40) return 100;
        if (distancia <= 50) return 50;
        return 0;
	}
	
	public boolean esValido(){
		return puntaje > 0;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getPuntaje() {
		return puntaje;
	}
	
}

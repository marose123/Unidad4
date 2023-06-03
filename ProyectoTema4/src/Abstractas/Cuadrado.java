
package Abstractas;

public class Cuadrado extends Figura {
	
	public Cuadrado(String nom, String col,double lado,String color) {
		super(nom, col);
		this.lado=lado;
		this.color=color;
		// TODO Auto-generated constructor stub
	}
	private double lado;
	private String color;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double area() {
		return(lado*lado);
	}
	@Override
    public String toString() {
        return "Cuadrado [lado=" + lado + ", color=" + color + ", area=" + area() + "]";
    }
}
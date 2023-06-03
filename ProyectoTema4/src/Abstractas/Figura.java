
package Abstractas;

public abstract class Figura {

	private String nomfig;
	private String color;
	
	public Figura(String nom, String col) {
	this.nomfig=nomfig;
	this.color=col;
	}
	public abstract double area(); {

	}
	public String getNomfig() {
		return nomfig;
	}

	public void setNomfig(String nomfig) {
		this.nomfig = nomfig;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
package Abstractas;

public class Rectangulo extends Figura {
    private double base;
    private double altura;
    private String color;

    public Rectangulo(String nom, String col, double base, double altura, String color) {
        super(nom, col);
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return base * altura;
    }
    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + ", color=" + color + ", area=" + area() + "]";
    }
}
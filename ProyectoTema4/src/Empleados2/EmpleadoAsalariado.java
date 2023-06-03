package Empleados2;

public class EmpleadoAsalariado extends Empleados {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nss, String nombre, String apellido, double salario) {
        super(nss, nombre, apellido);
        setSalarioSemanal(salario);
    }

    public void setSalarioSemanal(double salario) {
        salarioSemanal = (salario < 0.0) ? 0.0 : salario;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public double ingresos() {
        return getSalarioSemanal();
    }

    public String toString() {
        return "EMPLEADO ASALARIADO\n" + super.toString() + "\nSalario semanal: " + getSalarioSemanal();
    }
}

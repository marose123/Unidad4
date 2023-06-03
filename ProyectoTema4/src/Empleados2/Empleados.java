package Empleados2;

public abstract class Empleados {
private String primerNombre;
private String apellidoPaterno;
private String numeroSeguroSocial;
public Empleados(String nss, String nombre, String apellido ){
numeroSeguroSocial = nss;
primerNombre = nombre;
apellidoPaterno = apellido;
} 
// getter & setter
public String toString() {
return "Empleado [primerNombre=" + primerNombre + ", apellidoPaterno=" + apellidoPaterno+ ", numeroSeguroSocial=" + numeroSeguroSocial + "]";
}
public abstract double ingresos();
}

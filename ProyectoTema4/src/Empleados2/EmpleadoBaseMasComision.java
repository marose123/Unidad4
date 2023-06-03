package Empleados2;


public class EmpleadoBaseMasComision extends
EmpleadoPorHoras {
private double salarioBase; 
public EmpleadoBaseMasComision( String nombre, 
String apellido, String nss, double ventas, 
double tarifa, double salario ){
super( nombre, apellido, nss, ventas, tarifa );
setSalarioBase( salario ); 
} 
public void setSalarioBase( double salario ){
salarioBase = ( salario < 0.0 ) ? 0.0 : salario; 
} 
public double getSalarioBase(){
return salarioBase;
} 
public double ingresos() {
return getSalarioBase() + super.ingresos();
} 
public String toString(){
return "CON SALARIO BASE\n"+super.toString()+"\nSalario base:"+getSalarioBase() ;
}
}
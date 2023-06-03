package Empleados2;

public class EmpleadoPorHoras extends Empleados {
private double sueldo; 
private double horas; 
public EmpleadoPorHoras( String nombre, String apellido, String nss, 
double sueldoPorHoras, double horasTrabajadas ){
super( nombre, apellido, nss );
setSueldo( sueldoPorHoras ); 
setHoras( horasTrabajadas ); 
} 
public void setSueldo( double sueldoPorHoras ){
sueldo = ( sueldoPorHoras < 0.0 ) ? 0.0 : sueldoPorHoras;
} 
public double getSueldo(){
return sueldo;
} 
public void setHoras( double horasTrabajadas ){
horas = ( ( horasTrabajadas >= 0.0 ) && ( horasTrabajadas <= 168.0 ) ) 
?
horasTrabajadas : 0.0;
} 
public double getHoras(){
return horas;
} 
public double ingresos(){
if ( getHoras() <= 40 )
return getSueldo() * getHoras();
else
return 40 * getSueldo() + ( getHoras() - 40 ) * getSueldo() * 1.5;
} 
public String toString() {
    return "EMPLEADO POR HORAS\n" + super.toString() + "\nSueldo por hora: " + getSueldo() + "\nHoras trabajadas: " + getHoras();
}
}
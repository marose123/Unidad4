package Empleados2;

public class EmpleadoPorComision extends Empleados{
private double ventasBrutas; 
private double tarifaComision; 
public EmpleadoPorComision( String nombre, String apellido, 
String nss, double ventas, double tarifa ){
super( nombre, apellido, nss );
setVentasBrutas( ventas );
setTarifaComision( tarifa );
} 
public void setTarifaComision( double tarifa ){
tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa
: 0.0;
}
public double getTarifaComision(){
return tarifaComision;
}
public void setVentasBrutas( double ventas ){
ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
}
public double getVentasBrutas(){
return ventasBrutas;
}
public double ingresos(){
return getTarifaComision() * getVentasBrutas();
} 
public String toString(){
return "EMPLEADO POR COMISION\n"+super.toString()+"\nVentasbrutas: "+getVentasBrutas()+"\nTarifa de comision: "+getTarifaComision();
}
}
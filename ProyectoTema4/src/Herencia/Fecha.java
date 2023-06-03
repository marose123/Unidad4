
package Herencia;

public class Fecha {
    private byte dia;
	private byte mes;
	private int año;
	
	public Fecha () {}
	
	public Fecha (byte dia,byte mes,short año) {
		
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	}

	public Fecha(byte leerByte, byte leerByte2, int leerInt) {
		// TODO Auto-generated constructor stub
	}

	public byte getDia() {
		return dia;
	}

	public void setDia(byte dia) {
		this.dia = dia;
	}

	public byte getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	public short getaño() {
		return (short) año;
	}

	public void setaño(short año) {
		this.año = año;
	}
	
	public String toString () {
		return "DIA:"+dia+"de mes:"+mes+"del año:"+año;
		
		
	}
}

package Empleados2;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuEmpleados {

    public static void main(String[] args) {
        List<String> menu = Arrays.asList(
                "Empleado Asalariado", "Empleado por Horas", "Empleado Base más Comisión",
                "Empleado por Comisión", "Impresion", "Salir"
        );
        menuOrdenamiento(menu);
    }

    public static String boton(List<String> menu) {
        String[] valores = menu.toArray(new String[0]);
        String opcion = (String) JOptionPane.showInputDialog(null, "SELECCIONA UNA OPCIÓN", "M E N U",
                JOptionPane.QUESTION_MESSAGE, null,
                valores, valores[0]);
        return opcion;
    }

    public static void menuOrdenamiento(List<String> menu) {
        Empleados[] arrFig = new Empleados[10];
        int j = 0;

        String sel = "";
        do {
            sel = boton(menu);
            switch (sel) {
                case "Empleado Asalariado":
                    sel = "Empleado Asalariado";
                    EmpleadoAsalariado empleadoAsalariado = ingresarDatosEmpleadoAsalariado();
                    arrFig[j] = empleadoAsalariado;
                    j++;
                    break;

                case "Empleado por Horas":
                    sel = "Empleado por Horas";
                    EmpleadoPorHoras empleadoPorHoras = ingresarDatosEmpleadoPorHoras();
                    arrFig[j] = empleadoPorHoras;
                    j++;
                    break;

                case "Empleado Base más Comisión":
                    sel = "Empleado Base más Comisión";
                    EmpleadoBaseMasComision empleadoBaseMasComision = ingresarDatosEmpleadoBaseMasComision();
                    arrFig[j] = empleadoBaseMasComision;
                    j++;
                    break;

                case "Empleado por Comisión":
                    sel = "Empleado por Comisión";
                    EmpleadoPorComision empleadoPorComision = ingresarDatosEmpleadoPorComision();
                    arrFig[j] = empleadoPorComision;
                    j++;
                    break;

                case "Impresion":
                    String acumulador = "";
                    for (int k = 0; k < j; k++) {
                        acumulador += "\n" + arrFig[k];
                    }
                    Tools.imprimePantalla(acumulador);
                    break;

                case "Salir":
                    imprimePantalla("Saliendo del programa...");
                    break;

                default:
                    imprimePantalla("Opción inválida");
                    break;
            }
        } while (!sel.equals("Salir"));
    }

    public static void imprimePantalla(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static EmpleadoAsalariado ingresarDatosEmpleadoAsalariado() {
        String nss = JOptionPane.showInputDialog(null, "Ingrese el número de seguro social del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario semanal del empleado asalariado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE));

        return new EmpleadoAsalariado(nss, nombre, apellido, salario);
    }

    public static EmpleadoPorHoras ingresarDatosEmpleadoPorHoras() {
        String nss = JOptionPane.showInputDialog(null, "Ingrese el número de seguro social del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        double sueldoPorHoras = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el sueldo por hora del empleado por horas:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE));
        double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas por el empleado por horas:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE));

        return new EmpleadoPorHoras(nss, nombre, apellido, sueldoPorHoras, horasTrabajadas);
    }

    public static EmpleadoBaseMasComision ingresarDatosEmpleadoBaseMasComision() {
        String nss = JOptionPane.showInputDialog(null, "Ingrese el número de seguro social del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        double ventasBrutas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las ventas brutas del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE));
        double tarifaComision = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tarifa de comisión del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE));
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario base del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE));

        return new EmpleadoBaseMasComision(nss, nombre, apellido, ventasBrutas, tarifaComision, salarioBase);
    }

    public static EmpleadoPorComision ingresarDatosEmpleadoPorComision() {
        String nss = JOptionPane.showInputDialog(null, "Ingrese el número de seguro social del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE);
        double ventasBrutas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las ventas brutas del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE));
        double tarifaComision = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tarifa de comisión del empleado:", "Ingresar datos", JOptionPane.QUESTION_MESSAGE));

        return new EmpleadoPorComision(nss, nombre, apellido, ventasBrutas, tarifaComision);
    }
}
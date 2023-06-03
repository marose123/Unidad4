package Abstractas;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import EntradaSalida.Tools;

public class MenuFiguras {
    public static void main(String[] args) {
        List<String> menu = Arrays.asList(
                "Triangulo","Cuadrado","Rectangulo","Impresion","Salir"
        );
        menuFigura(menu);
    }
    
    public static String boton(List<String> menu) {
        String[] valores = menu.toArray(new String[0]);
        String opcion = (String) JOptionPane.showInputDialog(null, "SELECCIONA UNA OPCIÓN", "M E N U",
                JOptionPane.QUESTION_MESSAGE, null,
                valores, valores[0]);
        return opcion;
    }
    
    private static void menuFigura(List<String> menu) {
        Figura[] arrFig = new Figura[10];
        int j = 0;
        String opc;
        String sel;

        do {
            opc = boton(menu);

            switch (opc) {
                case "Triangulo":
                    if (j < 10) {
                        Triangulo Figura= new Triangulo("Triangulo", "Rojo", Tools.leerInt("Ingrese la base"), Tools.leerInt("Ingrese la altura"));
                        arrFig[j] = Figura;
                        j++;
                    } else {
                        Tools.imprimepantalla("NO PUEDES INGRESAR MAS DATOS");
                    }
                    break;

                case "Cuadrado":
                    if (j < 10) {
                        sel = "Azul";
                        Cuadrado Figura = new Cuadrado("Cuadrado", sel, Tools.leerInt("Ingrese un lado"), sel);
                        arrFig[j] = Figura;
                        j++;
                    } else {
                        Tools.imprimepantalla("NO PUEDES INGRESAR MAS DATOS");
                    }
                    break;
                case "Rectangulo":
                    if (j < 10) {
                        sel = "Negro";
                        Rectangulo Figura = new Rectangulo("Rectangulo", sel, Tools.leerInt("Ingrese la base"), Tools.leerInt("Ingrese la altura"), sel);
                        arrFig[j] = Figura;
                        j++;
                    } else {
                        Tools.imprimepantalla("NO PUEDES INGRESAR MAS DATOS");
                    }
                    break;

               
                case "Impresion":
                    String acumulador = "";
                    for (int k = 0; k < j; k++) {
                        acumulador += "\n" + arrFig[k];
                    }
                    Tools.imprimepantalla(acumulador);
                    break;

                case "Salir":
                    Tools.imprimepantalla("Saliendo del programa...");
                    break;

                default:
                    Tools.imprimepantalla("Opción inválida");
                    break;
            }
        } while (!opc.equals("Salir"));
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_s4_rainiero_morroni;

import java.util.Scanner;

/**
 *
 * @author Raiggh
 */
public class Exp2_S4_Rainiero_Morroni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sca = new Scanner(System.in);
        int opcion;

        System.out.println("¡Bienvenido a Teatro Moro!");
        do {

            System.out.println("        Menu Principal");
            System.out.println("Seleccione una opcion para continuar:");
            System.out.println("1. Comprar Entradas.");
            System.out.println("2. Salir.");

            opcion = sca.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Accediendo a la seccion de compra de entradas...");
                    break;
                case 2:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion ingresada no valida. Por favor, intente nuevamente");
                    System.out.println(""); //Linea en blanco.
            }
        } while (opcion != 1 && opcion != 2);

        System.out.println("            MAPA DE ASIENTOS");
        System.out.println(""); //Linea en blanco.
        System.out.println("                                      [ESCENARIO]");
        System.out.println("                                     A  B  C  D  E");
        System.out.println("Sector VIP:                         [1][2][3][4][5]");
        System.out.println("Sector Platea Alta:                 [1][2][3][4][5]");
        System.out.println("Sector Platea Baja:                 [1][2][3][4][5]");
        System.out.println("Sector Palco:                       [1][2][3][4][5]");
        System.out.println("");//Linea en blanco.

        int sector;

        do {
            System.out.println("Seleccione el SECTOR deseado:");
            System.out.println("1. Sector VIP");
            System.out.println("2. Sector Platea Alta");
            System.out.println("3. Sector Platea Baja");
            System.out.println("4. Sector Palco");
            System.out.println("Ingrese el numero del sector (1-4): ");

            while (!sca.hasNextInt()) {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Ingrese el numero del sector (1-4): ");
            }

            sector = sca.nextInt();
            if (sector < 1 || sector > 4) {
                System.out.println("Ingrese una opcion valida:");
            }
        } while (sector < 1 || sector > 4);

        int columna;

        do {
            System.out.println("Seleccione la COLUMNA deseada:");
            System.out.println("1. Columna A");
            System.out.println("2. Columna B");
            System.out.println("3. Columna C");
            System.out.println("4. Columna D");
            System.out.println("5. Columna E");
            System.out.println("Ingrese el numero de la columna (1-5): ");

            while (!sca.hasNextInt()) {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Ingrese el numero de la columna (1-5): ");
            }

            columna = sca.nextInt();
            if (columna < 1 || columna > 5) {
                System.out.println("Ingrese una columna valida:");
            }
        } while (columna < 1 || columna > 5);

        int asiento;

        do {
            System.out.println("Seleccione el ASIENTO deseado:");
            System.out.println("1. Asiento 1");
            System.out.println("2. Asiento 2");
            System.out.println("3. Asiento 3");
            System.out.println("4. Asiento 4");
            System.out.println("5. Asiento 5");
            System.out.println("Ingrese el numero del asiento (1-5): ");

            while (!sca.hasNextInt()) {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Ingrese el numero del asiento (1-5): ");
            }

            asiento = sca.nextInt();
            if (asiento < 1 || asiento > 5) {
                System.out.println("Ingrese un asiento valido:");
            }
        } while (asiento < 1 || asiento > 5);

        System.out.println("Valores entradas Publico General");
        System.out.println("Sector VIP: $30.000.-"); //Precio 1
        System.out.println("Sector Platea Alta: $18.000.-"); //Precio 2
        System.out.println("Sector Platea Baja: $15.000.-"); //Precio 3
        System.out.println("Sector Palco: $13.000.-"); //Precio 4

        int edad;
        double descuento = 0;
        // 100% descuento igual o menor de 2 años.
        // 10% descuento Estudiantes (3-17 años).
        // 15% descuento Tercera Edad (>59 años).

        System.out.println(""); //Linea en blanco.
        System.out.println("Ingrese su edad para consultar por nuestros descuentos: ");
        edad = sca.nextInt();

        if (edad < 2) {
            descuento = 1; // 100% de descuento
            System.out.println("¡Entrada gratuita! (100% de descuento)");
        } else if (edad >= 2 && edad < 18) {
            descuento = 0.1; // 10% de descuento
            System.out.println("Descuento del 10% aplicado.");
        } else if (edad >= 60) {
            descuento = 0.15; // 15% de descuento
            System.out.println("Descuento del 15% aplicado.");
        } else {
            System.out.println("No se aplica ningun descuento.");
        }

        double precioSector = 0;
        double precioFinal = 0;

        if (sector == 1) {
            precioSector = 30000;
        } else if (sector == 2) {
            precioSector = 18000;
        } else if (sector == 3) {
            precioSector = 15000;
        } else if (sector == 4) {
            precioSector = 13000;
        }

        precioFinal = precioSector * (1 - descuento);

        System.out.println("Numero de asiento seleccionado: " + asiento);
        System.out.println("Precio base entrada: " + precioSector);
        System.out.println("Precio final a pagar: " + precioFinal);
        System.out.println(""); //Linea en blanco.
        System.out.println("¡Gracias por su compra, disfrute su funcion!");

    }
}

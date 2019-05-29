package codegit;
/**
 *
 * @author DAW112
 * @author DAW103
 * @author DAW115
 */

import java.util.Scanner;

public class CodeGit {
static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner sn = new Scanner(System.in);
       /**
        *@param salir salir del menú
        */
        boolean salir = false;
        /**
        *@param opcion escoger opción del menú
        */
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
            System.out.println("Elige el tipo de conversion:");
            System.out.println("1. lonxitude.");
            System.out.println("2. Potencia");
            System.out.println("3. Temperatura");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion Conversion de Longitud");
                        System.out.println("introduce los datos:");
                        lonxitude();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion Potencia");
                            Potencia();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion Conversion Temperatura");
                            Temperatura();
                        break;
                    
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    
        
    }
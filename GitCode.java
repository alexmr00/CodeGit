/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitcode;

/**
 *
 * @author daw103
 */
public class GitCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
    }
   private static void lonxitude() {
        boolean comprobar=true;
        System.out.println("Seleccione la medida a convertir");
        System.out.println("1. Km");
        System.out.println("2. Metros");
        System.out.println("3. Cm");
        System.out.println("4. Pulgadas");
        System.out.println("5. Yardas");
        System.out.println("6. Pies");
        System.out.println("7. Millas");
        System.out.println("8. Millas nauticas");
        System.out.println("0. Salir");
        /**
        * @param a opción del submenú
        */
        int a= leer.nextInt();
        /**
        * @param resultado resultado de la conversión
        */
        double resultado;
        /**
        * @param b unidad a convertir
        */
        double b=insertarNumero();
        switch (a) {
            case 1:
                    
                break;
            case 2:
                b/=1000;
                break;
            case 3:
                b/=100000;
                break;
            case 4:
                b/=39370.1;
                break;
            case 5:
                b/=1093.61;
                break;
            case 6:
                 b/=3280.84;
                break;
            case 7:
                 b/=0.621371;
                break;
            case 8:
                 b/=0.539957;
                break;
            default:
                comprobar=false;
                break;
        }
        if (comprobar) {
            System.out.println("Seleccione la medida a la que convertir");
        System.out.println("1. Km");
        System.out.println("2. Metros");
        System.out.println("3. Cm");
        System.out.println("4. Pulgadas");
        System.out.println("5. Yardas");
        System.out.println("6. Pies");
        System.out.println("7. Millas");
        System.out.println("8. Millas nauticas");
        System.out.println("0. Salir");
            a= leer.nextInt();
        switch (a) {
         case 1:

             break;
         case 2:
             b*=1000;
             break;
         case 3:
             b*=100000;
             break;
         case 4:
             b*=39370.1;
             break;
         case 5:
             b*=1093.61;
             break;
         case 6:
             b*=3280.84;
             break;
         case 7:
             b*=0.621371;
             break;
         case 8:
             b*=0.539957;
             break;
         default:
             comprobar=false;
             break;
        }
            System.out.println("La Cantidad convertida es: "+b);
        }
        

   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAVIER JACOME
 */
public class ejercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        //declaro variables
        String palabra = " Universidad ";
        char letras;

        //lee cuantas letras ahi en la cadena 
        for (int i = 1; i < palabra.length(); i++) {
            letras = palabra.charAt(i);

            //separa las letras hacia abajo  
            for (int a = 1; a <= i; a++) {

                //presentando la letra con su posicion 
                System.out.printf("%s", letras);

            }
            //presento en pantalla 
            System.out.println("");
        }
    }

}

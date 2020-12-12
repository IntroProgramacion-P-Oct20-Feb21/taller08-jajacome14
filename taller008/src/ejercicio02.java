/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAVIER JACOME
 */
public class ejercicio02 {

    public static void main(String[] args) {
        // TODO code application logic hereç
        //declaro variables 
        String cadena;
        char valor;

        //lee valor en la cadena 
        for (int i = 1; i <= 26; i++) {
            valor = (char) (i + 96);

            //presentando las letras con su posicion 
            for (int contador = 1; contador <= i; contador++) {
                System.out.printf("%s", valor);

            }
            System.out.println();
        }
    }

}

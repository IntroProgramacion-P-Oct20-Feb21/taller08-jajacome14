
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JAVIER JACOME
 */
public class ejercicio03 {

    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
         //declaro variables 
        int n;
        double suma = 0;
        double numerador;
        double denominador;
        //ingresar valor de n 
        System.out.println("Ingrese n:");
        n = entrada.nextInt();
         //proceso 
        for (int i = 1; i <= n; i++) {
            numerador = 1;
            denominador = Math.pow(2, i);
            
            suma = suma + (numerador / denominador);

        }

        System.out.printf("Valor de la sumatoria %.4f\n", suma);
    }

}

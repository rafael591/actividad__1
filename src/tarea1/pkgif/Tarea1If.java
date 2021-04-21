/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.pkgif;

import java.util.Scanner;

/**
 *
 * @author Rafael Moreno
 */
public class Tarea1If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año_actual = 2021;
        int año_cualquiera;
        int años;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el año");
        año_cualquiera = entrada.nextInt();
        
        if (año_actual > año_cualquiera){
            años = (año_actual - año_cualquiera);
            System.out.println("Los años que han transcurrido son: " + años);
        } else if (año_cualquiera > año_actual) {
            años = (año_cualquiera - año_actual);
            System.out.println("Los años faltantes son: " + años);
        }
    }
}

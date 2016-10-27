/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectepcomponents;

import java.util.Scanner;

/**
 *
 * @author quim
 */
public class ProjectePcomponents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
 String nomComponent = null;

        String fabricant = null;

        int anyDellançament = 0;

        double preu = 0.0;

        boolean obsolet = false;

        String descripcio = "";

        int opcio;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Benvinguts al projecte de Quim González Colat,\npodreu consultat tots els diferents components que formen un ordenador amb les seves característiques!!");

        do {
            System.out.println("Escolleix una opció del programa: ");
            System.out.println("1 - Introdueix un nou producte.");
            System.out.println("2 - Modificar un producte.");
            System.out.println("3 - Esborrar producte.");
            System.out.println("4 - Sortir del programa.");
            opcio = entrada.nextInt();
            
            
        switch (opcio) {
            case 1:
                System.out.println("Introdueix");
                break;
            case 2: System.out.println("Modificar");
                break;
            case 3: System.out.println("Esborrar");
                break;
            case 4: System.out.println("Sortir del programa");
                break;
            default: System.out.println("No has introduït cap opció correcta.");
                
        }

        } while (opcio==0 || opcio==5);


    }

}


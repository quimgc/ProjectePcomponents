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
        int dia = 1;
        int mes = 1;
        int any = 1960;

        double preu = 0.0;

        char respostaobsolet;
        char resposta;

        boolean obsolet = false;

        boolean omplit = false;

        String descripcio = "";

        int opcio = 0;

        Scanner entrada = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);

        System.out.println("Benvinguts al projecte de Quim González Colat,\npodreu consultat tots els diferents components que formen un ordenador amb les seves característiques!!");

        do {
            System.out.println("Escolleix una opció del programa: ");
            System.out.println("1 - Introdueix un nou producte.");
            System.out.println("2 - Modificar un producte.");
            System.out.println("3 - Mostrar un producte.");
            System.out.println("4 - Esborrar producte.");
            System.out.println("5 - Recuperar producte.");
            System.out.println("6 - Sortir del programa.");
            opcio = entNum.nextInt();

            switch (opcio) {
                case 1:
                    if (!omplit) {
                        System.out.print("Introdueix el nom del component: \n");
                        nomComponent = entrada.nextLine();
                        // nomComponent = entrada.nextLine();
                        System.out.println("Introdueix el fabricant: ");
                        fabricant = entrada.nextLine();

                        do {
                            System.out.println("Introdueix la data de llançament(dia/mes/any): ");
                            dia = entNum.nextInt();
                            mes = entNum.nextInt();
                            any = entNum.nextInt();

                        } while (dia < 1 || dia > 31 || mes < 1 || mes > 12 || any < 1960 || any > 2017);

                        System.out.println("\nIntrodueix el preu: ");
                        preu = entNum.nextDouble();

                        do {
                            System.out.println("El producte està obsolet? S/N");
                            respostaobsolet = entrada.nextLine().toUpperCase().charAt(0);
                        } while (respostaobsolet != 'S' && respostaobsolet != 'N');
                        if (respostaobsolet == 'S') {
                            obsolet = true;
                        }
                        omplit = true;
                    } else {
                        System.out.println("El producte ja està introduït!!\n");
                    }

                    break;

                case 2:
                    if (!omplit) {

                        System.out.println("\nNo hi ha productes per modificar!\n");

                    } else {
                        do {
                            System.out.println("Vols modificar el nom? S/N");
                            resposta = entrada.nextLine().toUpperCase().charAt(0);
                            if (resposta == 'S') {
                                System.out.println("Introdueix un nou nom del producte: ");
                                nomComponent = entrada.nextLine();
                            }
                        } while (resposta != 'S' && resposta != 'N');

                        do {
                            System.out.println("Vols modificar el nom del fabricant? S/N");
                            resposta = entrada.nextLine().toUpperCase().charAt(0);
                            if (resposta == 'S') {
                                System.out.println("Introdueix un nou nom del fabricant: ");
                                fabricant = entrada.nextLine();
                            }
                        } while (resposta != 'S' && resposta != 'N');

                        do {
                            System.out.println("Vols modificar la data de llançament? S/N");
                            resposta = entrada.nextLine().toUpperCase().charAt(0);
                            if (resposta == 'S') {
                                do {
                                    System.out.println("Introdueix la data de llançament (dia/mes/any): ");
                                    dia = entNum.nextInt();
                                    mes = entNum.nextInt();
                                    any = entNum.nextInt();

                                } while (dia < 1 || dia > 31 || mes < 1 || mes > 12 || any < 1960 || any > 2017);
                            }
                        } while (resposta != 'S' && resposta != 'N');

                        do {
                            System.out.println("Vols modificar el preu del producte?  S/N");
                            resposta = entrada.nextLine().toUpperCase().charAt(0);
                            if (resposta == 'S') {
                                System.out.println("Introdueix un nou preu al producte:  ");
                                preu = entNum.nextDouble();
                            }
                        } while (resposta != 'S' && resposta != 'N');

                        do {
                            System.out.println("Vols modificar si el producte està obsolet? S/N");
                            resposta = entrada.nextLine().toUpperCase().charAt(0);
                            if (resposta == 'S') {
                                do {
                                    System.out.println("El producte està obsolet? S/N");
                                    respostaobsolet = entrada.nextLine().toUpperCase().charAt(0);
                                } while (respostaobsolet != 'S' && respostaobsolet != 'N');
                                {
                                    obsolet = true;
                                }
                            }
                        } while (resposta != 'S' && resposta != 'N');

                    }
                    break;
                case 3:
                    if (!omplit) {
                        System.out.println("No hi ha cap producte!\n");
                    } else {
                        System.out.println("\nEl nom del component és: " + nomComponent);
                        System.out.println("El fabricant és: " + fabricant);
                        System.out.println("La data de llançament és: " + dia + "/" + mes + "/" + any);
                        System.out.println("El preu és: " + preu + "€");
                        if (obsolet) {
                            System.out.println("El producte està obsolet.\n");
                        } else {
                            System.out.println("El producte no està obsolet. \n");
                        }
                    }
                    break;
                case 4:

                    if (!omplit) {
                        System.out.println("No hi ha cap producte per esborrar! \n");
                    } else {
                        omplit = false;
                        System.out.println("El producte ha estat esborrat.\n");
                    }
                    break;
                case 5:

                    do {
                        System.out.println("Vols modificar el nom? S/N");
                        resposta = entrada.nextLine().toUpperCase().charAt(0);
                        if (resposta == 'S') {
                            omplit = true; //serveix per recuperar el producte.
                            System.out.println("\nRecuperació del producte: \n");
                            System.out.println("\nEl nom del component és: " + nomComponent);
                            System.out.println("El fabricant és: " + fabricant);
                            System.out.println("La data de llançament és: " + dia + "/" + mes + "/" + any);
                            System.out.println("El preu és: " + preu + "€");
                            if (obsolet) {
                                System.out.println("El producte està obsolet.\n");
                            } else {
                                System.out.println("El producte no està obsolet. \n");
                            }

                        }
                    } while (resposta != 'S' && resposta != 'N');

                    break;
                case 6:
                    System.out.println("\nSortint del programa...");
                    break;
                default:
                    System.out.println("No has introduït una opció correcta.");

            }

        } while (opcio != 6);

    }

}

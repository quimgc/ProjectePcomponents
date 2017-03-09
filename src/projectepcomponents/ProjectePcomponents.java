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

    private static final int MAXCOMPONENTS = 2;
    private static Components[] array = new Components[MAXCOMPONENTS];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       
        //Vector on guardarem la informacio dels components;
        Scanner entrada = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = new Components();
            array[i].setOmplit(false);
        }

        /*Això quan acabi l'array s'ha d'esborrar, ja que utilitzarà les variables del fitxer components.java*/
     
    
        char respostaobsolet;
        char resposta = 'N';
        int opcio = 0;

        System.out.println("Benvinguts al projecte de Quim González Colat,\npodreu consultat tots els diferents components que formen un ordenador amb les seves característiques!!");

        do {
            System.out.println("Escolleix una opció del programa: \n");
            System.out.println("1 - Introdueix un nou producte.");
            System.out.println("2 - Modificar un producte.");
            System.out.println("3 - Mostrar un producte.");
            System.out.println("4 - Esborrar producte.");
            System.out.println("5 - Recuperar producte.");
            System.out.println("6 - Sortir del programa.");
            opcio = entNum.nextInt();

            switch (opcio) {
                case 1:
                    int i = 0;
                    //aixo fa que el for dins del seu cos no tingui instruccions.
                    for (i = 0; i < array.length && array[i].isOmplit(); i++);
                    if (i < array.length) {
                        //s'ha trobat una casella buida.

                        System.out.println("\nNom component:");
                        array[i].setNomComponent(entrada.skip("[\r\n]*").nextLine());
                        System.out.println("\nFabricant:");
                        array[i].setFabricant(entrada.skip("[\r\n]*").nextLine());
                       do {
                                    System.out.println("Introdueix la data de llançament (dia/mes/any): ");
                                    array[i].setDia(entNum.nextInt());
                                    array[i].setMes(entNum.nextInt());
                                    array[i].setAny(entNum.nextInt());
                              

                                }while(!dataCorrecta(array[i].getDia(),array[i].getMes(),array[i].getAny()));

                        do {
                            System.out.println("\nEl producte està obsolet? S/N");
                            respostaobsolet = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (respostaobsolet != 'S' && respostaobsolet != 'N');
                        if (respostaobsolet == 'S') {
                            array[i].setObsolet(true);
                            
                        }else{
                            array[i].setObsolet(false);
                        
                        }
                        array[i].setOmplit(true);
                    } else {
                        System.out.println("no hi ha espai per nous components.");
                    }

                    break;
                
                case 2:
                    resposta = 'N';
                
                    for (i = 0; i < array.length  && resposta != 'S' && resposta != 'F'; i++) {
                        if (array[i].isOmplit()) {
                            System.out.format("\n Component: %s\n", array[i].getNomComponent());
                            do {
                                System.out.println("Vols modifcar aquest component o finalitzar la busqueda?: (S per modificar N per continuar F per finalitzar)");
                                resposta = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                            } while (resposta != 'S' && resposta != 'N' && resposta != 'F');
                        }
                            if (resposta == 'S') {
                                break;
                            }
                    
                    }
                    

                    if (resposta == 'S') {

                        do {
                            System.out.println("Vols modificar el nom? S/N");
                            resposta = entrada.nextLine().toUpperCase().charAt(0);
                            if (resposta == 'S') {
                                System.out.println("Introdueix un nou nom del producte: ");
                                array[i].setNomComponent(entrada.skip("[\r\n]*").nextLine());

                            }
                        } while (resposta != 'S' && resposta != 'N');
                        
                           do {
                            System.out.println("Vols modificar el nom del fabricant? S/N");
                            resposta = entrada.nextLine().toUpperCase().charAt(0);
                            if (resposta == 'S') {
                                System.out.println("Introdueix un nou nom del fabricant: ");
                                 array[i].setFabricant(entrada.skip("[\r\n]*").nextLine());
                            }
                        } while (resposta != 'S' && resposta != 'N');
                           
                          do {
                            System.out.println("Vols modificar la data de llançament? S/N");
                            resposta = entrada.nextLine().toUpperCase().charAt(0);
                            if (resposta == 'S') {
                                do {
                                    System.out.println("Introdueix la data de llançament (dia/mes/any): ");
                                    array[i].setDia(entNum.nextInt());
                                    array[i].setMes(entNum.nextInt());
                                    array[i].setAny(entNum.nextInt());
                              

                                }while(!dataCorrecta(array[i].getDia(),array[i].getMes(),array[i].getAny()));
                            }
                        } while (resposta != 'S' && resposta != 'N');
                          
                          
                           do {
                            System.out.println("Vols modificar el preu del producte?  S/N");
                            resposta = entrada.nextLine().toUpperCase().charAt(0);
                            if (resposta == 'S') {
                                System.out.println("Introdueix un nou preu al producte:  ");
                                array[i].setPreu(entNum.nextDouble());

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
                                    array[i].setObsolet(true);
                                }
                            }
                        } while (resposta != 'S' && resposta != 'N');
                        
                       
                    }else System.out.println("No hi ha productes per modifciar!!");
                    
                    
                  
                    break;
                case 3:
                    i = 0;
                  
                     boolean temp=false;
                    for (i = 0; i < array.length; i++) {
                        
                        if (array[i].isOmplit()){
                             System.out.println("\nEl nom del component és: " + array[i].getNomComponent());
                             System.out.println("El fabricant és: " + array[i].getFabricant());
                             System.out.println("La data de llançament és: " + array[i].getDia() + "/" + array[i].getMes() + "/" + array[i].getAny());
                             System.out.println("El preu és: " + array[i].getPreu() + "€");
                             if (array[i].isObsolet()) {
                                 System.out.println("El producte està obsolet.\n");
                                } else {
                            System.out.println("El producte no està obsolet. \n");
                             }
                             temp=true;
                        }
                             if (!temp) {
                   System.out.println("No hi ha cap producte!!!\n");
                                     break;
                        }
                    }
                   
                    
                  
                  break;
                case 4:
                        
        Scanner ent = new Scanner(System.in);
        char siNo = 'N';
        Components c = null;
        
        for (i = 0; i < array.length && siNo != 'F'; i++) {
            c = array[i];
            if (c.isOmplit()) {
                System.out.format("\n%s",c);
                do {
                    System.out.println("\nVols borrar el component(S/N) o finalitzar la cerca (F)?:");
                    siNo = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (siNo != 'S' && siNo != 'N' && siNo != 'F');
            }
            if (siNo == 'S') {
                break;
            }
        }

        if (siNo == 'S') {
            c.setOmplit(false);
            System.out.println("Component borrat correctament.");

        } else {
            System.out.println("\nNo s'ha borrat cap component.");
        }
                 
                    break;
                case 5:
                    int cont=0;
              
                    
                   for (i = 0; i < array.length && resposta != 'S' && resposta != 'F'; i++) {
            if (!array[i].isOmplit()) {
                System.out.format("\nComponent %d:\n", ++cont);
                System.out.format("\n%s",array[i].toString());
                do {
                    System.out.println("\nVols recuperar el component(S/N) o finalitzar la cerca (F)?:");
                    resposta = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); //usem toUpperCase() que traduix el text introduït per l'usuari a majúscules, 
                    //per tant només haurem de tractar les lletres majúscules
                } while (resposta != 'S' && resposta != 'N' && resposta != 'F');
            }
            if (resposta == 'S') {
                break;
            }
        }
                   
                   if (resposta == 'S') {
            array[i].setOmplit(true);
            System.out.println("Component recuperat correctament.");
        } else {
            if(cont==0) System.out.println("No hi ha components per recuperar.");
            else System.out.println("Component no recuperat.");
        }
             break;
                 
                case 6:
                    System.out.println("\nSortint del programa...");
                    break;
                default:
                    System.out.println("No has introduït una opció correcta.");

            }

        } while (opcio != 6);

    }
       public static boolean dataCorrecta(int dia, int mes, int any){
         int [] mesos={31,28,31,30,31,30,31,31,30,31,30,31};
        if(mes<1 || mes>12 || dia<1 || dia>31){
            return false;
        }
        if(bixest(any)){
            mesos[1]=29;
        }
        if(dia<=mesos[mes-1]){
            return true;
        }
        return false;
        
        }
             public static boolean bixest(int any) {
        if (any < 1584) {
            return false;
        }
        if ((any % 400 == 0 || any % 4 == 0) && any % 100 != 0) {
            return true;
        }
        return false;

    }

}

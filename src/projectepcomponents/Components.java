/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectepcomponents;

/**
 *
 * @author quim
 */
public class Components {

    //Variables projecte Pcomponents.
    private String nomComponent = null;
    private String fabricant = null;
    private int dia = 1;
    private int mes = 1;
    private int any = 1960;
    private double preu = 0.0;

    //private char resposta;
    private boolean obsolet = false;
    private boolean omplit = false;
    private String descripcio = "";
    //private int opcio = 0;

    @Override
    public String toString() {
        return "nomComponent: " + nomComponent + "\nfabricant: " + fabricant + (obsolet ? "Està obsolet" : "No està obsolet");

        /*
        if per al return:
        si se posa if(...) al return, no funciona, l'equivalencia és:
                (obsolet?"Està obsolet":"No està obsolet");
                (variable?"Missatge de si es true":"Missatge de si es false");
        

         */
        //return "Components{" + "nomComponent=" + nomComponent + ",\nfabricant=" + fabricant + ",\ndia=" + dia + ",\nmes=" + mes + ",\nany=" + any + ",\npreu=" + preu + ",\nrespostaobsolet=" + respostaobsolet + ",\nresposta=" + resposta + ",\nobsolet=" + obsolet + ",\ndescripcio=" + descripcio + '}';
    }

    public String getNomComponent() {
        return nomComponent;
    }

    public void setNomComponent(String nomComponent) {
        this.nomComponent = nomComponent;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public boolean isObsolet() {
        return obsolet;
    }

    public void setObsolet(boolean obsolet) {
        this.obsolet = obsolet;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

}

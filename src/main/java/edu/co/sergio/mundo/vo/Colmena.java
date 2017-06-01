/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author Labing
 */
public class Colmena {
    
 private int idColmenas;
 private int Poblacion_Cantidad;
 private String Poblacion_Calidad;
 private Boolean Presencia_Reina;
 private Boolean Produccion_Miel;
 private Boolean Panales_Miel;
 private int Panal_Cera;
 private int Panal_Alimento;
 private int Panal_Cria;
 private int Panal_Vacio;

    public Colmena(int idColmenas, int Poblacion_Cantidad, String Poblacion_Calidad, Boolean Presencia_Reina, Boolean Produccion_Miel, Boolean Panales_Miel, int Panal_Cera, int Panal_Alimento, int Panal_Cria, int Panal_Vacio) {
        this.idColmenas = idColmenas;
        this.Poblacion_Cantidad = Poblacion_Cantidad;
        this.Poblacion_Calidad = Poblacion_Calidad;
        this.Presencia_Reina = Presencia_Reina;
        this.Produccion_Miel = Produccion_Miel;
        this.Panales_Miel = Panales_Miel;
        this.Panal_Cera = Panal_Cera;
        this.Panal_Alimento = Panal_Alimento;
        this.Panal_Cria = Panal_Cria;
        this.Panal_Vacio = Panal_Vacio;
    }

    public int getIdColmenas() {
        return idColmenas;
    }

    public void setIdColmenas(int idColmenas) {
        this.idColmenas = idColmenas;
    }

    public int getPoblacion_Cantidad() {
        return Poblacion_Cantidad;
    }

    public void setPoblacion_Cantidad(int Poblacion_Cantidad) {
        this.Poblacion_Cantidad = Poblacion_Cantidad;
    }

    public String getPoblacion_Calidad() {
        return Poblacion_Calidad;
    }

    public void setPoblacion_Calidad(String Poblacion_Calidad) {
        this.Poblacion_Calidad = Poblacion_Calidad;
    }

    public Boolean getPresencia_Reina() {
        return Presencia_Reina;
    }

    public void setPresencia_Reina(Boolean Presencia_Reina) {
        this.Presencia_Reina = Presencia_Reina;
    }

    public Boolean getProduccion_Miel() {
        return Produccion_Miel;
    }

    public void setProduccion_Miel(Boolean Produccion_Miel) {
        this.Produccion_Miel = Produccion_Miel;
    }

    public Boolean getPanales_Miel() {
        return Panales_Miel;
    }

    public void setPanales_Miel(Boolean Panales_Miel) {
        this.Panales_Miel = Panales_Miel;
    }

    public int getPanal_Cera() {
        return Panal_Cera;
    }

    public void setPanal_Cera(int Panal_Cera) {
        this.Panal_Cera = Panal_Cera;
    }

    public int getPanal_Alimento() {
        return Panal_Alimento;
    }

    public void setPanal_Alimento(int Panal_Alimento) {
        this.Panal_Alimento = Panal_Alimento;
    }

    public int getPanal_Cria() {
        return Panal_Cria;
    }

    public void setPanal_Cria(int Panal_Cria) {
        this.Panal_Cria = Panal_Cria;
    }

    public int getPanal_Vacio() {
        return Panal_Vacio;
    }

    public void setPanal_Vacio(int Panal_Vacio) {
        this.Panal_Vacio = Panal_Vacio;
    }
 
 
    
}

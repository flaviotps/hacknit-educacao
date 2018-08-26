package com.dev.hacknit.Database;

public class Bimestre{

    public int getIndex() {
        return index;
    }

    public int getMatematica() {
        return matematica;
    }

    public int getHistoria() {
        return historia;
    }

    public int getPortugues() {
        return portugues;
    }

    public int getBiologia() {
        return biologia;
    }

    public int getGeografia() {
        return geografia;
    }

    public int getIngles() {
        return ingles;
    }

    public int getRedacao() {
        return redacao;
    }

    public int getArtes() {
        return artes;
    }

    public int getEducacaofisica() {
        return educacaofisica;
    }

    public int getFilosofia() {
        return filosofia;
    }

    public int index;
    public int matematica;
    public int historia;
    public int portugues;
    public int biologia;
    public int geografia;
    public int ingles;
    public int redacao;
    public int artes;
    public int educacaofisica;
    public int filosofia;
    public int faltas;

    public String getFaltasAsDataString() {
        return "1,"+(faltas)+";2,"+(60-faltas)+";";
    }
}

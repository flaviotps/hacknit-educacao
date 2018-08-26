package com.dev.hacknit.Database;

import java.util.ArrayList;
import java.util.List;

public class DataModel {

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEscola() {
        return escola;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPai() {
        return pai;
    }

    public String getMae() {
        return mae;
    }

    public String getPaiCpf() {
        return paiCpf;
    }

    public String getMaeCpf() {
        String finalStr = maeCpf.replace(".","").replace("-","");
        return finalStr;
    }

    public List<Ano> getAnoList() {
        return anoList;
    }

        public Bimestre getBimestreByID(int id){

            for(int i=0;i<anoList.size();i++){
                for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                  return anoList.get(i).bimestreList.get(id);
                }
            }
            return null;
        }

    public String getMatematica(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).matematica)+";";
            }
        }
        return s;
    }

    public String getIngles(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).ingles)+";";
            }
        }
        return s;
    }

    public String getArtes(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).artes)+";";
            }
        }
        return s;
    }

    public String getEducacaoFisica(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).educacaofisica)+";";
            }
        }
        return s;
    }

    public String getRedacao(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).redacao)+";";
            }
        }
        return s;
    }
    public String getGeografia(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).geografia)+";";
            }
        }
        return s;
    }
    public String getHistoria(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).historia)+";";
            }
        }
        return s;
    }
    public String getBiologia(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).biologia)+";";
            }
        }
        return s;
    }

    public String getFilosofia(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).filosofia)+";";
            }
        }
        return s;
    }

    public String getPortugues(){
        String s = "";
        for(int i=0;i<anoList.size();i++){
            for(int j=0;j<anoList.get(i).bimestreList.size();j++){
                s += String.valueOf(i+1)+","+String.valueOf(anoList.get(i).bimestreList.get(j).portugues)+";";
            }
        }
        return s;
    }
    int id;
    int idade;
    String nome;
    String escola;
    String cpf;
    String pai;
    String mae;
    String paiCpf;
    String maeCpf;
    String matricula;

    public String getMatricula() {
        return matricula;
    }

    List<Ano> anoList;

    public DataModel() {
        this.anoList = new ArrayList<Ano>();
    }
}

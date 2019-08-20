/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Flor {
    private int codigo;
    private String nomepopular;
    private String nomecientifico;
    private int ano;
    private Double tampetala;
    private Double tamsepala;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomepopular() {
        return nomepopular;
    }

    public void setNomepopular(String nomepopular) {
        this.nomepopular = nomepopular;
    }

    public String getNomecientifico() {
        return nomecientifico;
    }

    public void setNomecientifico(String nomecientifico) {
        this.nomecientifico = nomecientifico;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getTampetala() {
        return tampetala;
    }

    public void setTampetala(Double tampetala) {
        this.tampetala = tampetala;
    }

    public Double getTamsepala() {
        return tamsepala;
    }

    public void setTamsepala(Double tamsepala) {
        this.tamsepala = tamsepala;
    }

    @Override
    public String toString() {
        return "Flor{" + "nomepopular=" + nomepopular + '}';
    }
    
    
}

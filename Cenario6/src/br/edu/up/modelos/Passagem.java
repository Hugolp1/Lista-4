package br.edu.up.modelos;
public class Passagem {
    private int numeroAssento;
    private String classeAssento;
    private String dataVoo;

    public Passagem(int numeroAssento, String classeAssento, String dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    // Getters e Setters
    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }

    public String getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }
}
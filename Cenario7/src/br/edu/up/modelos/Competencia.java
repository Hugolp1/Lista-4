package br.edu.up.modelos;

public class Competencia {
    private String nome;
    private boolean necessaria;
    private boolean atingida;

    public Competencia(String nome, boolean necessaria, boolean atingida) {
        this.nome = nome;
        this.necessaria = necessaria;
        this.atingida = atingida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isNecessaria() {
        return necessaria;
    }

    public void setNecessaria(boolean necessaria) {
        this.necessaria = necessaria;
    }

    public boolean isAtingida() {
        return atingida;
    }

    public void setAtingida(boolean atingida) {
        this.atingida = atingida;
    }
}
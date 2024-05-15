package br.edu.up.modelos;

public abstract class Seguro {
    private int numeroApolice;
    private String segurado;
    private double valor;

    public Seguro(int numeroApolice, String segurado, double valor) {
        this.numeroApolice = numeroApolice;
        this.segurado = segurado;
        this.valor = valor;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public String getSegurado() {
        return segurado;
    }

    public double getValor() {
        return valor;
    }

    public abstract String getTipoSeguro();
}

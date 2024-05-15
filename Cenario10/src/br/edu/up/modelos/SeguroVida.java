package br.edu.up.modelos;

public class SeguroVida extends Seguro {
    private int idadeSegurado;

    public SeguroVida(int numeroApolice, String segurado, double valor, int idadeSegurado) {
        super(numeroApolice, segurado, valor);
        this.idadeSegurado = idadeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    @Override
    public String getTipoSeguro() {
        return "Vida";
    }
}
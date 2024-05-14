package br.edu.up.modelos;
public class Reserva {
    private String responsavel;
    private int quantidadePessoas;
    private String dataReserva;
    private double valorTotal;

    public Reserva(String responsavel, int quantidadePessoas, String dataReserva, double valorTotal) {
        this.responsavel = responsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
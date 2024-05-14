package br.edu.up.modelos;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private String data;
    private String local;
    private int lotacaoMaxima;
    private int ingressosVendidos;
    private double precoIngresso;
    private List<Reserva> reservas;

    public Evento(String nome, String data, String local, int lotacaoMaxima, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.precoIngresso = precoIngresso;
        this.ingressosVendidos = 0;
        this.reservas = new ArrayList<>();
    }

    // G
    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void venderIngressos(int quantidade) {
        ingressosVendidos += quantidade;
    }

    public int ingressosDisponiveis() {
        return lotacaoMaxima - ingressosVendidos;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
}

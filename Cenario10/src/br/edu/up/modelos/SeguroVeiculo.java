package br.edu.up.modelos;

public class SeguroVeiculo extends Seguro {
    private String modeloVeiculo;
    private String placaVeiculo;

    public SeguroVeiculo(int numeroApolice, String segurado, double valor, String modeloVeiculo, String placaVeiculo) {
        super(numeroApolice, segurado, valor);
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    @Override
    public String getTipoSeguro() {
        return "Veículo";
    }
}

package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private static final int NUM_VAGAS = 10;
    private List<Veiculo> vagas;
    private int veiculosEntraram;
    private int veiculosSairam;
    private double valorTotal;

    public Estacionamento() {
        vagas = new ArrayList<>();
        veiculosEntraram = 0;
        veiculosSairam = 0;
        valorTotal = 0.0;
    }

    public boolean entrarVeiculo(Veiculo veiculo) {
        if (vagas.size() < NUM_VAGAS) {
            vagas.add(veiculo);
            veiculosEntraram++;
            return true;
        } else {
            return false;
        }
    }

    public Veiculo sairVeiculo(String placa) {
        for (Veiculo veiculo : vagas) {
            if (veiculo.getPlaca().equals(placa)) {
                vagas.remove(veiculo);
                veiculosSairam++;
                valorTotal += 5.0;
                return veiculo;
            }
        }
        return null;
    }

    public int getVeiculosEntraram() {
        return veiculosEntraram;
    }

    public int getVeiculosSairam() {
        return veiculosSairam;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
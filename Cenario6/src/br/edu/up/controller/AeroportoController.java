package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Aeronave;
import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Tripulacao;
import br.edu.up.view.AeroportoView;

public class AeroportoController {
    private List<Passageiro> passageiros;
    private List<Tripulacao> tripulacoes;
    private List<Aeronave> aeronaves;
    private AeroportoView view;

    public AeroportoController(AeroportoView view) {
        this.passageiros = new ArrayList<>();
        this.tripulacoes = new ArrayList<>();
        this.aeronaves = new ArrayList<>();
        this.view = view;
    }

    public void registrarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void registrarTripulacao(Tripulacao tripulacao) {
        tripulacoes.add(tripulacao);
    }

    public void registrarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public List<Tripulacao> getTripulacoes() {
        return tripulacoes;
    }

    public List<Aeronave> getAeronaves() {
        return aeronaves;
    }

    public void iniciar() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerOpcao();
            switch (opcao) {
                case 1:
                    registrarPassageiro(view.lerNovoPassageiro());
                    break;
                case 2:
                    registrarTripulacao(view.lerNovaTripulacao());
                    break;
                case 3:
                    registrarAeronave(view.lerNovaAeronave());
                    break;
                case 4:
                    view.mostrarMensagem("Saindo do sistema...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }
}
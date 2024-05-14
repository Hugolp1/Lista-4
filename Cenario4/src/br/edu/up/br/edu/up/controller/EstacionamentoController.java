package br.edu.up.controller;

import br.edu.up.modelos.Estacionamento;
import br.edu.up.modelos.Veiculo;
import br.edu.up.view.EstacionamentoView;

public class EstacionamentoController {
    private Estacionamento estacionamento;
    private EstacionamentoView view;

    public EstacionamentoController(Estacionamento estacionamento, EstacionamentoView view) {
        this.estacionamento = estacionamento;
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerOpcao();
            switch (opcao) {
                case 1:
                    registrarEntrada();
                    break;
                case 2:
                    registrarSaida();
                    break;
                case 3:
                    emitirRelatorio();
                    break;
                case 4:
                    view.mostrarMensagem("Saindo do sistema...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private void registrarEntrada() {
        Veiculo veiculo = view.lerVeiculo();
        boolean sucesso = estacionamento.entrarVeiculo(veiculo);
        if (sucesso) {
            view.mostrarMensagem("Veículo registrado com sucesso!");
        } else {
            view.mostrarMensagem("Estacionamento cheio. Não foi possível registrar o veículo.");
        }
    }

    private void registrarSaida() {
        String placa = view.lerPlaca();
        Veiculo veiculo = estacionamento.sairVeiculo(placa);
        if (veiculo != null) {
            view.mostrarMensagem("Veículo com placa " + placa + " saiu do estacionamento.");
        } else {
            view.mostrarMensagem("Veículo com placa " + placa + " não encontrado no estacionamento.");
        }
    }

    private void emitirRelatorio() {
        view.mostrarMensagem("Relatório:");
        view.mostrarMensagem("Veículos que entraram: " + estacionamento.getVeiculosEntraram());
        view.mostrarMensagem("Veículos que saíram: " + estacionamento.getVeiculosSairam());
        view.mostrarMensagem("Valor total arrecadado: R$ " + estacionamento.getValorTotal());
    }
}

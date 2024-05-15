package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;
import br.edu.up.view.*;

public class SeguroController {
    private List<Seguro> seguros;
    private SeguroView view;

    public SeguroController() {
        seguros = new ArrayList<>();
        view = new SeguroView();
    }

    public void incluirSeguro(Seguro seguro) {
        if (existeSeguro(seguro.getNumeroApolice())) {
            view.mostrarMensagem("Número da apólice já existe. Seguro não incluído.");
        } else {
            seguros.add(seguro);
            view.mostrarMensagem("Seguro incluído com sucesso.");
        }
    }

    public void localizarSeguro(int numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice() == numeroApolice) {
                view.mostrarMensagem("Seguro encontrado: " + seguro);
                return;
            }
        }
        view.mostrarMensagem("Seguro não encontrado.");
    }

    public void excluirSeguro(int numeroApolice) {
        for (int i = 0; i < seguros.size(); i++) {
            if (seguros.get(i).getNumeroApolice() == numeroApolice) {
                seguros.remove(i);
                view.mostrarMensagem("Seguro excluído com sucesso.");
                return;
            }
        }
        view.mostrarMensagem("Seguro não encontrado.");
    }

    public void excluirTodosSeguros() {
        if (seguros.isEmpty()) {
            view.mostrarMensagem("Não há seguros para excluir.");
            return;
        }

        view.mostrarMensagem("Tem certeza que deseja excluir todos os seguros? (S/N)");
        String resposta = view.lerRespostaConfirmacao();
        if (resposta.equalsIgnoreCase("S")) {
            seguros.clear();
            view.mostrarMensagem("Todos os seguros foram excluídos.");
        } else {
            view.mostrarMensagem("Operação de exclusão cancelada.");
        }
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    public void listarTodosSeguros() {
        if (seguros.isEmpty()) {
            view.mostrarMensagem("Não há seguros cadastrados.");
        } else {
            view.mostrarMensagem("Lista de seguros:");
            for (Seguro seguro : seguros) {
                view.mostrarMensagem(seguro.toString());
            }
        }
    }

    public void iniciar() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerOpcao();
            switch (opcao) {
                case 1:
                    incluirSeguro(view.lerNovoSeguro());
                    break;
                case 2:
                    localizarSeguro(view.lerNumeroApolice());
                    break;
                case 3:
                    excluirSeguro(view.lerNumeroApolice());
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    view.mostrarMensagem("Quantidade de seguros: " + quantidadeSeguros());
                    break;
                case 7:
                    view.mostrarMensagem("Saindo do programa...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }

    private boolean existeSeguro(int numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice() == numeroApolice) {
                return true;
            }
        }
        return false;
    }
}
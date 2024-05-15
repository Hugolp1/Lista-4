package br.edu.up.controller;
import br.edu.up.modelos.*;
import br.edu.up.view.*;

public class ContatoController {
    private Contato[] contatos;
    private ContatoView view;

    public ContatoController(int tamanhoMaximo) {
        contatos = new Contato[tamanhoMaximo];
        view = new ContatoView();
    }

    public void incluirContatoPessoal(ContatoPessoal contato) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                view.mostrarMensagem("Contato pessoal incluído com sucesso.");
                return;
            }
        }
        view.mostrarMensagem("Não foi possível incluir o contato pessoal. Limite de contatos atingido.");
    }

    public void incluirContatoComercial(ContatoComercial contato) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                view.mostrarMensagem("Contato comercial incluído com sucesso.");
                return;
            }
        }
        view.mostrarMensagem("Não foi possível incluir o contato comercial. Limite de contatos atingido.");
    }

    public void excluirContato(int codigo) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i].getCodigo() == codigo) {
                contatos[i] = null;
                view.mostrarMensagem("Contato excluído com sucesso.");
                return;
            }
        }
        view.mostrarMensagem("Contato não encontrado.");
    }

    public Contato consultarContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato != null && contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public void listarContatos() {
        view.listarContatos(contatos);
    }

    public void iniciar() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerOpcao();
            switch (opcao) {
                case 1:
                    incluirContatoPessoal(view.lerNovoContatoPessoal());
                    break;
                case 2:
                    incluirContatoComercial(view.lerNovoContatoComercial());
                    break;
                case 3:
                    excluirContato(view.lerCodigo());
                    break;
                case 4:
                    view.mostrarContato(consultarContato(view.lerCodigo()));
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    view.mostrarMensagem("Saindo do programa...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }
}
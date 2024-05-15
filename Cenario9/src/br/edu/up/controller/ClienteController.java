package br.edu.up.controller;
import br.edu.up.modelos.*;
import br.edu.up.view.*;

public class ClienteController {
    private Cliente[] clientes;
    private ClienteView view;

    public ClienteController(int tamanhoMaximo) {
        clientes = new Cliente[tamanhoMaximo];
        view = new ClienteView();
    }

    public void incluirClientePessoa(ClientePessoa cliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                view.mostrarMensagem("Cliente pessoa incluído com sucesso.");
                return;
            }
        }
        view.mostrarMensagem("Não foi possível incluir o cliente pessoa. Limite de clientes atingido.");
    }

    public void incluirClienteEmpresa(ClienteEmpresa cliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                view.mostrarMensagem("Cliente empresa incluído com sucesso.");
                return;
            }
        }
        view.mostrarMensagem("Não foi possível incluir o cliente empresa. Limite de clientes atingido.");
    }

    public void emprestarParaClientePessoa(int codigo, double valor) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa && cliente.getCodigo() == codigo) {
                ((ClientePessoa) cliente).emprestar(valor);
                return;
            }
        }
        view.mostrarMensagem("Cliente pessoa não encontrado.");
    }

    public void emprestarParaClienteEmpresa(int codigo, double valor) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa && cliente.getCodigo() == codigo) {
                ((ClienteEmpresa) cliente).emprestar(valor);
                return;
            }
        }
        view.mostrarMensagem("Cliente empresa não encontrado.");
    }

    public void devolverDeClientePessoa(int codigo, double valor) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa && cliente.getCodigo() == codigo) {
                ((ClientePessoa) cliente).devolver(valor);
                return;
            }
        }
        view.mostrarMensagem("Cliente pessoa não encontrado.");
    }

    public void devolverDeClienteEmpresa(int codigo, double valor) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa && cliente.getCodigo() == codigo) {
                ((ClienteEmpresa) cliente).devolver(valor);
                return;
            }
        }
        view.mostrarMensagem("Cliente empresa não encontrado.");
    }

    public void mostrarDadosClientePessoa(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa && cliente.getCodigo() == codigo) {
                view.mostrarMensagem(cliente.toString());
                return;
            }
        }
        view.mostrarMensagem("Cliente pessoa não encontrado.");
    }

    public void mostrarDadosClienteEmpresa(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa && cliente.getCodigo() == codigo) {
                view.mostrarMensagem(cliente.toString());
                return;
            }
        }
        view.mostrarMensagem("Cliente empresa não encontrado.");
    }

    public void iniciar() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerOpcao();
            switch (opcao) {
                case 1:
                    incluirClientePessoa(view.lerNovoClientePessoa());
                    break;
                case 2:
                    incluirClienteEmpresa(view.lerNovoClienteEmpresa());
                    break;
                case 3:
                    mostrarDadosClientePessoa(view.lerCodigo());
                    break;
                case 4:
                    mostrarDadosClienteEmpresa(view.lerCodigo());
                    break;
                case 5:
                    emprestarParaClientePessoa(view.lerCodigo(), view.lerValor());
                    break;
                case 6:
                    emprestarParaClienteEmpresa(view.lerCodigo(), view.lerValor());
                    break;
                case 7:
                    devolverDeClientePessoa(view.lerCodigo(), view.lerValor());
                    break;
                case 8:
                    devolverDeClienteEmpresa(view.lerCodigo(), view.lerValor());
                    break;
                case 9:
                    view.mostrarMensagem("Saindo do programa...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
    }
}

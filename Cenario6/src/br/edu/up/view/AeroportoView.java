package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.modelos.Aeronave;
import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Passagem;
import br.edu.up.modelos.Tripulacao;

public class AeroportoView {
    private Scanner scanner;

    public AeroportoView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Bem-vindo ao Controle de Tráfego Aéreo");
        System.out.println("1. Registrar Passageiro");
        System.out.println("2. Registrar Tripulação");
        System.out.println("3. Registrar Aeronave");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int lerOpcao() {
        return scanner.nextInt();
    }

    public Passageiro lerNovoPassageiro() {
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o nome do passageiro: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG do passageiro: ");
        String rg = scanner.nextLine();
        System.out.print("Digite o identificador de bagagem: ");
        String identificadorBagagem = scanner.nextLine();
        // Ler os dados da passagem
        System.out.print("Digite o número do assento: ");
        int numeroAssento = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite a classe do assento: ");
        String classeAssento = scanner.nextLine();
        System.out.print("Digite a data do voo (dd/mm/aaaa hh:mm): ");
        String dataVoo = scanner.nextLine();
        return new Passageiro(nome, rg, identificadorBagagem, new Passagem(numeroAssento, classeAssento, dataVoo));
    }

    public Tripulacao lerNovaTripulacao() {
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o nome da tripulação: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG da tripulação: ");
        String rg = scanner.nextLine();
        System.out.print("Digite a identificação aeronáutica: ");
        String identificacaoAeronautica = scanner.nextLine();
        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();
        // Ler os dados específicos da tripulação (comandante ou comissário)
        // Implementar conforme necessário
        return new Tripulacao(nome, rg, identificacaoAeronautica, matricula);
    }

    public Aeronave lerNovaAeronave() {
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o código da aeronave: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o tipo da aeronave: ");
        String tipo = scanner.nextLine();
        System.out.print("Digite a quantidade de assentos: ");
        int quantidadeAssentos = scanner.nextInt();
        return new Aeronave(codigo, tipo, quantidadeAssentos);
    }
    public void mostrarMensagem(String string) {
        System.out.println(string);
    }
}
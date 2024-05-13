package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.modelos.Veiculo;

public class EstacionamentoView {
    private Scanner scanner;

    public EstacionamentoView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Bem-vindo ao Sistema de Estacionamento");
        System.out.println("1. Registrar entrada de veículo");
        System.out.println("2. Registrar saída de veículo");
        System.out.println("3. Emitir relatório");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int lerOpcao() {
        return scanner.nextInt();
    }

    public Veiculo lerVeiculo() {
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.nextLine();
        System.out.print("Digite a cor do veículo: ");
        String cor = scanner.nextLine();
        return new Veiculo(modelo, placa, cor);
    }

    public String lerPlaca() {
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite a placa do veículo: ");
        return scanner.nextLine();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
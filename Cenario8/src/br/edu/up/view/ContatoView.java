package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.modelos.*;

public class ContatoView {
    private Scanner scanner;

    public ContatoView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Incluir contato pessoal");
        System.out.println("2. Incluir contato comercial");
        System.out.println("3. Excluir contato pelo código");
        System.out.println("4. Consultar contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
    }

    public ContatoPessoal lerNovoContatoPessoal() {
        System.out.println("Incluir Contato Pessoal:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        return new ContatoPessoal(nome, telefone, email);
    }

    public ContatoComercial lerNovoContatoComercial() {
        System.out.println("Incluir Contato Comercial:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Empresa: ");
        String empresa = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        return new ContatoComercial(nome, telefone, empresa, cargo);
    }

    public int lerCodigo() {
        System.out.print("Digite o código do contato: ");
        return scanner.nextInt();
    }

    public void mostrarContato(Contato contato) {
        if (contato != null) {
            System.out.println("Contato encontrado:");
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void listarContatos(Contato[] contatos) {
        System.out.println("Lista de contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public int lerOpcao() {
        return scanner.nextInt();
    }
}

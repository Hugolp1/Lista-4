package br.edu.up.view;

import java.util.Scanner;
import br.edu.up.modelos.*;

public class ClienteView {
    private Scanner scanner;

    public ClienteView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empresa");
        System.out.println("5. Emprestar para cliente pessoa");
        System.out.println("6. Emprestar para cliente empresa");
        System.out.println("7. Devolução de cliente pessoa");
        System.out.println("8. Devolução de cliente empresa");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public ClientePessoa lerNovoClientePessoa() {
        System.out.println("Incluir Cliente Pessoa:");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        return new ClientePessoa(codigo, nome);
    }

    public ClienteEmpresa lerNovoClienteEmpresa() {
        System.out.println("Incluir Cliente Empresa:");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        return new ClienteEmpresa(codigo, nome);
    }

    public int lerCodigo() {
        System.out.print("Digite o código do cliente: ");
        return scanner.nextInt();
    }

    public double lerValor() {
        System.out.print("Digite o valor: ");
        return scanner.nextDouble();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public int lerOpcao() {
        return scanner.nextInt();
    }
}
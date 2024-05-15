package br.edu.up.view;

import java.util.Scanner;
import br.edu.up.modelos.*;

public class SeguroView {
    private Scanner scanner;

    public SeguroView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public Seguro lerNovoSeguro() {
        System.out.println("Incluir Seguro:");
        System.out.print("Número da apólice: ");
        int numeroApolice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome do segurado: ");
        String segurado = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        return new Seguro(numeroApolice, segurado, valor) {
            @Override
            public String getTipoSeguro() {
                return null;
            }
        };
    }

    public int lerNumeroApolice() {
        System.out.print("Digite o número da apólice: ");
        return scanner.nextInt();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public String lerRespostaConfirmacao() {
        return scanner.nextLine();
    }

    public int lerOpcao() {
        return scanner.nextInt();
    }
}

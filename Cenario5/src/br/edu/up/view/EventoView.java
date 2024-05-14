package br.edu.up.view;

import java.util.List;
import java.util.Scanner;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;

public class EventoView {
    private Scanner scanner;

    public EventoView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Bem-vindo ao Sistema de Controle de Eventos");
        System.out.println("1. Adicionar evento");
        System.out.println("2. Listar eventos");
        System.out.println("3. Fazer reserva");
        System.out.println("4. Listar reservas de um evento");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int lerOpcao() {
        return scanner.nextInt();
    }

    public Evento lerNovoEvento() {
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite o nome do evento: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a data do evento: ");
        String data = scanner.nextLine();
        System.out.print("Digite o local do evento: ");
        String local = scanner.nextLine();
        System.out.print("Digite a lotação máxima do evento: ");
        int lotacaoMaxima = scanner.nextInt();
        System.out.print("Digite o preço do ingresso: ");
        double precoIngresso = scanner.nextDouble();
        return new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
    }

    public Reserva lerNovaReserva() {
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite o nome do responsável pela reserva: ");
        String responsavel = scanner.nextLine();
        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite a data da reserva: ");
        String dataReserva = scanner.nextLine();
        System.out.print("Digite o valor total da reserva: ");
        double valorTotal = scanner.nextDouble();
        return new Reserva(responsavel, quantidadePessoas, dataReserva, valorTotal);
    }

    public void mostrarEventos(List<Evento> eventos) {
        System.out.println("Lista de Eventos:");
        for (Evento evento : eventos) {
            System.out.println("Nome: " + evento.getNome() + ", Data: " + evento.getData() +
                    ", Local: " + evento.getLocal() + ", Ingressos Vendidos: " + evento.getIngressosVendidos() +
                    ", Preço do Ingresso: " + evento.getPrecoIngresso());
        }
    }

    public void mostrarReservas(List<Reserva> reservas) {
        System.out.println("Lista de Reservas:");
        for (Reserva reserva : reservas) {
            System.out.println("Responsável: " + reserva.getResponsavel() + ", Quantidade de Pessoas: " +
                    reserva.getQuantidadePessoas() + ", Data da Reserva: " + reserva.getDataReserva() +
                    ", Valor Total: " + reserva.getValorTotal());
        }
    }

    public void mostrarMensagem(String string) {
        System.out.println(string);
    }
}
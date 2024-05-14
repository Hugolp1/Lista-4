package br.edu.up.controller;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;
import br.edu.up.view.EventoView;

public class EventoController {
    private List<Evento> eventos;
    private EventoView view;

    public EventoController(EventoView view) {
        this.eventos = new ArrayList<>();
        this.view = view;
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void fazerReserva(Evento evento, Reserva reserva) {
        evento.adicionarReserva(reserva);
        evento.venderIngressos(reserva.getQuantidadePessoas());
    }

    public List<Reserva> getReservas(Evento evento) {
        return evento.getReservas();
    }

    public void iniciar() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerOpcao();
            switch (opcao) {
                case 1:
                    adicionarEvento();
                    break;
                case 2:
                    listarEventos();
                    break;
                case 3:
                    fazerReserva();
                    break;
                case 4:
                    listarReservas();
                    break;
                case 5:
                    view.mostrarMensagem("Saindo do sistema...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void adicionarEvento() {
        Evento novoEvento = view.lerNovoEvento();
        eventos.add(novoEvento);
    }

    private void listarEventos() {
        view.mostrarEventos(eventos);
    }

    private void fazerReserva() {
        listarEventos();
        System.out.print("Escolha o evento desejado (digite o índice): ");
        int indice = view.lerOpcao();
        if (indice >= 0 && indice < eventos.size()) {
            Evento eventoSelecionado = eventos.get(indice);
            Reserva novaReserva = view.lerNovaReserva();
            fazerReserva(eventoSelecionado, novaReserva);
            view.mostrarMensagem("Reserva realizada com sucesso!");
        } else {
            view.mostrarMensagem("Índice de evento inválido.");
        }
    }

    private void listarReservas() {
        listarEventos();
        System.out.print("Escolha o evento para listar as reservas (digite o índice): ");
        int indice = view.lerOpcao();
        if (indice >= 0 && indice < eventos.size()) {
            Evento eventoSelecionado = eventos.get(indice);
            List<Reserva> reservas = getReservas(eventoSelecionado);
            view.mostrarReservas(reservas);
        } else {
            view.mostrarMensagem("Índice de evento inválido.");
        }
    }
}

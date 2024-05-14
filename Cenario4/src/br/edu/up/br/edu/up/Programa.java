package br.edu.up;

import br.edu.up.controller.EstacionamentoController;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.view.EstacionamentoView;

public class Programa {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        EstacionamentoView view = new EstacionamentoView();
        EstacionamentoController controller = new EstacionamentoController(estacionamento, view);
        controller.iniciar();
    }
}
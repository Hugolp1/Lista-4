package br.edu.up;

import br.edu.up.controller.EventoController;
import br.edu.up.view.EventoView;

public class Programa {
    public static void main(String[] args) {
        EventoView view = new EventoView();
        EventoController controller = new EventoController(view);
        controller.iniciar();
    }
}
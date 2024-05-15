package br.edu.up;

import br.edu.up.controller.AeroportoController;
import br.edu.up.view.AeroportoView;

public class Programa {
    public static void main(String[] args) {
        AeroportoView view = new AeroportoView();
        AeroportoController controller = new AeroportoController(view);
        controller.iniciar();
    }
}

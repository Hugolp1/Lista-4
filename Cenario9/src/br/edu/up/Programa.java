package br.edu.up;

import br.edu.up.controller.ClienteController;

public class Programa {
    public static void main(String[] args) {
        ClienteController controller = new ClienteController(100);
        controller.iniciar();
    }
}


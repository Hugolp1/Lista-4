package br.edu.up;

import br.edu.up.controller.ControleAcademicoController;
import br.edu.up.view.ControleAcademicoView;

public class Programa {
    public static void main(String[] args) {
        ControleAcademicoView view = new ControleAcademicoView();
        ControleAcademicoController controller = new ControleAcademicoController(view);
        controller.iniciar();
    }
}
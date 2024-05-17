package br.edu.up;

public class Programa {
    public static void main(String[] args) {
        ControleAcademicoView view = new ControleAcademicoView();
        ControleAcademicoController controller = new ControleAcademicoController(view);
        controller.iniciar();
    }
}
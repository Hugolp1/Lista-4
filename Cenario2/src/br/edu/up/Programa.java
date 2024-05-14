package br.edu.up;

import br.edu.up.modelos.Ponto;

public class Programa {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância de ponto1 a ponto2: " + distanciaPonto1Ponto2);

        Ponto ponto3 = new Ponto(7, 2);
        double distanciaPonto2Ponto3 = ponto2.calcularDistancia(ponto3);
        System.out.println("Distância de ponto2 a (7,2): " + distanciaPonto2Ponto3);

        ponto1.setX(10);

        ponto1.setY(3);
    }
}

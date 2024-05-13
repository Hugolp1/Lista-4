package br.edu.up.modelos;

public class Ponto {
    private double x;
    private double y;

    // Construtor que cria um ponto na origem (0,0)
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    // Construtor que cria um ponto nas coordenadas (x, y)
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para calcular a distância entre este ponto e outro ponto
    public double calcularDistancia(Ponto outroPonto) {
        double distancia = Math.sqrt(Math.pow((this.x - outroPonto.x), 2) + Math.pow((this.y - outroPonto.y), 2));
        return distancia;
    }

    // Método para alterar o valor de x
    public void setX(double novoX) {
        this.x = novoX;
    }

    // Método para alterar o valor de y
    public void setY(double novoY) {
        this.y = novoY;
    }

    // Método para obter o valor de x
    public double getX() {
        return x;
    }

    // Método para obter o valor de y
    public double getY() {
        return y;
    }
}

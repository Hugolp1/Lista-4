package br.edu.up.modelos;

public abstract class Cliente {
    protected int codigo;
    protected String nome;
    protected double vlrEmprestado;
    protected double vlrMaximoCredito;

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.vlrEmprestado = 0.0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public void setVlrEmprestado(double vlrEmprestado) {
        this.vlrEmprestado = vlrEmprestado;
    }

    public double getVlrMaximoCredito() {
        return vlrMaximoCredito;
    }

    public abstract void emprestar(double valor);

    public abstract void devolver(double valor);
}

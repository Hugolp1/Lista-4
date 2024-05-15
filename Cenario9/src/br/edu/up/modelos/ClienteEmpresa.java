package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    public ClienteEmpresa(int codigo, String nome) {
        super(codigo, nome);
        this.vlrMaximoCredito = 25000.0;
    }

    @Override
    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= vlrMaximoCredito) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo realizado com sucesso para o cliente empresa.");
        } else {
            System.out.println("Valor do empréstimo excede o limite de crédito do cliente empresa.");
        }
    }

    @Override
    public void devolver(double valor) {
        if (vlrEmprestado - valor >= 0) {
            vlrEmprestado -= valor;
            System.out.println("Devolução realizada com sucesso para o cliente empresa.");
        } else {
            System.out.println("Valor de devolução excede o valor emprestado pelo cliente empresa.");
        }
    }
}

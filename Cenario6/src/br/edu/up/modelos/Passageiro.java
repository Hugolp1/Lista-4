package br.edu.up.modelos;

public class Passageiro {
    private String nome;
    private String rg;
    private String identificadorBagagem;
    private Passagem passagem;

    public Passageiro(String nome, String rg, String identificadorBagagem, Passagem passagem) {
        this.nome = nome;
        this.rg = rg;
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getIdentificadorBagagem() {
        return identificadorBagagem;
    }

    public void setIdentificadorBagagem(String identificadorBagagem) {
        this.identificadorBagagem = identificadorBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
}

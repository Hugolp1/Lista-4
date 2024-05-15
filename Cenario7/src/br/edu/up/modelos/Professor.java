package br.edu.up.modelos;

public class Professor {
    private String nome;
    private String rg;
    private String matricula;
    private String identificacaoLattes;
    private String titulacao;

    public Professor(String nome, String rg, String matricula, String identificacaoLattes, String titulacao) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
        this.identificacaoLattes = identificacaoLattes;
        this.titulacao = titulacao;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdentificacaoLattes() {
        return identificacaoLattes;
    }

    public void setIdentificacaoLattes(String identificacaoLattes) {
        this.identificacaoLattes = identificacaoLattes;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
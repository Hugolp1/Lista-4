package br.edu.up.modelos;

import java.util.List;

public class Tripulacao {
    private String nome;
    private String rg;
    private String identificacaoAeronautica;
    private String matricula;
    private int totalHorasVoo;
    private List<String> idiomas;
    
    public Tripulacao(String nome, String rg, String identificacaoAeronautica, String matricula) {
        this.nome = nome;
        this.rg = rg;
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matricula = matricula;
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

    public String getIdentificacaoAeronautica() {
        return identificacaoAeronautica;
    }

    public void setIdentificacaoAeronautica(String identificacaoAeronautica) {
        this.identificacaoAeronautica = identificacaoAeronautica;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }
}


package br.edu.up.modelos;

public class ContatoComercial extends Contato {
    private String empresa;
    private String cargo;

    public ContatoComercial(String nome, String telefone, String empresa, String cargo) {
        super(nome, telefone);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Empresa: " + empresa + ", Cargo: " + cargo;
    }
}

package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disciplina;
import br.edu.up.modelos.Professor;

public class ControleAcademicoView {
    private Scanner scanner;

    public ControleAcademicoView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Bem-vindo ao Controle Acadêmico");
        System.out.println("1. Cadastrar Professor");
        System.out.println("2. Cadastrar Aluno");
        System.out.println("3. Cadastrar Disciplina");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int lerOpcao() {
        return scanner.nextInt();
    }

    public Professor lerNovoProfessor() {
        scanner.nextLine();
        System.out.print("Digite o nome do professor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG do professor: ");
        String rg = scanner.nextLine();
        System.out.print("Digite a matrícula do professor: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite a identificação Lattes do professor: ");
        String identificacaoLattes = scanner.nextLine();
        System.out.print("Digite a titulação do professor: ");
        String titulacao = scanner.nextLine();
        return new Professor(nome, rg, matricula, identificacaoLattes, titulacao);
    }

    public Aluno lerNovoAluno() {
        scanner.nextLine();
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG do aluno: ");
        String rg = scanner.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o ano de ingresso do aluno: ");
        int anoIngresso = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do curso do aluno: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Digite o turno do aluno: ");
        String turno = scanner.nextLine();
        return new Aluno(nome, rg, matricula, anoIngresso, nomeCurso, turno);
    }

    public Disciplina lerNovaDisciplina() {
        scanner.nextLine();
        System.out.print("Digite o nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o identificador da disciplina: ");
        String identificador = scanner.nextLine();
        System.out.print("Digite o currículo da disciplina: ");
        String curriculo = scanner.nextLine();
        return new Disciplina(nome, identificador, curriculo, null, null, null);
    }

    public void mostrarMensagem(String string) {
        System.out.println(string);
    }
}
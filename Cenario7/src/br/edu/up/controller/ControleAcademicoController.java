package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disciplina;
import br.edu.up.modelos.Professor;
import br.edu.up.view.ControleAcademicoView;

public class ControleAcademicoController {
    private List<Professor> professores;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;
    private ControleAcademicoView view;

    public ControleAcademicoController(ControleAcademicoView view) {
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.view = view;
    }

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void iniciar() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerOpcao();
            switch (opcao) {
                case 1:
                    cadastrarProfessor(view.lerNovoProfessor());
                    break;
                case 2:
                    cadastrarAluno(view.lerNovoAluno());
                    break;
                case 3:
                    cadastrarDisciplina(view.lerNovaDisciplina());
                    break;
                case 4:
                    view.mostrarMensagem("Saindo do sistema...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }
}

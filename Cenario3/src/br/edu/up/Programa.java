package br.edu.up;

import java.util.List;

import br.edu.up.modelos.Agenda;
import br.edu.up.modelos.Compromisso;

public class Programa {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Compromisso compromisso1 = new Compromisso("João", "Café Central", 10, 15, 5);
        agenda.adicionarCompromisso(compromisso1);

        Compromisso compromisso2 = new Compromisso("Maria", "Teatro Municipal", 14, 20, 5);
        agenda.adicionarCompromisso(compromisso2);

        List<Compromisso> compromissos = agenda.getCompromissos();
        for (Compromisso compromisso : compromissos) {
            System.out.println("Compromisso:");
            System.out.println("Pessoa: " + compromisso.getPessoa());
            System.out.println("Local: " + compromisso.getLocal());
            System.out.println("Hora: " + compromisso.getHora());
            System.out.println("Dia: " + compromisso.getDia());
            System.out.println("Mês: " + compromisso.getMes());
            System.out.println();
        }
    }
}
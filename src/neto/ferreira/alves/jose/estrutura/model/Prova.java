package neto.ferreira.alves.jose.estrutura.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Prova {
    private String aluno;
    private List<Questao> questoes;
    private List<String> respostas;
    private double nota;
    private Scanner leitura = new Scanner(System.in);

    public Prova(String aluno, List<Questao> questoes) {
        this.aluno = aluno;
        this.questoes = questoes;
        this.respostas = new ArrayList<>();
        this.nota = 0.0;
    }

    public void aplicarProva() {
        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);
            System.out.println("\n" + (i + 1) + ") " + questao.getPergunta() + "\n");
            List<String> alternativas = questao.getAlternativas();
            for (int j = 0; j < alternativas.size(); j++) {
                System.out.println((char) ('a' + j) + ") " + alternativas.get(j));

            }
            System.out.println("\nSua resposta: ");
            respostas.add(leitura.nextLine());
        }
    }

    public void verRespostas() {
        System.out.println("\n**************************\n");
        System.out.println("Respostas do aluno aos itens: \n");
        System.out.println(respostas);
    }

    public void corrigirTeste() {
        System.out.println("\n**************************\n");
        System.out.println("Correção dos itens: \n");
        for (int i = 0; i < questoes.size(); i++) {
            if (Objects.equals(respostas.get(i), questoes.get(i).getRespostaCorreta())) {
                System.out.println("Questão " + (i + 1) + ": correta!");
                nota += 2;
            } else {
                System.out.println("Questão " + (i + 1) + ": incorreta!");
            }
        }
    }

    public void mostrarNota() {
        System.out.println("\n**************************\n");
        System.out.println("Nota do aluno: " + aluno + "\n");
        System.out.println(nota);
    }



}







package neto.ferreira.alves.jose.estrutura.model;

import java.util.List;

public class Prova {
    private String aluno;
    private List<String> questoes;
    private List<String> respostas;
    private List<Double> nota;


    public Prova(String aluno, List<String> questoes) {
        this.aluno = aluno;
        this.questoes = questoes;
        this.respostas = "9999";
        this.nota = 0.0;
    }

    public void aplicarProva() {}





}

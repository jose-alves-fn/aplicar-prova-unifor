package neto.ferreira.alves.jose.estrutura.model;

import java.util.List;

public class Prova {
    private String aluno;
    private List<Questao> questoes;
    private List<String> respostas;
    private List<Double> nota;

    public Prova(String aluno, List<Questao> questoes) {
        this.aluno = aluno;
        this.questoes = questoes;
//        this.respostas = "9999";
//        this.nota = 0.0;
    }

    public void aplicarProva() {
        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);
            System.out.println(i + 1 + ") " + questao.getPergunta());
            List<String> alternativas = questao.getAlternativas();
            for (int j = 0; j < alternativas.size(); j++) {
                System.out.println("   " + (char) ('a' + j) + ") " + alternativas.get(j));
            }
        }
    }
}







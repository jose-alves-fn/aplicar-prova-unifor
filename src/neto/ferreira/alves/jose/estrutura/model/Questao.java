package neto.ferreira.alves.jose.estrutura.model;

import java.util.List;
import java.util.Objects;

public class Questao {

    private String enunciadoQuestao;
    private List<String> alternativas;
    private String gabarito;

    public Questao(String enunciadoQuestao, List<String> alternativas, String gabarito) {
        this.enunciadoQuestao = enunciadoQuestao;
        this.alternativas = alternativas;
        this.gabarito = gabarito;
    }

    public void infoQuestao(){
        System.out.println("Enunciado:");
        System.out.println(enunciadoQuestao + "\n");
        System.out.println("Alternativas: ");
        for (int i = 0; i < alternativas.size(); i++) {
            System.out.println((char)('a' + i) + ") " + alternativas.get(i));
        }
    }

    public void alternativaCorreta(String alternativa) {
        if (Objects.equals(alternativa, alternativas.get(3))) {
            System.out.println("\nAlernativa correta!");
        } else
            System.out.println("\nAlternativa incorreta");
    }

}


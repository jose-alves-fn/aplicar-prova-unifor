package neto.ferreira.alves.jose.estrutura.model;

import java.util.Arrays;
import java.util.List;

public class Questao {
    private String pergunta;
    private List<String> alternativas;
    private String respostaCorreta;

    public Questao(String pergunta, List<String> alternativas, String respostaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }
}


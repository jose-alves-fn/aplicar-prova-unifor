
package neto.ferreira.alves.jose.estrutura.principal;

import neto.ferreira.alves.jose.estrutura.service.CadastroQuestoes;
import neto.ferreira.alves.jose.estrutura.model.Prova;
import neto.ferreira.alves.jose.estrutura.model.Questao;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        CadastroQuestoes cadastroQuestoes = new CadastroQuestoes();
        List<Questao> questoes = cadastroQuestoes.obterQuestoes();

        Prova prova = new Prova("Alves", questoes);

        prova.aplicarProva();
        prova.verRespostas();
        prova.corrigirItens();
        prova.corrigirTeste();
        prova.mostrarNota();
    }
}

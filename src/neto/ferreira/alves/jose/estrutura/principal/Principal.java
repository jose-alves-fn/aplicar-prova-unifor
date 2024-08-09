package neto.ferreira.alves.jose.estrutura.principal;

import neto.ferreira.alves.jose.estrutura.model.Prova;
import neto.ferreira.alves.jose.estrutura.model.Questao;

import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

//        String enunciado = "Leia a tirinha abaixo e marque a alternativa que corresponde ao que o gato está fazendo:";
//        List<String> alternativas = Arrays.asList(
//                "pensa que é um leão",
//                "pensa que é um tigre",
//                "imagina ser um cachorro",
//                "imagina ser um ser humano");
//
//        String gabarito = alternativas.get(3);
//
//        var questao = new Questao(enunciado, alternativas, gabarito);
//        questao.infoQuestao();
//
//        questao.alternativaCorreta("imagina ser um ser humano");


        // Cadastro de alternativas das questoes
        var questao_1 = new Questao("Qual das linguagens é uma linguagem fortemente tipada",
                Arrays.asList("Python", "Java", "JavaScript", "PHP"), "b");

        var questao_2 = new Questao("Qual das linguagens é uma linguagem fortemente tipada",
                Arrays.asList("MySQL", "PostgreSQL", "MongoDB", "Angular"), "b");










        // Cadastro dos itens da prova
        var prova = new Prova("Alves", Arrays.asList(
                "Qual das linguagens é uma linguagem fortemente tipada?",
                "Qual das opções abaixo não é um SGBD?",
                "O que é GIT?",
                "Qual das linguagens abaixo é muito usada em ciência de dados?",
                "Qual das opções abaixo não é uma ameaça a segurança de sistemas computacionais?"));

        prova.aplicarProva();



    }
}

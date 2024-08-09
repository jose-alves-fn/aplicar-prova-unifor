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
        var questao_1 = new Questao("Qual das linguagens é uma linguagem fortemente tipada?",
                Arrays.asList("Java", "Python", "JavaScript", "PHP"), "a");

        var questao_2 = new Questao("Qual das opções abaixo não é um SGBD?",
                Arrays.asList("MySQL", "PostgreSQL", "MongoDB", "Angular"), "d");

        var questao_3 = new Questao("O que é GIT?",
                Arrays.asList("Um sistema operacional", "Um sistema de controle de versão distribuído",
                        "Um editor de texto", "Um banco de dados relacional"), "b");

        var questao_4 = new Questao("Qual das linguagens abaixo é muito usada em ciência de dados?",
                Arrays.asList("JavaScript", "Python", "HTML", "CSS"), "b");

        var questao_5 = new Questao("Qual das opções abaixo não é uma ameaça a segurança de sistemas computacionais?",
                Arrays.asList("Malware", "Phishing", "Firewall", "Ransomware"), "c");


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

package neto.ferreira.alves.jose.estrutura.principal;

import neto.ferreira.alves.jose.estrutura.model.Prova;
import neto.ferreira.alves.jose.estrutura.model.Questao;

import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        // Cadastro de alternativas das questoes
        Questao questao_1 = new Questao("Qual das linguagens é uma linguagem fortemente tipada?",
                Arrays.asList("Java", "Python", "JavaScript", "PHP"), "a");

        Questao questao_2 = new Questao("Qual das opções abaixo não é um SGBD?",
                Arrays.asList("MySQL", "PostgreSQL", "MongoDB", "Angular"), "d");

        Questao questao_3 = new Questao("O que é GIT?",
                Arrays.asList("Um sistema operacional", "Um sistema de controle de versão distribuído",
                        "Um editor de texto", "Um banco de dados relacional"), "b");

        Questao questao_4 = new Questao("Qual das linguagens abaixo é muito usada em ciência de dados?",
                Arrays.asList("JavaScript", "Python", "HTML", "CSS"), "b");

        Questao questao_5 = new Questao("Qual das opções abaixo não é uma ameaça a segurança de sistemas computacionais?",
                Arrays.asList("Malware", "Phishing", "Firewall", "Ransomware"), "c");


        // Cadastro dos itens da prova
        Prova prova = new Prova("Alves", Arrays.asList(
                questao_1,
                questao_2,
                questao_3,
                questao_4,
                questao_5));


        prova.aplicarProva();
        prova.verRespostas();
        prova.corrigirTeste();
        prova.mostrarNota();

    }
}

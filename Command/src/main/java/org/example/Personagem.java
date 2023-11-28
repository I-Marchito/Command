package org.example;

public class Personagem {

    private String nome;
    private int nivel;
    private String quests;

    public Personagem (String nome, int nivel){
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getQuests() {return quests;}

    public void aceitarQuest() {this.quests = "Quest Aceita";}

    public void abandonarQuest() {this.quests = "Quest Abandonada";}
}
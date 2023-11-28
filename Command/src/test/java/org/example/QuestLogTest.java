package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestLogTest {

    QuestLog questlog;
    Personagem personagem;

    @BeforeEach
    void setUp(){
        questlog = new QuestLog();
        personagem = new Personagem("Alastair", 26);
    }

    @Test
    void deveAceitarQuest() {
        Quest aceitaQuest = new PersonagemAceitaQuest(personagem);
        questlog.executarQuest(aceitaQuest);

        assertEquals("Quest Aceita", personagem.getQuests());
    }

    @Test
    void deveAbandonarQuest() {
        Quest abandonaQuest = new PersonagemAbandonaQuest(personagem);
        questlog.executarQuest(abandonaQuest);

        assertEquals("Quest Abandonada", personagem.getQuests());
    }

    @Test
    void deveCancelarAbandonoDeQuest() {
        Quest aceitaQuest = new PersonagemAceitaQuest(personagem);
        Quest abandonaQuest = new PersonagemAbandonaQuest(personagem);

        questlog.executarQuest(aceitaQuest);
        questlog.executarQuest(abandonaQuest);

        questlog.cancelarUltimaExecucao();

        assertEquals("Quest Aceita", personagem.getQuests());
    }

}
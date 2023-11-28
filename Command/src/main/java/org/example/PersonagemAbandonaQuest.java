package org.example;

public class PersonagemAbandonaQuest implements Quest{

    private Personagem pc;

    public PersonagemAbandonaQuest(Personagem pc){this.pc = pc;}

    public void executar () {this.pc.abandonarQuest();}

    public void cancelar() {this.pc.aceitarQuest();}
}

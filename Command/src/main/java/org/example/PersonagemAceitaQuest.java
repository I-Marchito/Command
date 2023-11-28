package org.example;

public class PersonagemAceitaQuest implements Quest{

    private Personagem pc;

    public PersonagemAceitaQuest(Personagem pc){this.pc = pc;}

    public void executar () {this.pc.aceitarQuest();}

    public void cancelar() {this.pc.abandonarQuest();}

}

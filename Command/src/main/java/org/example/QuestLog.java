package org.example;

import java.util.ArrayList;
import java.util.List;

public class QuestLog {

    private List<Quest> quests = new ArrayList<Quest>();

    public void executarQuest(Quest quest) {
        this.quests.add(quest);
        quest.executar();
    }

    public void cancelarUltimaExecucao() {
        if (quests.size() != 0) {
            Quest quest = this.quests.get(this.quests.size() - 1);
            quest.cancelar();
            this.quests.remove(this.quests.size() - 1);
        }
    }

}

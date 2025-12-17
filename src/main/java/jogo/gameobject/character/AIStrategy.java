package jogo.gameobject.character;

import jogo.gameobject.character.Player;

/**
 * Interface Strategy para a IA.
 * Permite trocar o comportamento do NPC dinamicamente.
 */
public interface AIStrategy {
    void execute(Ally npc, Player player, float tpf);
}
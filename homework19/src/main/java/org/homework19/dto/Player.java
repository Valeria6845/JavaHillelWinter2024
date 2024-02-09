package org.homework19.dto;

import lombok.Getter;
import lombok.Setter;
import org.homework19.exceptions.NotRightChoiceException;

@Setter
@Getter

public class Player {
    private String name;
    private int wins;
    private int losses;
    private int draws;
    private int gamesPlayed;
    public void incWins() {
        wins++;
    }
    public void incLosses() {
        losses++;
    }
    public void incDraws() {
        draws++;
    }
    public void incGames() {
        gamesPlayed++;
    }
}

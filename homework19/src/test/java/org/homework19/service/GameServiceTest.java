package org.homework19.service;

import org.homework19.dto.Choice;
import org.homework19.dto.GameResult;
import org.homework19.dto.Player;
import org.homework19.exceptions.NotRightChoiceException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameServiceTest {
    GameService gs = new GameService();

    @Test
    void playersChoice() {
        assertEquals(Choice.ROCK, gs.playersChoice("r"));
        assertEquals(Choice.PAPER, gs.playersChoice("p"));
        assertEquals(Choice.SCISSORS, gs.playersChoice("s"));
    }
    @Test
    void playersChoiceException() {
        assertThrows(NotRightChoiceException.class, () -> gs.playersChoice("a"));
        assertThrows(NotRightChoiceException.class, () -> gs.playersChoice("n"));
        assertThrows(NotRightChoiceException.class, () -> gs.playersChoice("something"));
    }

    @Test
    void computersChoice() {
        List<Choice> results = List.of(Choice.ROCK, Choice.PAPER, Choice.SCISSORS);
        assertTrue(results.contains(gs.computersChoice()));
    }

    @Test
    void whoIsWinner() {
        assertEquals(GameResult.PLAYER, gs.whoIsWinner(Choice.ROCK, Choice.SCISSORS));
        assertEquals(GameResult.PLAYER, gs.whoIsWinner(Choice.PAPER, Choice.ROCK));
        assertEquals(GameResult.PLAYER, gs.whoIsWinner(Choice.SCISSORS, Choice.PAPER));
        assertEquals(GameResult.COMPUTER, gs.whoIsWinner(Choice.PAPER, Choice.SCISSORS));
        assertEquals(GameResult.COMPUTER, gs.whoIsWinner(Choice.ROCK, Choice.PAPER));
        assertEquals(GameResult.COMPUTER, gs.whoIsWinner(Choice.SCISSORS, Choice.ROCK));
        assertEquals(GameResult.DRAW, gs.whoIsWinner(Choice.ROCK, Choice.ROCK));
    }

    @Test
    void stat() {
        Player player = new Player();
        gs.stat(GameResult.PLAYER, player);
        gs.stat(GameResult.COMPUTER, player);
        gs.stat(GameResult.DRAW, player);
        assertEquals(3, player.getGamesPlayed());
        assertEquals(1, player.getWins());
        assertEquals(1, player.getLosses());
        assertEquals(1, player.getDraws());
    }
}
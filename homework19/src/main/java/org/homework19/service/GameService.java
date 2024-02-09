package org.homework19.service;

import org.homework19.dto.Choice;
import org.homework19.dto.GameResult;
import org.homework19.dto.Player;
import org.homework19.exceptions.NotRightChoiceException;

import java.util.Random;

public class GameService {
    public Choice playersChoice(String letter) {
        Choice choice = null;
        if (letter.equalsIgnoreCase("r")) {
            choice = Choice.ROCK;
        }else if (letter.equalsIgnoreCase("p")) {
            choice = Choice.PAPER;
        }else if (letter.equalsIgnoreCase("s")) {
            choice = Choice.SCISSORS;
        }else {
            throw new NotRightChoiceException();
        }
        return choice;
    }
    public Choice computersChoice() {
        Random rand = new Random();
        int num = rand.nextInt(3)+1;
        return switch (num) {
            case 1 -> Choice.ROCK;
            case 2 -> Choice.PAPER;
            case 3 -> Choice.SCISSORS;
            default -> null;
        };
    }
    public GameResult whoIsWinner(Choice pChoice, Choice cChoice) {
        if (pChoice.equals(Choice.ROCK) && cChoice.equals(Choice.SCISSORS)) {
            return GameResult.PLAYER;
        }else if (pChoice.equals(Choice.PAPER) && cChoice.equals(Choice.ROCK)) {
            return GameResult.PLAYER;
        }else  if (pChoice.equals(Choice.SCISSORS) && cChoice.equals(Choice.PAPER)) {
            return GameResult.PLAYER;
        }else if (pChoice.equals(Choice.ROCK) && cChoice.equals(Choice.PAPER)) {
            return GameResult.COMPUTER;
        }else  if (pChoice.equals(Choice.PAPER) && cChoice.equals(Choice.SCISSORS)) {
            return GameResult.COMPUTER;
        }else if (pChoice.equals(Choice.SCISSORS) && cChoice.equals(Choice.ROCK)) {
            return GameResult.COMPUTER;
        }else {
            return GameResult.DRAW;
        }
    }
    public void stat(GameResult result, Player p) {
        p.incGames();
        switch (result) {
            case PLAYER -> p.incWins();
            case COMPUTER -> p.incLosses();
            case DRAW -> p.incDraws();
        }
    }
}

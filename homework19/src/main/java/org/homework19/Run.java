package org.homework19;

import org.homework19.dto.Choice;
import org.homework19.dto.GameResult;
import org.homework19.dto.Player;
import org.homework19.exceptions.NotRightChoiceException;
import org.homework19.service.GameService;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, welcome! Please, enter your name: ");
        Player player = new Player();
        player.setName(scan.nextLine());
        System.out.println(player.getName()+", how many games do you want to play?");
        Run.game(scan.nextInt(), player);
        System.out.println("<<<---------------------------------->>>");
    }
    public static void game(int numOfGames, Player p) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numOfGames; i++) {
            int gameNum = i + 1;
            System.out.println("game " + gameNum + " of " + numOfGames + ": ");
            System.out.println(" ");
            System.out.println("What will you choose?" + "\n [R] -> ROCK" + "\n [P] -> PAPER" + "\n [S] -> SCISSORS");
            GameService gs = new GameService();
            boolean marker = true;
            Choice pChoice = null;
            while (marker) {
                try {
                    pChoice = gs.playersChoice(scanner.nextLine());
                } catch (NotRightChoiceException n) {
                    System.out.println("Wrong letter! Try again: ");
                    continue;
                }
                marker = false;
            }
            Choice cChoice = gs.computersChoice();
            System.out.println("<<<---------------------------------->>>");
            System.out.println("Your choice -> "+pChoice);
            System.out.println("Computers choice -> "+cChoice);
            System.out.println("...");
            GameResult result = gs.whoIsWinner(pChoice, cChoice);
            System.out.println(result);
            gs.stat(result, p);
            System.out.println("<<<---------------------------------->>>");
            if (i < numOfGames-1) {
                System.out.println("Start next game? [Y/N]");
                String isNext = "";
                boolean check = true;
                while (check) {
                    isNext = scanner.nextLine();
                    if (!isNext.equalsIgnoreCase("y") && !isNext.equalsIgnoreCase("n")) {
                        System.out.println("You can only choose [Y] (yes) or [N] (no)!");
                        continue;
                    }
                    check = false;
                }
                if (isNext.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
        System.out.println("Games played: "+p.getGamesPlayed()+"\n Wins: "+p.getWins()+"\n Losses: "+p.getLosses()+"\n Draws: "+p.getDraws());
    }
}

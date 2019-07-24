package com.kodilla.rps;

import java.util.ArrayList;

public class GameItself {
    String playerName;
    int numberOfRounds;

    public GameItself(String playerName, int numberOfRounds) {
        this.playerName = playerName;
        this.numberOfRounds = numberOfRounds;
    }
    public String getPlayerName() {
        return playerName;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void Game(){
        int computerPoints = 0;
        int userPoints = 0;
        int rounds = 1;

        ArrayList<UserSelection> UserSelection = new ArrayList<>();
        UserSelection.add(com.kodilla.rps.UserSelection.ROCK);
        UserSelection.add(com.kodilla.rps.UserSelection.PAPER);
        UserSelection.add(com.kodilla.rps.UserSelection.SCISSORS);
        UserSelection.add(com.kodilla.rps.UserSelection.LIZARD);
        UserSelection.add(com.kodilla.rps.UserSelection.SPOCK);

        UserInputScreen userInputScreen = new UserInputScreen();

        for(int r=0; r<getNumberOfRounds();r++){
            RpsRandom rpsRandom = new RpsRandom();
            int computerMove = rpsRandom.generateRandom();

            System.out.println("Current round: " + rounds);
            System.out.println(" ");
            System.out.println("Ok " + getPlayerName() + " please make Your choice");
            System.out.println(" ");

            UserSelection userChoice = userInputScreen.OptionsScreen();
            if(userChoice.equals(com.kodilla.rps.UserSelection.QUIT)){
                System.exit(0);
            }
            if(userChoice.equals(com.kodilla.rps.UserSelection.NEW_GAME)){
                RpsRunner.playGame();
            }
            System.out.println("User chose: " + userChoice);

            Dependencies compareInputs = new Dependencies();
            compareInputs.DependenciesChecker();

            System.out.println("PC chose: " + UserSelection.get(computerMove));
            System.out.println("Result: " + compareInputs.whoWin(userChoice,UserSelection.get(computerMove)));

            compareInputs.ScoreCounter(userChoice,UserSelection.get(computerMove));

            computerPoints = computerPoints + compareInputs.getScoreForPc();
            userPoints = userPoints + compareInputs.getScoreForUsr();

            userInputScreen.ScoreScreen(computerPoints,userPoints);

            rounds = rounds +1;
        }
    }
}

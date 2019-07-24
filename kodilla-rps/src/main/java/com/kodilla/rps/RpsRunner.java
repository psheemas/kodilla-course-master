package com.kodilla.rps;

public class RpsRunner {
    public static void playGame(){
        UserInputScreen userInputScreen = new UserInputScreen();
        GameItself newGame = new GameItself(userInputScreen.MainMenuScreen(), userInputScreen.NumberOfRounds());
        newGame.Game();
    }
    public static void main(String[] args) {
        RpsRunner.playGame();
    }

}
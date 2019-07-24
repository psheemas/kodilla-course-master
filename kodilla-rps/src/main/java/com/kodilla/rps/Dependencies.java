package com.kodilla.rps;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

public class Dependencies {
    int scoreForPc = 0;
    int scoreForUsr =0;

    Map<UserSelection, Map<UserSelection, Winner>> whoWinsMap = new HashMap<>();

    public int getScoreForPc() {
        return scoreForPc;
    }

    public int getScoreForUsr() {
        return scoreForUsr;
    }

    public void DependenciesChecker (){

        Map<UserSelection,Winner> scissorsMap = new HashMap();
        scissorsMap.put(UserSelection.SCISSORS, Winner.DRAW);
        scissorsMap.put(UserSelection.ROCK,Winner.COMPUTER);
        scissorsMap.put(UserSelection.PAPER, Winner.HUMAN);
        scissorsMap.put(UserSelection.LIZARD,Winner.HUMAN);
        scissorsMap.put(UserSelection.SPOCK, Winner.COMPUTER);

        Map<UserSelection,Winner> rockMap = new HashMap();
        rockMap.put(UserSelection.SCISSORS, Winner.HUMAN);
        rockMap.put(UserSelection.ROCK,Winner.DRAW);
        rockMap.put(UserSelection.PAPER, Winner.COMPUTER);
        rockMap.put(UserSelection.LIZARD,Winner.HUMAN);
        rockMap.put(UserSelection.SPOCK, Winner.COMPUTER);

        Map<UserSelection,Winner> paperMap = new HashMap();
        paperMap.put(UserSelection.SCISSORS, Winner.COMPUTER);
        paperMap.put(UserSelection.ROCK,Winner.HUMAN);
        paperMap.put(UserSelection.PAPER, Winner.DRAW);
        paperMap.put(UserSelection.LIZARD,Winner.COMPUTER);
        paperMap.put(UserSelection.SPOCK, Winner.HUMAN);

        Map<UserSelection,Winner> lizardMap = new HashMap();
        lizardMap.put(UserSelection.SCISSORS, Winner.COMPUTER);
        lizardMap.put(UserSelection.ROCK,Winner.COMPUTER);
        lizardMap.put(UserSelection.PAPER, Winner.HUMAN);
        lizardMap.put(UserSelection.LIZARD,Winner.DRAW );
        lizardMap.put(UserSelection.SPOCK, Winner.HUMAN);

        Map<UserSelection,Winner> spockMap = new HashMap();
        spockMap.put(UserSelection.SCISSORS, Winner.HUMAN);
        spockMap.put(UserSelection.ROCK,Winner.HUMAN);
        spockMap.put(UserSelection.PAPER, Winner.COMPUTER);
        spockMap.put(UserSelection.LIZARD,Winner.COMPUTER);
        spockMap.put(UserSelection.SPOCK, Winner.DRAW);

        whoWinsMap.put(UserSelection.SCISSORS,scissorsMap);
        whoWinsMap.put(UserSelection.ROCK,rockMap);
        whoWinsMap.put(UserSelection.PAPER,paperMap);
        whoWinsMap.put(UserSelection.LIZARD,lizardMap);
        whoWinsMap.put(UserSelection.SPOCK,spockMap);

    }
    public Winner whoWin(UserSelection userImput,UserSelection computerImput){
        return whoWinsMap.get(userImput).get(computerImput);
    }
    public int ScoreCounter(UserSelection userImput,UserSelection computerImput) {

        if(whoWinsMap.get(userImput).get(computerImput).equals(Winner.COMPUTER)){
            return scoreForPc++;
        }else if(whoWinsMap.get(userImput).get(computerImput).equals(Winner.HUMAN)){
            return scoreForUsr++;
        }
        return 0;
    }
}
package com.kodilla.good.patterns.food2door;

import java.util.Scanner;

public class UserInput {
    public Scanner scanner = new Scanner(System.in);

    public ProducentsInterface OptionsScreen() {
        ListOfProducers listOfProducers = new ListOfProducers();

        while (true) {
            System.out.println("Key [1] - " + listOfProducers.producentsList().get(0).companyName());
            System.out.println("Key [2] - " + listOfProducers.producentsList().get(1).companyName());
            System.out.println("Key [3] - " + listOfProducers.producentsList().get(2).companyName());
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1":
                    return listOfProducers.producentsList().get(0);
                case "2":
                    return listOfProducers.producentsList().get(1);
                case "3":
                    return listOfProducers.producentsList().get(2);
                default:
                    System.out.println("Wrong selection, enter Your choice again!");
            }
        }
    }
}

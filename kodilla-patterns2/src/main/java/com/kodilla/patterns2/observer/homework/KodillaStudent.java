package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaStudent implements Observable {
    private final List<Observer> observers;
    private final List<String> homeworkToCheck;
    private final String name;

    public KodillaStudent(String name){
        observers = new ArrayList<>();
        homeworkToCheck = new ArrayList<>();
        this.name = name;
    }

    public void addHomeworkToCheck(String homework){
        homeworkToCheck.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public List<String> getHomeworkToCheck() {
        return homeworkToCheck;
    }

    public String getName() {
        return name;
    }
}

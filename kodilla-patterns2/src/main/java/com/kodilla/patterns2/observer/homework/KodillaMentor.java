package com.kodilla.patterns2.observer.homework;

public class KodillaMentor implements Observer {
    private final String mentroName;
    private int updateCount;

    public KodillaMentor(String mentroName){
        this.mentroName = mentroName;
    }

    @Override
    public void update(KodillaStudent kodillaStudentHomework){
        System.out.println(mentroName + ": New homework to check " + kodillaStudentHomework.getName() + "\n" +
                " (total: " + kodillaStudentHomework.getHomeworkToCheck().size() + " homeworks to check");
        updateCount++;
    }

    public String getMentroName(){
        return mentroName;
    }

    public int getUpdateCount(){
        return updateCount;
    }
}

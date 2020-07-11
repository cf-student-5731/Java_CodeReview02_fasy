package at.fasy.studying.java.codereview02;

import java.util.ArrayList;

public class IntervalWorkout {

    private ArrayList<Exercise> myExercises;
    private int repetitions;
    private int breakTime;

    public IntervalWorkout(ArrayList<Exercise> myExercises, int repetitions, int breakTime){
        this.myExercises = myExercises;
        this.repetitions = repetitions;
        this.breakTime = breakTime;
    }

    public void printIntervalTraining(){
        System.out.println("*****************************");
        System.out.println("Interval Workout STARTS !!!!");
        System.out.println("*****************************");

        for (int i = 1; i < repetitions; i++) {

            System.out.println("============================");
            System.out.println("Round " + i + ": ");

            for (Exercise ex : myExercises){
                System.out.println(ex.getName());
            }

            if (i < repetitions) {
                System.out.println("============================");
                System.out.println("DO THE BREAK (" + breakTime + " SECONDS)");
            }
        }
        System.out.println();
        System.out.println("****************************");
        System.out.println(" CONGRATS - YOU ARE DONE !!!");
        System.out.println("****************************");
    }

}

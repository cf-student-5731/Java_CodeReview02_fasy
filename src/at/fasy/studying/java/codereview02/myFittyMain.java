package at.fasy.studying.java.codereview02;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class myFittyMain {

     public static void main(String[] args) {

          Exercise exercise01 = new Exercise("Push-Ups", "Place your hands on the floor.\n" +
                 "Raise up onto your toes so that all of your body weight is on your hands and your feet.\n" +
                 "Bend your elbows and lower your chest down toward the floor.\n" +
                 "Then, push off the floor and extend them so that you return to starting position.", 30, Exercise.Positions.floor);

         Exercise exercise02 = new Exercise("Planks", "Start on the floor on your hands and knees.\n" +
                 "Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart.\n" +
                 "Maintain a straight line from heels through the top of your head, looking down at the floor." +
                 "Now, tighten your abs and hold.", 90, Exercise.Positions.floor);

         Exercise exercise03 = new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles.\n" +
                 "Extend arms out straight so they are parallel with the ground, palms facing down.\n" +
                 "Goto a squat and exhale, then explode back up to standing, driving through heels.\n",
                 45, Exercise.Positions.standup);

         Exercise exercise04 = new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor.\n" +
                 "Your back is straight. Lift your leg up, and straighten it.\n" +
                 "Form a 90 degree angle in the ankle. Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs.\n" +
                 "Return to the starting position and repeat.", 60, Exercise.Positions.floor);

         Exercise exercise05 = new Exercise("Leg Curl", "Stand up on, shift your weight to one feet and pull another heel toward your buttocks." +
                 "Stay for 15 seconds, then repeat with your other leg.", 90, Exercise.Positions.standup);

         Exercise exercise06 = new Exercise("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side." +
                 "Repeat with other hand.", 60, Exercise.Positions.standup);



         ArrayList<Exercise> myExercises = new ArrayList<>();
         myExercises.add(exercise01);
         myExercises.add(exercise02);
         myExercises.add(exercise03);
         myExercises.add(exercise04);
         myExercises.add(exercise05);
         myExercises.add(exercise06);

         System.out.println();
         System.out.println("ALL EXERCISES");
         for (Exercise ex : myExercises) {
             ex.printExercise();
             System.out.println();
             System.out.println();
         }

         System.out.println();
         System.out.println("ALL FLOOR EXERCISES");
         for (Exercise ex : myExercises) {
             if(ex.getPosition() == Exercise.Positions.floor){
                 ex.printExercise();
                 System.out.println();
                 System.out.println();
             }
         }

         System.out.println();
         System.out.println("ALL FLOOR EXERCISES LONGER THAN 1 MINUTE");
         for (Exercise ex : myExercises) {
             if(ex.getPosition() == Exercise.Positions.floor && ex.getDuration() > 60){
                 ex.printExercise();
                 System.out.println();
                 System.out.println();
             }
         }

         ArrayList<Exercise> intervalExercises = new  ArrayList<>();
         intervalExercises.add(exercise01);
         intervalExercises.add(exercise03);
         intervalExercises.add(exercise02);

         IntervalWorkout myWorkout01 = new IntervalWorkout(intervalExercises, 4, 30);
         myWorkout01.printIntervalTraining();




    }
}

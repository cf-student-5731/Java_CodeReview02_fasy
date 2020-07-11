package at.fasy.studying.java.codereview02;

public class Exercise {
    private String name;
    private String description;
    private int duration;
    enum Positions{
        floor,
        standup
    }
    private Positions position;

    Exercise(String name, String description, int duration, Positions position){
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public int getDuration(){
        return this.duration;
    }

    public Positions getPosition(){
        return this.position;
    }

    public void printExercise(){
        System.out.printf("%-30s" + "DURATION: " + "%d" + " seconds" + "%n", getName().toUpperCase(), getDuration());
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-30s" + "%s" +"%s" + "%s" + "%n" + "%s" + "%n", "DESCRIPTION: ", "Go to " , getPosition(), " Position!", getDescription());
        System.out.println("===================================================================================");
    }
}

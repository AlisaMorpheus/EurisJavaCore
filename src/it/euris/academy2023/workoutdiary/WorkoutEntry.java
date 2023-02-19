package it.euris.academy2023.workoutdiary;

import java.util.Date;

public class WorkoutEntry {

    private String date;
    private String name;
    private int repetitions;
    private int weight;

    public WorkoutEntry(String date, String name, int repetitions, int weight) {
        this.date = date;
        this.name = name;
        this.repetitions = repetitions;
        this.weight = weight;
    }

    public WorkoutEntry() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Date= " + date +
                "\nExercise name= " + name +
                "\nRepetitions= " + repetitions +
                "\nWeight= " + weight +
                "kg \n--------------------------------";
    }
}

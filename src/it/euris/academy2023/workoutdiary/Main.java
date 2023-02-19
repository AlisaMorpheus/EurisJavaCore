package it.euris.academy2023.workoutdiary;

public class Main {
    public static void main(String[] args) {

        WorkoutManager workoutManager = new WorkoutManager();
        workoutManager.load("workoutFile.csv");
        workoutManager.printLogs();
        workoutManager.printStats();
        //w.load(new DataLoader() {….});
    }
}

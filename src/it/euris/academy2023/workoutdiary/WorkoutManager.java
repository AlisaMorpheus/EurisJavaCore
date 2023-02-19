package it.euris.academy2023.workoutdiary;

import it.euris.academy2023.frazione.Frazione;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkoutManager {

    private List<WorkoutEntry> workoutEntries;

    public void load(String csv) {
        //conversione in obj e split al ;
        List<String> csvData = Utils.readCsv(csv);
        workoutEntries = convert(csvData);
    }

    // Gestisce la conversione di una lista di stringhe in una lista di WorkoutEntries
    private List<WorkoutEntry> convert(List<String> csvData) {
        List<WorkoutEntry> workoutEntryList = new ArrayList<>();
        for (String line : csvData) {
            WorkoutEntry wo = convert(line);
            workoutEntryList.add(wo);
        }
        return workoutEntryList;
    }

    // Gestisce la conversione di una stringa in una entry
    private WorkoutEntry convert(String line) {
        // Split su ";" e creazione dell'asset class
        String[] tokens = line.split(";");
        String date = tokens[0];
        String name = tokens[1];
        int repetitions = Integer.parseInt(tokens[2]);
        int weight = Integer.parseInt(tokens[3]);
        return new WorkoutEntry(date, name, repetitions, weight);
    }

    //per stampare tutti gli allenamenti caricati
    public void printLogs() {
        for (WorkoutEntry wo : workoutEntries) {
            System.out.println(wo.toString());
        }
    }

    //HashMap<String, Integer> map = new HashMap<>();
   /* public void cicleMap() {
        for (WorkoutEntry wo : workoutEntries) {
        map.put(wo.getName(), wo.getWeight());
        }
        //System.out.println(map);
    }*/

    //massimale x ogni categoria
    public void printStats() {
        Map<String, Integer> prByWorkoutName = new HashMap<>();
        for (WorkoutEntry wo : workoutEntries) {
            prByWorkoutName.putIfAbsent(wo.getName(), wo.getWeight());
            if (wo.getWeight() > prByWorkoutName.get(wo.getName())) {
                prByWorkoutName.put(wo.getName(), wo.getWeight());
            }
        }
        for (String key : prByWorkoutName.keySet()) {
            System.out.println("--------------------------------\nMAX " + key + ": " + prByWorkoutName.get(key) + " kg");
        }
    }
}

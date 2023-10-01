package Illness;

import Person.Person;

import java.util.*;

public class Cancer implements Illness {
    private int stages = 4;
    List<String> symptoms = List.of("Fatigue", "Weight Loss");

    @Override
    public void diagnose(Person person, List<String> cSymptoms) {
        int points = 0;

        for (String symptom : cSymptoms) {
            if (symptom.equals("Fatigue") || symptom.equals("Weight Loss")) {
                points++;
            }
        }

        if (points >= 2) {
            System.out.println("Diagnosed with Cancer.");
            person.setCurrentIllness(this);
            person.setIsIll(true);
        } else {
            System.out.println("No specific illness detected.");
        }
    }

    @Override
    public void doDamage(Person person) {
        if (stages > 0) {
            stages--;
            System.out.println("Cancer worsened. Remaining stages: " + stages);
        } else {
            System.out.println("Cancer reached critical stage. Cannot be cured.");
            person.setIsIll(false);
        }
    }

    @Override
    public void getSymptoms() {
        System.out.println(symptoms);
    }
}


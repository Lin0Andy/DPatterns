package Illness;

import Person.Person;

import java.util.*;

public class Diabetes implements Illness {
    private int stages = 3;
    List<String> symptoms = List.of("Frequent Urination", "Increased Thirst");

    @Override
    public void diagnose(Person person, List<String> cSymptoms) {
        int points = 0;

        for (String symptom : cSymptoms) {
            if (symptom.equals("Frequent Urination") || symptom.equals("Increased Thirst")) {
                points++;
            }
        }

        if (points >= 2) {
            System.out.println("Diagnosed with Diabetes.");
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
            System.out.println("Diabetes worsened. Remaining stages: " + stages);
        } else {
            System.out.println("Diabetes reached critical stage. Cannot be cured.");
            person.setIsIll(false);
        }
    }

    @Override
    public void getSymptoms() {
        System.out.println(symptoms);
    }
}

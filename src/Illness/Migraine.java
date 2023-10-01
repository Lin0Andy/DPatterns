package Illness;

import Person.Person;
import java.util.*;

public class Migraine implements Illness {
    private int stages = 3;
    List<String> symptoms = List.of("Headache", "Nausea");

    @Override
    public void diagnose(Person person, List<String> cSymptoms) {
        int points = 0;

        for (String symptom : cSymptoms) {
            if (symptom.equals("Headache") || symptom.equals("Nausea")) {
                points++;
            }
        }

        if (points >= 2) {
            System.out.println("Diagnosed with Migraine.");
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
            System.out.println("Migraine worsened. Remaining stages: " + stages);
        } else {
            System.out.println("Migraine reached critical stage. Cannot be cured.");
            person.setIsIll(false);
        }
    }

    @Override
    public void getSymptoms() {
        System.out.println(symptoms);
    }
}

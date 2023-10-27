package Illness;

import Decorations.Decorator;
import Person.Person;

import java.util.List;

public class Flu implements Illness {
    List<String> symptoms = List.of("Fever", "Cough");

    @Override
    public void diagnose(Person person, List<String> cSymptoms, int stages) {
        int points = 0;

        for (String symptom : cSymptoms) {
            if (symptom.equals("Fever") || symptom.equals("Cough")) {
                points++;
            }
        }

        if (points >= 2) {
            System.out.println("Diagnosed with Flu.");
            person.setCurrentIllness(this);
            person.setIsIll(true);
        } else {
            System.out.println("No specific illness detected.");
            doDamage(person, stages);
        }
    }

    @Override
    public void doDamage(Person person, int stages) {
        if (stages > 0) {
            stages--;
            System.out.println("Your illness worsened. Remaining stages: " + stages);
        } else {
            System.out.println("Your illness reached critical stage. Cannot be cured.");
            person.setIsIll(false);
        }
    }

    @Override
    public void getSymptoms() {
        System.out.println(symptoms);
    }
}
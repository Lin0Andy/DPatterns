package Illness;

import Person.Person;

import java.util.*;
import Adaptor.*;

public class Diabetes implements Illness {
    Adapter adapter = new Adapter();
    List<String> symptoms = List.of(adapter.getMessage("symptom.symptom7"), adapter.getMessage("symptom.symptom8"));

    @Override
    public void diagnose(Person person, List<String> cSymptoms, int stages, Adapter adapter) {
        int points = 0;

        for (String symptom : cSymptoms) {
            if (symptom.equals(adapter.getMessage("symptom.symptom7")) || symptom.equals(adapter.getMessage("symptom.symptom8"))) {
                points++;
            }
        }

        if (points >= 2) {
            System.out.println(adapter.getMessage("diagnose.diabetes"));
            person.setCurrentIllness(this);
            person.setIsIll(true);
        } else {
            System.out.println(adapter.getMessage("diagnose.no"));
            doDamage(person, stages, adapter);
        }
    }

    @Override
    public void doDamage(Person person, int stages, Adapter adapter) {
        if (stages > 0) {
            stages--;
            System.out.println(adapter.getMessage("stages.remaining") + " " + stages);
        } else {
            System.out.println(adapter.getMessage("stages.critical"));
            person.setIsIll(false);
        }
    }

    @Override
    public void getSymptoms() {
        System.out.println(symptoms);
    }
}

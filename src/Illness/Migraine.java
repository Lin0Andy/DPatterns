package Illness;

import Adaptor.Adapter;
import Decorations.Decorator;
import Person.Person;
import java.util.*;

public class Migraine implements Illness {
    Adapter adapter = new Adapter();
    List<String> symptoms = List.of(adapter.getMessage("symptom.symptom5"), adapter.getMessage("symptom.symptom6"));

    @Override
    public void diagnose(Person person, List<String> cSymptoms, int stages, Adapter adapter) {
        int points = 0;

        for (String symptom : cSymptoms) {
            if (symptom.equals(adapter.getMessage("symptom.symptom5")) || symptom.equals(adapter.getMessage("symptom.symptom6"))) {
                points++;
            }
        }

        if (points >= 2) {
            System.out.println(adapter.getMessage("diagnose.migraine"));
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

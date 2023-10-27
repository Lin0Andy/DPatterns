package Illness;

import Person.Person;
import Adaptor.*;
import java.util.List;

public class Flu implements Illness {
    Adapter adapter = new Adapter();
    List<String> symptoms = List.of(adapter.getMessage("symptom.symptom1"), adapter.getMessage("symptom.symptom2"));

    @Override
    public void diagnose(Person person, List<String> cSymptoms, int stages, Adapter adapter) {
        int points = 0;

        for (String symptom : cSymptoms) {
            if (symptom.equals(adapter.getMessage("symptom.symptom1")) || symptom.equals(adapter.getMessage("symptom.symptom2"))) {
                points++;
            }
        }

        if (points >= 2) {
            System.out.println(adapter.getMessage("diagnose.flu"));
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


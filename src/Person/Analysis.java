package Person;

import Illness.*;
import Treatment.*;
import java.util.*;
import Observer.*;

public class Analysis {
    private final List<ObserverPattern> observers = new ArrayList<>();

    public void analyzeSymptoms(Person person, List<String> symptoms, List<Illness> illnesses, int stages) {
        for (Illness illness : illnesses) {
            illness.diagnose(person, symptoms, stages);
            stages--;

            if (person.getIsIll() && person.getCurrentIllness() == illness) {
                if (treated(person)) {
                    System.out.println("Success! You are cured.");
                    return;
                }
            }
        }

        System.out.println("No suitable treatment found. The illness could not be cured.");
    }

    private boolean treated(Person person) {
        Treatment treatment = getTreatmentForIllness(person.getCurrentIllness());

        if (treatment != null) {
            treatment.apply(person);
            return true;
        }

        return false;
    }

    private Treatment getTreatmentForIllness(Illness illness) {
        if (illness instanceof Flu) {
            return new Antibiotics();
        } else if (illness instanceof Diabetes) {
            return new InsulinTherapy();
        } else if (illness instanceof Migraine) {
            return new PainManagement();
        } else if (illness instanceof Cancer) {
            return new Chemotherapy();
        } else {
            return null;
        }
    }

    public void addObserver(ObserverPattern observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverPattern observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (ObserverPattern observer : observers) {
            observer.update(message);
        }
    }
}

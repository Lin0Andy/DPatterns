package Person;

import Illness.*;
import Treatment.*;
import java.util.*;

public class Analysis {
    public void analyzeSymptoms(Person person, List<String> symptoms, List<Illness> illnesses) {
        for (Illness illness : illnesses) {
            illness.diagnose(person, symptoms);

            if (person.getIsIll() && person.getCurrentIllness() == illness) {
                if (treat(person)) {
                    System.out.println("Success! You are cured.");
                    return;
                }
            }
        }

        System.out.println("No suitable treatment found. The illness could not be cured.");
    }

    private boolean treat(Person person) {
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
}

package Person;

import Illness.*;
import Treatment.*;
import Adaptor.*;

import java.util.*;

public class Analysis {
    public void analyzeSymptoms(Person person, List<String> symptoms, List<Illness> illnesses, int stages, Adapter adapter) {
        for (Illness illness : illnesses) {
            illness.diagnose(person, symptoms, stages, adapter);
            stages--;

            if (person.getIsIll() && person.getCurrentIllness() == illness) {
                if (treated(person, adapter)) {
                    System.out.println(adapter.getMessage("cure.success"));
                    return;
                }
            }
        }

        System.out.println(adapter.getMessage("cure.notfound"));
    }

    private boolean treated(Person person, Adapter adapter) {
        Treatment treatment = getTreatmentForIllness(person.getCurrentIllness());

        if (treatment != null) {
            treatment.apply(person, adapter);
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

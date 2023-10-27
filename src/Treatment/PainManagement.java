package Treatment;

import Illness.*;
import Person.*;

public class PainManagement implements Treatment {
    @Override
    public void apply(Person person) {
        if (person.getCurrentIllness() instanceof Migraine) {
            System.out.println("Applying pain management to cure Migraine...");
            person.setCurrentTreatment(this);
            person.setIsIll(false);
        } else {
            System.out.println("Incorrect treatment. The illness cannot be cured with pain management.");
        }
    }
}



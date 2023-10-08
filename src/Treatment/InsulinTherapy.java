package Treatment;

import Illness.*;
import Person.*;

public class InsulinTherapy implements Treatment {
    @Override
    public void apply(Person person) {
        if (person.getCurrentIllness() instanceof Diabetes) {
            System.out.println("Applying insulin therapy to cure Diabetes...");
            person.setCurrentTreatment(this);
            person.setIsIll(false);
        } else {
            System.out.println("Incorrect treatment. The illness cannot be cured with insulin therapy.");
        }
    }
}



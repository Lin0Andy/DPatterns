package Treatment;

import Illness.*;
import Adaptor.*;
import Person.*;

public class InsulinTherapy implements Treatment {
    @Override
    public void apply(Person person, Adapter adapter) {
        if (person.getCurrentIllness() instanceof Diabetes) {
            System.out.println(adapter.getMessage("cure.insulinTherapy"));
            person.setCurrentTreatment(this);
            person.setIsIll(false);
        } else {
            System.out.println(adapter.getMessage("cure.incorrect"));
        }
    }
}



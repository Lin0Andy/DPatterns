package Treatment;

import Illness.*;
import Person.*;
import Adaptor.*;

public class PainManagement implements Treatment {
    @Override
    public void apply(Person person, Adapter adapter) {
        if (person.getCurrentIllness() instanceof Migraine) {
            System.out.println(adapter.getMessage("cure.painManagement"));
            person.setCurrentTreatment(this);
            person.setIsIll(false);
        } else {
            System.out.println(adapter.getMessage("cure.incorrect"));
        }
    }
}



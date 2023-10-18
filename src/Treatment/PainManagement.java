package Treatment;

import Adaptor.Adapter;
import Illness.*;
import Person.*;

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



package Treatment;

import Illness.*;
import Person.*;
import Adaptor.*;

public class Chemotherapy implements Treatment {
    @Override
    public void apply(Person person, Adapter adapter) {
        if (person.getCurrentIllness() instanceof Cancer) {
            System.out.println(adapter.getMessage("cure.chemotherapy"));
            person.setCurrentTreatment(this);
            person.setIsIll(false);
        } else {
            System.out.println(adapter.getMessage("cure.incorrect"));
        }
    }
}


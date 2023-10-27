package Treatment;

import Person.*;
import Illness.*;
import Adaptor.*;

public class Antibiotics implements Treatment {
    @Override
    public void apply(Person person, Adapter adapter) {
        if (person.getCurrentIllness() instanceof Flu) {
            System.out.println(adapter.getMessage("cure.antibiotics"));
            person.setCurrentTreatment(this);
            person.setIsIll(false);
        } else {
            System.out.println(adapter.getMessage("cure.incorrect"));
        }
    }
}

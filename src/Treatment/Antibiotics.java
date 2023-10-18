package Treatment;

import Adaptor.Adapter;
import Person.*;
import Illness.*;

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

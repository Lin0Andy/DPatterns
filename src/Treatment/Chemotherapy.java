package Treatment;

import Illness.*;
import Person.*;
public class Chemotherapy implements Treatment {
    @Override
    public void apply(Person person) {
        if (person.getCurrentIllness() instanceof Cancer) {
            System.out.println("Applying chemotherapy to cure Cancer...");
            person.setCurrentTreatment(this);
            person.setIsIll(false);
        } else {
            System.out.println("Incorrect treatment. The illness cannot be cured with chemotherapy.");
        }
    }
}


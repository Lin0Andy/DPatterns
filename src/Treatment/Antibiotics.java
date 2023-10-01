package Treatment;

import Person.*;
import Illness.*;

public class Antibiotics implements Treatment {
    @Override
    public void apply(Person person) {
        if (person.getCurrentIllness() instanceof Flu) {
            System.out.println("Applying antibiotics to cure Flu...");
            person.setIsIll(false);
        } else {
            System.out.println("Incorrect treatment. The illness cannot be cured with antibiotics.");
        }
    }
}

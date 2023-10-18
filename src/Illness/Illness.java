package Illness;

import Adaptor.*;
import Decorations.*;
import Person.Person;

import java.util.List;

//strategy
public interface Illness {
    void diagnose(Person person, List<String> symptoms, int stages, Adapter adapter);
    void doDamage(Person person, int stages, Adapter adapter);
    void getSymptoms();
}

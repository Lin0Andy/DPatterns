package Illness;

import Person.Person;

import java.util.List;

public interface Illness {
    void diagnose(Person person, List<String> symptoms);
    void doDamage(Person person);
    void getSymptoms();
}

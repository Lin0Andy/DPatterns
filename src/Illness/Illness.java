package Illness;

import Person.Person;

import java.util.List;

//strategy
public interface Illness {
    void diagnose(Person person, List<String> symptoms, int stages);
    void doDamage(Person person, int stages);
    void getSymptoms();
}

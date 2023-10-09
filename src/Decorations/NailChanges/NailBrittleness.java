package Decorations.NailChanges;

import Decorations.*;
import Illness.*;
import Person.*;
import Treatment.*;
import java.util.List;

public class NailBrittleness extends Decorator {
    public NailBrittleness(Illness illnessD, Treatment treatmentD) {
        super(illnessD, treatmentD);
    }

    @Override
    public void changeAppearance(Illness illness, Treatment treatment) {
        if (illness instanceof Diabetes) {
            System.out.println("Your nails become brittle");
        }
    }



    @Override
    public void doDamage(Person person, int stages) {}
    @Override
    public void diagnose(Person person, List<String> symptoms, int stages) {}
    @Override
    public void getSymptoms() {}
    @Override
    public void apply(Person person) {}
}

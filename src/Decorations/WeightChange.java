package Decorations;

import Illness.*;
import Person.*;
import Treatment.*;
import java.util.List;

public class WeightChange extends Decorator {
    public WeightChange(Illness illnessD, Treatment treatmentD) {
        super(illnessD, treatmentD);
        changeAppearance(illnessD, treatmentD);
    }

    @Override
    public void changeAppearance(Illness illness, Treatment treatment) {
        if (illness instanceof Cancer) {
            System.out.println("You lost some weight");
        } else if (treatment instanceof InsulinTherapy || treatment instanceof Chemotherapy) {
            System.out.println("You gained some weight");
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

package Decorations;

import Illness.*;
import Person.*;
import Treatment.*;
import java.util.List;

public class WeightChange extends Decorator {
    public WeightChange(Illness illnessD) {
        super(illnessD);
        changeAppearance(illnessD);
    }

    @Override
    public void changeAppearance(Illness illness) {
        if (illness instanceof Cancer) {
            System.out.println("You lost some weight");
        }
    }



    @Override
    public void doDamage(Person person, int stages) {}
    @Override
    public void diagnose(Person person, List<String> symptoms, int stages) {}
    @Override
    public void getSymptoms() {}
}

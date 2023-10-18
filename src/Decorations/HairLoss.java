package Decorations;

import Illness.*;
import Person.*;
import Treatment.*;

import java.util.List;

public class HairLoss extends Decorator {
    public HairLoss(Illness illnessD) {
        super(illnessD);
        changeAppearance(illnessD);
    }

    @Override
    public void changeAppearance(Illness illness) {
        if (illness instanceof Cancer) {
            System.out.println("You lost your hair");
        }
    }


    @Override
    public void diagnose(Person person, List<String> symptoms, int stages) {    }
    @Override
    public void doDamage(Person person, int stages) {    }
    @Override
    public void getSymptoms() {    }
}

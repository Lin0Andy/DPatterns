package Decorations;

import Illness.*;
import Adaptor.*;
import Person.*;

import java.util.List;

public class HairLoss extends Decorator {
    public HairLoss(Illness illnessD, Adapter adapter) {
        super(illnessD);
        changeAppearance(illnessD, adapter);
    }

    @Override
    public void changeAppearance(Illness illness, Adapter adapter) {
        if (illness instanceof Cancer) {
            System.out.println(adapter.getMessage("appearance.hairLoss"));
        }
    }


    @Override
    public void diagnose(Person person, List<String> symptoms, int stages, Adapter adapter) {    }
    @Override
    public void doDamage(Person person, int stages, Adapter adapter) {    }
    @Override
    public void getSymptoms() {    }
}

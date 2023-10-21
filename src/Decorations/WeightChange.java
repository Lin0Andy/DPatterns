package Decorations;

import Illness.*;
import Person.*;
import Adaptor.*;

import java.util.List;

public class WeightChange extends Decorator {
    public WeightChange(Illness illnessD, Adapter adapter) {
        super(illnessD);
        changeAppearance(illnessD, adapter);
    }

    @Override
    public void changeAppearance(Illness illness, Adapter adapter) {
        if (illness instanceof Cancer) {
            System.out.println(adapter.getMessage("appearance.weightLoss"));
        }
    }



    @Override
    public void doDamage(Person person, int stages, Adapter adapter) {}
    @Override
    public void diagnose(Person person, List<String> symptoms, int stages, Adapter adapter) {}
    @Override
    public void getSymptoms() {}
}

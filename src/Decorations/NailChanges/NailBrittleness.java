package Decorations.NailChanges;

import Adaptor.*;
import Decorations.*;
import Illness.*;
import Person.*;

import java.util.List;

public class NailBrittleness extends Decorator {
    public NailBrittleness(Illness illnessD, Adapter adapter) {
        super(illnessD);
        changeAppearance(illnessD, adapter);
    }

    @Override
    public void changeAppearance(Illness illness, Adapter adapter) {
        if (illness instanceof Diabetes) {
            System.out.println(adapter.getMessage("appearance.nailBrittle"));
        }
    }



    @Override
    public void doDamage(Person person, int stages, Adapter adapter) {}
    @Override
    public void diagnose(Person person, List<String> symptoms, int stages, Adapter adapter) {}
    @Override
    public void getSymptoms() {}
}

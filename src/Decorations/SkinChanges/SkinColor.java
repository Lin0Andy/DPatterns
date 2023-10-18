package Decorations.SkinChanges;

import Adaptor.Adapter;
import Decorations.*;
import Illness.*;
import Person.*;
import Treatment.*;
import java.util.List;

public class SkinColor extends Decorator {
    public SkinColor(Illness illnessD, Adapter adapter) {
        super(illnessD);
        changeAppearance(illnessD, adapter);
    }

    @Override
    public void changeAppearance(Illness illness, Adapter adapter) {
        if (illness instanceof Cancer) {
            System.out.println(adapter.getMessage("appearance.skinYellow"));
        } else if (illness instanceof Diabetes) {
            System.out.println(adapter.getMessage("appearance.skinDarken"));
        }
    }



    @Override
    public void doDamage(Person person, int stages, Adapter adapter) {}
    @Override
    public void diagnose(Person person, List<String> symptoms, int stages, Adapter adapter) {}
    @Override
    public void getSymptoms() {}
}

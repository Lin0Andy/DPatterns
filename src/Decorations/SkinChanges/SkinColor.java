package Decorations.SkinChanges;

import Decorations.*;
import Illness.*;
import Person.*;
import Treatment.*;
import java.util.List;

public class SkinColor implements Decorator {
    @Override
    public void changeAppearance(Illness illness, Treatment treatment) {
        if (illness instanceof Cancer) {
            System.out.println("Your skin color changed to yellow");
        } else if (illness instanceof Diabetes) {
            System.out.println("Your skin darkened somewhere around neck and groin");
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

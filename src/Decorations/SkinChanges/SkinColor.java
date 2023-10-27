package Decorations.SkinChanges;

import Decorations.*;
import Illness.*;
import Person.*;
import Treatment.*;
import java.util.List;

public class SkinColor extends Decorator {
    public SkinColor(Illness illnessD) {
        super(illnessD);
    }

    @Override
    public void changeAppearance(Illness illness) {
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
}

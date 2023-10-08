package Decorations.SkinChanges;

import Decorations.*;
import Illness.*;
import Person.*;
import Treatment.*;
import java.util.List;

public class SkinTexture implements Decorator {
    @Override
    public void changeAppearance(Illness illness, Treatment treatment) {
        if (treatment instanceof Antibiotics) {
            System.out.println("You have skin rashes");
        } else if (treatment instanceof Chemotherapy) {
            System.out.println("You have skin dryness");
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

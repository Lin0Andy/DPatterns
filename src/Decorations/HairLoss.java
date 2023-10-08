package Decorations;

import Illness.*;
import Person.*;
import Treatment.*;

import java.util.List;

public class HairLoss implements Decorator {
    @Override
    public void changeAppearance(Illness illness, Treatment treatment) {
        if (illness instanceof Cancer || treatment instanceof Chemotherapy) {
            System.out.println("You lost your hair");
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

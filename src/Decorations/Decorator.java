package Decorations;

import Illness.*;
import Person.*;
import Treatment.*;

import java.util.List;

public abstract class Decorator implements Illness, Treatment{
    protected Illness illness;
    protected Treatment treatment;

    public Decorator (Illness illnessD, Treatment treatmentD){
        this.illness = illnessD;
        this.treatment = treatmentD;
    }

    public void changeAppearance(Illness illness, Treatment treatment) {

    }
}

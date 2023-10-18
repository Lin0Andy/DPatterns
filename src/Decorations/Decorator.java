package Decorations;

import Adaptor.Adapter;
import Illness.*;
import Person.*;

import java.util.List;

public abstract class Decorator implements Illness{
    protected Illness illness;

    public Decorator (Illness illnessD){
        this.illness = illnessD;
    }

    public void changeAppearance(Illness illness, Adapter adapter) {

    }
}

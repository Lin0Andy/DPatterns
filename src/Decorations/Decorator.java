package Decorations;

import Adaptor.*;
import Illness.*;

public abstract class Decorator implements Illness{
    protected Illness illness;

    public Decorator (Illness illnessD){
        this.illness = illnessD;
    }

    public void changeAppearance(Illness illness, Adapter adapter) {

    }
}

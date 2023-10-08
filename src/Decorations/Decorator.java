package Decorations;

import Illness.*;
import Person.*;
import Treatment.*;

import java.util.List;

public interface Decorator extends Illness, Treatment{
    void changeAppearance(Illness illness, Treatment treatment);
}

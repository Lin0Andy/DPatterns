package Treatment;

import Adaptor.Adapter;
import Person.*;

//strategy
public interface Treatment {
    void apply(Person person, Adapter adapter);
}

package Treatment;

import Person.*;
import Adaptor.*;

//strategy
public interface Treatment {
    void apply(Person person, Adapter adapter);
}

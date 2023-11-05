package Factory;

import Adapter.*;
public class USPrescriptionFactory extends PrescriptionFactory {
    @Override
    public Prescription createPrescription() {
        return new Drug1();
    }
}

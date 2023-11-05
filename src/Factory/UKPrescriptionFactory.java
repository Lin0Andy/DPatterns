package Factory;

import Adapter.*;

public class UKPrescriptionFactory extends PrescriptionFactory {
    @Override
    public Prescription createPrescription() {
        return new Drug2();
    }
}
package Adapter;

import Factory.*;

public class CountryMedicineAdapter implements Prescription {
    private Prescription prescription;

    public CountryMedicineAdapter(String country) {
        if (country.equals("USA")) {
            prescription = new USPrescriptionFactory().createPrescription();
        } else if (country.equals("UK")) {
            prescription = new UKPrescriptionFactory().createPrescription();
        }
    }

    @Override
    public void prescribeMedicine() {
        prescription.prescribeMedicine();
    }
}
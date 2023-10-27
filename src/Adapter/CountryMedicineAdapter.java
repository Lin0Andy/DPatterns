package Adapter;

public class CountryMedicineAdapter implements Prescription {
    private Prescription prescription;

    public CountryMedicineAdapter(String country) {
        if (country.equals("USA")) {
            prescription = new Drug1();
        } else if (country.equals("UK")) {
            prescription = new Drug2();
        }
    }

    @Override
    public void prescribeMedicine() {
        prescription.prescribeMedicine();
    }
}

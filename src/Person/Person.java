package Person;

import Adapter.*;
import Factory.Prescription;
import Illness.*;
import Observer.*;
import Treatment.Treatment;

public class Person implements ObserverPattern {
    private static Person instance;
    private String name;
    private int age;
    private boolean isIll;
    private Illness currentIllness;
    private Treatment currentTreatment;
    private boolean hasSubscription = false;
    private String country;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.isIll = false;
        this.currentIllness = null;
        this.currentTreatment = null;
    }

    //singleton
    public static Person getInstance(String name, int age) {
        if (instance == null) {
            instance = new Person(name, age);
        }
        return instance;
    }

    public void setIsIll(boolean isIll) {this.isIll = isIll;}
    public boolean getIsIll() {return this.isIll;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public void setCurrentIllness(Illness illness) {this.currentIllness = illness;}
    public Illness getCurrentIllness() {return this.currentIllness;}

    public void setCurrentTreatment(Treatment treatment) {this.currentTreatment = treatment;}
    public Treatment getCurrentTreatment() {return this.currentTreatment;}
    public void setCountry(String country) {this.country = country;}
    public String getCountry() {return country;}

    public void prescribeMedicine() {
        if (hasSubscription) {
            Prescription prescription = new CountryMedicineAdapter(country);
            prescription.prescribeMedicine();
        } else {
            System.out.println("You need a subscription to get a prescription.");
        }
    }

    @Override
    public void update(String message) {
        if (hasSubscription) {
            System.out.println("Notification: " + message);
        }
    }

    public void setHasSubscription(boolean hasSubscription) {
        this.hasSubscription = hasSubscription;
    }
}

package Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Illness.*;
import Treatment.Treatment;

public class Person {
    private static Person instance;
    private String name;
    private int age;
    private boolean isIll;
    private Illness currentIllness;
    private Treatment currentTreatment;

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
}

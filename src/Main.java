import Adaptor.Adapter;
import Decorations.*;
import Decorations.NailChanges.*;
import Decorations.SkinChanges.*;
import Illness.*;
import Person.*;
import Treatment.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your preferred language:");
        System.out.println("1. English");
        System.out.println("2. Français");
        System.out.println("3. Deutsch");

        int languageChoice = scanner.nextInt();

        Adapter adapter = new ResourceBundleAdapter(languageChoice);


        // Get user's information
        System.out.print(adapter.getMessage("welcome.message"));
        String name = scanner.nextLine();

        System.out.print(adapter.getMessage("age.prompt"));
        int age = scanner.nextInt();

        Person.getInstance(name, age);


        // Display available symptoms and ask user to select
        List<String> symptoms = getLocalizedSymptoms(adapter);


        System.out.println(adapter.getMessage("symptom.list"));
        for (int i = 0; i < symptoms.size(); i++) {
            System.out.println((i + 1) + ". " + symptoms.get(i));
        }

        System.out.println(adapter.getMessage("enter.number"));
        scanner.nextLine(); // Consume newline
        String symptomInput = scanner.nextLine();
        List<Integer> selectedSymptoms = parseSymptomsInput(symptomInput, adapter);

        List<String> selectedSymptomsNames = new ArrayList<>();
        for (Integer index : selectedSymptoms) {
            selectedSymptomsNames.add(symptoms.get(index - 1));
        }

        Analysis analysis = new Analysis();
        analysis.analyzeSymptoms(Person.getInstance(name, age), selectedSymptomsNames, getAvailableIllnesses(), 3, adapter);

        if (Person.getInstance(name, age).getIsIll()) {
            System.out.println(adapter.getMessage("no.diagnose"));
        }
        else {
            System.out.println(adapter.getMessage("new.appearance"));
            Illness HairLoss = new HairLoss(Person.getInstance(name, age).getCurrentIllness(), adapter);
            Illness WeightChange = new WeightChange(HairLoss, adapter);
            Illness SkinColor = new SkinColor(WeightChange, adapter);
            Illness NailB = new NailBrittleness(SkinColor, adapter);
            System.out.println(adapter.getMessage("goodbye"));
        }
    }

    private static List<Integer> parseSymptomsInput(String input, Adapter adapter) {
        String[] symptomsArray = input.split(",");
        List<Integer> selectedSymptoms = new ArrayList<>();

        for (String symptom : symptomsArray) {
            try {
                int index = Integer.parseInt(symptom.trim());
                if (index >= 1 && index <= 8) {
                    selectedSymptoms.add(index);
                } else {
                    System.out.println(adapter.getMessage("invalid.number") + " " + index);
                }
            } catch (NumberFormatException e) {
                System.out.println(adapter.getMessage("invalid.input") + " " + symptom);
            }
        }

        return selectedSymptoms;
    }
    private static List<Illness> getAvailableIllnesses() {
        List<Illness> illnesses = new ArrayList<>();

        illnesses.add(new Flu());
        illnesses.add(new Cancer());
        illnesses.add(new Diabetes());
        illnesses.add(new Migraine());

        Collections.shuffle(illnesses);
        return illnesses;
    }
    private static List<String> getLocalizedSymptoms(Adapter adapter) {
        List<String> symptoms = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            String symptomKey = "symptom." + "symptom" + i;
            String symptom = adapter.getMessage(symptomKey);
            symptoms.add(symptom);
        }
        return symptoms;
    }
}

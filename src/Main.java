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

        // Get user's information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Person.getInstance(name, age);


        // Display available symptoms and ask user to select
        List<String> symptoms = List.of(
                "Fever", "Cough", "Fatigue", "Weight Loss",
                "Headache", "Nausea", "Frequent Urination", "Increased Thirst"
        );

        System.out.println("Available symptoms:");
        for (int i = 0; i < symptoms.size(); i++) {
            System.out.println((i + 1) + ". " + symptoms.get(i));
        }

        System.out.println("Please select up to 2 symptoms.");
        System.out.println("Please enter the numbers of the symptoms you are experiencing (comma-separated): ");
        scanner.nextLine(); // Consume newline
        String symptomInput = scanner.nextLine();
        List<Integer> selectedSymptoms = parseSymptomsInput(symptomInput);

        List<String> selectedSymptomsNames = new ArrayList<>();
        for (Integer index : selectedSymptoms) {
            selectedSymptomsNames.add(symptoms.get(index - 1));
        }

        Analysis analysis = new Analysis();
        analysis.analyzeSymptoms(Person.getInstance(name, age), selectedSymptomsNames, getAvailableIllnesses(), 3);

        if (Person.getInstance(name, age).getIsIll()) {
            System.out.println("Unfortunately, we were unable to diagnose your illness.");
        }
        else {
            System.out.println("Your illness could affect you, changing your appearance. Let's see...");
            Illness HairLoss = new HairLoss(Person.getInstance(name, age).getCurrentIllness());
            Illness WeightChange = new WeightChange(HairLoss);
            System.out.println("That's it! Goodbye!");
        }
    }

    private static List<Integer> parseSymptomsInput(String input) {
        String[] symptomsArray = input.split(",");
        List<Integer> selectedSymptoms = new ArrayList<>();

        for (String symptom : symptomsArray) {
            try {
                int index = Integer.parseInt(symptom.trim());
                if (index >= 1 && index <= 8) {
                    selectedSymptoms.add(index);
                } else {
                    System.out.println("Invalid symptom number: " + index);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + symptom);
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
}

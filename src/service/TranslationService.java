package service;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TranslationService {
    public void eng_az() {
        int correct = 0;
        int wrong = 0;
        Map<String, String> map = new HashMap<>();
        map.put("Include", "daxil");
        map.put("Increment", "artirmaq");
        map.put("Mutable", "sessiz");
        map.put("Environment", "muhit");
        map.put("Generous", "sexavetli");
        map.put("misunderstanding", "anlasilmamazliq");
        map.put("interrupt", "sozunu kesmek");
        map.put("preparation", "hazirliq");

        System.out.println("---------------Translate-----------------");
        for (Map.Entry<String, String> words : map.entrySet()) {
            System.out.println(words.getKey());
            Scanner scanner = new Scanner(System.in);
            System.out.print(" - ");
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase(words.getValue())) {
                correct++;
            } else {
                wrong++;
                System.out.println("correct variant is: " + words.getValue());
            }
        }
        System.out.println("correct answer: " + correct);
        System.out.println("wrong answer: " + wrong);

    }

    public void az_eng() {
        int correct = 0;
        int wrong = 0;
        Map<String, String> map = new HashMap<>();
        map.put("Include", "daxil");
        map.put("Increment", "artirmaq");
        map.put("Mutable", "sessiz");
        map.put("Environment", "muhit");
        map.put("Generous", "sexavetli");
        map.put("misunderstanding", "anlasilmamazliq");
        map.put("interrupt", "sozunu kesmek");
        map.put("preparation", "hazirliq");

        System.out.println("---------------Translate-----------------");
        for (Map.Entry<String, String> words : map.entrySet()) {
            System.out.println(words.getValue());
            Scanner scanner = new Scanner(System.in);
            System.out.print(" - ");
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase(words.getKey())) {
                correct++;
            } else {
                wrong++;
                System.out.println("correct variant is: " + words.getKey());
            }
        }
        System.out.println("correct answer: " + correct);
        System.out.println("wrong answer: " + wrong);
    }
}
package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        Map<Character, Integer> sortedCharCount = new TreeMap<>(charCount);

        for (Map.Entry<Character, Integer> entry : sortedCharCount.entrySet()) {
            System.out.println("Символ: " + entry.getKey() + ", Количество вхождений: " + entry.getValue());
        }
    }
}

package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "log.txt";
        String directoryName = "Logs";
        File file = new File(directoryName, fileName);

        File directory = new File(directoryName);

        if (!directory.exists()) {
            if (directory.mkdir()) {
            } else {
            }
        } else {
        }
        try {
            if (file.createNewFile()) {

            } else {

            }
        } catch (IOException e) {
            System.out.println("Виникла помилка при створенні файлу: " + e.getMessage());
        }
        // Scanner
        Scanner sc = new Scanner(System.in);
        // GUI
        GUI gui = new GUI();
        // Crud Functions
        CrudFunctions cf = new CrudFunctions();

        while (true) {
            gui.GUI();
            String inputnext = sc.next();
            switch (inputnext) {
                case "1" -> cf.Create();
                case "2" -> cf.Update();
                case "3" -> cf.DeleteProfile();
                case "4" -> cf.FindProfile();
                case "5" -> cf.SeeALL();
                case "6" -> System.exit(0);
            }
        }
    }
}
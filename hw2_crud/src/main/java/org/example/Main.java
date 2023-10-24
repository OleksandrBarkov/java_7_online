package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
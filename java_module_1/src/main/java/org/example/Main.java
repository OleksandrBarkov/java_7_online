package org.example;

import javax.lang.model.type.PrimitiveType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        int cb = 0;
        int b = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        Interface inter = new Interface();
        Profiles profiles = new Profiles();
        Main main = new Main();
        boolean a = true;
        while (a) {
            inter.Interface();
            int Else = scanner.nextInt();
            if (Else == 1) {
                profiles.Reg1();
                String name = scanner.next().toString();
                for (int i = 0; i < profiles.Names.length; i++) {
                    if (profiles.Names[i] == null) {
                        profiles.Names[i] = name;
                        break;
                    }
                }
                profiles.Reg2();
                String lastname = scanner.next().toString();
                for (int i = 0; i < profiles.Lastnames.length; i++) {
                    if (profiles.Lastnames[i] == null) {
                        profiles.Lastnames[i] = lastname;
                        break;
                    }
                }
                profiles.Reg3();
                String age = scanner.next().toString();
                for (int i = 0; i < profiles.Ages.length; i++) {
                    if (profiles.Ages[i] == null) {
                        profiles.Ages[i] = age;
                        break;
                    }
                }
                profiles.Reg4();
                String pass = scanner.next().toString();
                for (int i = 0; i < profiles.Passwords.length; i++) {
                    if (profiles.Passwords[i] == null) {
                        profiles.Passwords[i] = pass;
                        break;
                    }
                }
                for (int i = 0; i < profiles.UUIDs.length; i++) {
                    if (profiles.UUIDs[i] == null) {
                        profiles.UUIDs[i] = UUID.randomUUID().toString();
                        break;
                    }
                }
            }
            if (Else == 4) {
                for (int i = 0; i < profiles.UUIDs.length; i++) {
                    if (profiles.UUIDs[i] != null || profiles.Names[i] != null || profiles.Ages[i] != null || profiles.Lastnames[i] != null) {
                        System.out.println("Name: " + profiles.Names[i] + " Lastname: " + profiles.Lastnames[i] + " Age: " + profiles.Ages[i] + " UUID: " + profiles.UUIDs[i] + " Num: " + i);
                        System.out.println("");
                    }
                }
            }
            if (Else == 5) {
                System.out.println("");
                System.out.println("Thanks for testing my application!");
                System.exit(0);
            }
            if (Else == 3) {
                System.out.println("Please enter id profile :");
                String id = scanner.next();
                for (int i = 0; i < profiles.UUIDs.length; i++) {
                    if (profiles.UUIDs[i].equals(id)) {
                        System.out.println("Name: " + profiles.Names[i] + " Lastname: " + profiles.Lastnames[i] + " Age: " + profiles.Ages[i] + " UUID: " + profiles.UUIDs[i] + " Num: " + i);
                        break;
                    }
                    else {
                        break;
                    }
                }
            }
            if (Else == 2) {
                System.out.println("Please enter id profile: ");
                String id = scanner.next();
                for (int i = 0; i < profiles.UUIDs.length; i++) {
                    if (profiles.UUIDs[i].equals(id) || profiles.UUIDs[i] != null) {
                        System.out.println("Please enter password profile: ");
                        break;
                    }
                    else {
                        break;
                    }
                }
                for (int i = 0; i < profiles.Passwords.length; i++) {
                    String password = scanner.next();
                    if (profiles.Passwords[i].equals(password)) {
                        profiles.UUIDs[i] = null;
                        profiles.Names[i] = null;
                        profiles.Lastnames[i] = null;
                        profiles.Ages[i] = null;
                        profiles.Passwords[i] = null;
                        System.out.println("Secuess");
                        break;
                    }
                }
            }
        }
    }
}

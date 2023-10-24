package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Interface interfac = new Interface();
        Functions functions = new Functions();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            interfac.Interface();
            var inputnum = scanner.next();
            if (Objects.equals(inputnum, "1")) {
                System.out.println("Enter name of profile: ");
                String nameofprofile = scanner.next();
                System.out.println("Enter lastname of profile: ");
                String lastnameofprofile = scanner.next();
                System.out.println("Enter age of profile: ");
                Integer ageofprofile = scanner.nextInt();
                functions.CreatePROF(nameofprofile, lastnameofprofile, ageofprofile);
                ageofprofile = null;
                lastnameofprofile = null;
                nameofprofile = null;
            }
            if (Objects.equals(inputnum, "2")) {
                System.out.println("Enter id of profile: ");
                String idofprof = scanner.next();
                functions.DeletePROF(idofprof);
            }
            if (Objects.equals(inputnum, "3")) {
                System.out.println("Enter id of profile: ");
                String idofprofile = scanner.next();
                System.out.println("Enter name of profile: ");
                String nameofprofile = scanner.next();
                System.out.println("Enter lastname of profile: ");
                String lastnameofprofile = scanner.next();
                System.out.println("Enter age of profile: ");
                Integer ageofprofile = scanner.nextInt();
                functions.UpdateProfile(idofprofile, nameofprofile, lastnameofprofile, ageofprofile);
            }
            if (Objects.equals(inputnum, "4")) {
                System.out.println("Enter id of profile: ");
                String idofprofile = scanner.next();
                functions.FindOnly(idofprofile);
            }
            if (Objects.equals(inputnum, "5")) {
                functions.SeeALL();
            }
            if (Objects.equals(inputnum, "6")) {
                System.exit(0);
            }
        }
    }
}
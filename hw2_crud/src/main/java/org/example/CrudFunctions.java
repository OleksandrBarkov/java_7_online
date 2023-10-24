package org.example;

import java.util.Scanner;
import java.util.UUID;

public class CrudFunctions {
    // Scanner
    Scanner sc = new Scanner(System.in);
    Profiles profiles = new Profiles();

    // CREATE
    public void Create() {
        // Name
        System.out.println("Enter name of profile: ");
        String name = sc.next();
        // Lastname
        System.out.println("Enter lastname of profile: ");
        String lastname = sc.next();
        // Age
        System.out.println("Enter age of profile: ");
        String age = sc.next();
        // While chain
        int numbers = 0;
        while (true) {
            if (profiles.profiles[numbers] == null) {
                profiles.profiles[numbers] = "Name: "+name+" Lastname: "+lastname+" Age: "+age+" ID: "+UUID.randomUUID().toString();
                break;
            } else{
                numbers++;
            }
        }
    }

    // Update Profile
    public void Update() {
        int numbers = 0;
        System.out.println("Enter profile id: ");
        String nextid = sc.next();
        while (true) {
            if (profiles.profiles[numbers].contains(nextid)) {
                System.out.println("");
                System.out.println("In list!");
                System.out.println("");
                break;
            } else if (profiles.profiles[numbers] == null) {
                break;
            }
            else {
                numbers++;
            }
        }
        numbers = 0;
        while (true) {
            if (profiles.profiles[numbers].contains(nextid) && profiles.profiles[numbers] != null) {
                System.out.println("Enter name of profile: ");
                String name = sc.next();
                // Lastname
                System.out.println("Enter lastname of profile: ");
                String lastname = sc.next();
                // Age
                System.out.println("Enter age of profile: ");
                String age = sc.next();
                profiles.profiles[numbers] = "Name: "+name+" Lastname: "+lastname+" Age: "+age+" ID: "+nextid;
                break;
            } else if (profiles.profiles[numbers] == null) {
                break;
            } else {
                numbers++;
            }
        }
    }

    // Delete Profile
    public void DeleteProfile() {
        int numbers = 0;
        System.out.println("Enter profile id: ");
        String nextid = sc.next();
        while (true) {
            if (profiles.profiles[numbers].contains(nextid)) {
                System.out.println("");
                System.out.println("In list!");
                System.out.println("");
                break;
            } else if (profiles.profiles[numbers] == null) {
                break;
            }
            else {
                numbers++;
            }
        }

        numbers = 0;
        while (true) {
            System.out.println("You really want to delete this profile? (Yes - 0, No - 1)");
            int nextint = sc.nextInt();
            if (nextint == 0) {
                if (profiles.profiles[numbers].contains(nextid)) {
                    profiles.profiles[numbers] = null;
                    break;
                }
                else {
                    numbers++;
                }
            }
        }
    }

    // Find Profile
    public void FindProfile() {
        int numbers = 0;
        System.out.println("Enter profile id: ");
        String nextid = sc.next();
        while (true) {
            if (profiles.profiles[numbers].contains(nextid)) {
                System.out.println(profiles.profiles[numbers]);
                break;
            } else if (profiles.profiles[numbers] == null) {
                break;
            }
            else {
                numbers++;
            }
        }
    }

    // See all profiles
    public void SeeALL() {
        int numbers = 0;
        while(true) {
            if (profiles.profiles[numbers] != null) {
                System.out.println(profiles.profiles[numbers]);
                numbers++;
            }
            else {
                break;
            }
        }
    }
}

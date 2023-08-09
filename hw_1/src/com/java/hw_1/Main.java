package com.java.hw_1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funct funct = new Funct();
        Scanner sc = new Scanner(System.in);
        boolean tr = true;
        while (tr) {
            funct.Start();
            int gets = sc.nextInt();
            if(gets == 1) {
                System.out.println("Enter name: ");
                sc.nextLine();
                String nm = sc.nextLine();
                funct.setName(nm);
                System.out.println("Enter lastname: ");
                String lnm = sc.nextLine();
                funct.setLastname(lnm);
                System.out.println("Enter age: ");
                int ag = sc.nextInt();
                funct.setAge(ag);
                funct.setId();
                System.out.println(funct.names[0]);
                System.out.println(funct.lastnames[0]);
                System.out.println(funct.ages[0]);
                System.out.println(funct.ids[0]);
            }
            if (gets == 4) {
                for (int i = 0; i < ; i++) {
                    
                }
            }
        }
    }
}
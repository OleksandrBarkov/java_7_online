package org.example;

import java.util.UUID;

public class Functions {
    Profiles profiles = new Profiles();
    Integer num = 0;
    public void CreatePROF(String name, String lastname, Integer age) {
        while (true) {
            num = 0;
            if (profiles.profiles[num] == null) {
                profiles.profiles[num] = "Name: " + name + " Lastname: " + lastname + " Age: " + age + " Id: " + UUID.randomUUID().toString();
                break;
            } else {
                num++;
            }
        }
    }
    public void DeletePROF(String id) {
        num = 0;
        while (true) {
            if (profiles.profiles[num].contains(id)) {
                profiles.profiles[num] = null;
                break;
            } else {
                num++;
            }
        }
    }
    public void SeeALL() {
        num = 0;
        while (true) {
            if (profiles.profiles[num] != null) {
                System.out.println(profiles.profiles[num]);
                num++;
            }
            if (profiles.profiles[num] == null) {
                break;
            }
        }
    }
    public void UpdateProfile(String id, String name, String lastname, Integer age) {
        num = 0;
        while (true) {
            if (profiles.profiles[num].contains(id)) {
                profiles.profiles[num] = "Name: " + name + " Lastname: " + lastname + " Age: " + age + " Id: " + id;
                break;
            } else {
                num++;
            }
        }
    }
    public void FindOnly(String id) {
        num = 0;
        while (true) {
            if (profiles.profiles[num] != null && profiles.profiles[num].contains(id)) {
                System.out.println(profiles.profiles[num]);
                break;
            }
            if (profiles.profiles[num] == null) {
                break;
            }
        }
    }
}

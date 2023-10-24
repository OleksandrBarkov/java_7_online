package org.example;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition[] conditions = new Condition[7];

        for (int i = 1; i <= 6; i++) {
            conditions[i] = lock.newCondition();
        }

        for (int i = 1; i < 6; i++) {
            final int sender = i;
            final int receiver = i + 1;

            Thread thread = new Thread(() -> {
                try {
                    lock.lock();
                    System.out.println("Рука " + sender + " жме руку " + receiver);
                    conditions[receiver].signal();
                    conditions[sender].await();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            });

            thread.start();
        }

        try {
            lock.lock();
            System.out.println("Початок жмання руки 1");
            conditions[1].signal();
        } finally {
            lock.unlock();
        }
    }
}
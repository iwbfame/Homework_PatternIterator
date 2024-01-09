package org.example;

public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(1, 100);

        for (int i = 0; i < 10; i++) {
            System.out.println(randoms.iterator().next());
        }
    }
}
package com.nick.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange spelarnamn");
        String name = sc.nextLine();
        System.out.println("Player #1: " + name);

        System.out.println("Ange antal varv:");
        int loops = sc.nextInt();
        for (int i = 1; i < loops + 1; i++) {
            System.out.println("Varv " + i);
        }
        do {
            System.out.println("Skriv något: ");
            String input = sc.nextLine();
            System.out.println("Du skrev:" + input);
        } while (true);
    }
}
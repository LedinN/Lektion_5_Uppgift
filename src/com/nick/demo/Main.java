package com.nick.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange spelarnamn");
        String name = sc.nextLine();
        System.out.println("Player #1: " + name);

        int loops = scannerInt();
        for (int i = 1; i < loops + 1; i++) {
            System.out.println("Varv " + i);
        }

        boolean isPlaying = true;
        do {
            System.out.println("Skriv något: ");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Throwing");
                    break;
                case "stop":
                    isPlaying = false;
                    return;
                default:
                    System.out.println("Wrong input");
            }
        } while (isPlaying);
    }

    // Flyttade ut från Main
    public static int scannerInt() {
        Scanner sc = new Scanner(System.in);

        int loop = 0;
        boolean check = false;
        while (!check)
        {
            System.out.println("Type in a number:");
            if (sc.hasNextInt()) {
                loop = sc.nextInt();
                check = true;
            } else {
                System.out.println("Not a number!");
                sc.next();
            }
        }
return loop;

    }
}
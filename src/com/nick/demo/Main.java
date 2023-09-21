package com.nick.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Who is the first player?");
        String name = myScanner.nextLine();

        System.out.println("Player #1: "+ name);

    }
}

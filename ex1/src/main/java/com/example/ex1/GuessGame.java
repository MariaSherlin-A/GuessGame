package com.example.ex1;


import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int number = r.nextInt(10) + 1;
        int guess;

        System.out.println("Guess number (1-10): ");

        while (true) {
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Correct! You win 🎉");
                break;
            } else if (guess < number) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }

        sc.close();
    }
}
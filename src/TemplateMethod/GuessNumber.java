package TemplateMethod;
import java.util.Scanner;

public class GuessNumber extends Game {
    private int numberToGuess;
    private int currentGuess;
    private int numberOfGuesses;

    @Override
    void aloitaPeli() {
        numberToGuess = (int) (Math.random() * 10) + 1;
        currentGuess = 0;
        numberOfGuesses = 0;
        System.out.println("Arvaa numero 1 ja 10 väliltä.");
    }

    @Override
    void pelaa(int player) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Pelaaja %d, kirjoita arvauksesi: ", player+1);
        currentGuess = input.nextInt();

        if(currentGuess != numberToGuess) {
            System.out.println("Väärä numero");
        }

        numberOfGuesses++;
    }

    @Override
    boolean lopetaPeli() {
        return (currentGuess == numberToGuess);
    }

    @Override
    void tulostaVoittaja() {
        System.out.println();
        System.out.printf("Arvasit oikean numeron (%d), %d yrityksellä.", numberToGuess, numberOfGuesses);
    }
}
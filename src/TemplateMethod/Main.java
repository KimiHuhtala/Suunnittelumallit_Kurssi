package TemplateMethod;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Anna pelaajien määrä: ");
        Scanner scanner = new Scanner(System.in);
        int playerCount = scanner.nextInt();
        Game guessNumber = new GuessNumber();
        guessNumber.pelaaPeli(playerCount);
    }
}

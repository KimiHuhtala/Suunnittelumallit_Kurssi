package Memento;

import java.util.Random;

public class Arvuuttaja {

    public Memento joinGame() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return new Memento(randomNumber);
    }

    public boolean arvaus(Memento memento, int arvaus) {
        return memento.haeNumero() == arvaus;
    }
}

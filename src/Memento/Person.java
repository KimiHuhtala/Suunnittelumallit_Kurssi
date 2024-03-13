package Memento;

import java.util.Random;

public class Person implements Runnable {

    private Arvuuttaja arvuuttaja;
    private Memento memento;

    public Person(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        this.memento = arvuuttaja.joinGame();
    }

    @Override
    public void run() {
        boolean oikeaArvaus = false;

        while (!oikeaArvaus) {
            Random random = new Random();
            int arvaus = random.nextInt(100) + 1;
            oikeaArvaus = arvuuttaja.arvaus(memento, arvaus);
            if (oikeaArvaus) {
                System.out.println(Thread.currentThread().getName() + " arvasi oikean numeron " + arvaus);
            }
        }
    }
}
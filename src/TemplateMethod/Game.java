package TemplateMethod;

abstract class Game {
    protected int pelaajienMaara;

    abstract void aloitaPeli();

    abstract void pelaa(int player);

    abstract boolean lopetaPeli();

    abstract void tulostaVoittaja();

    /* A template method : */
    public final void pelaaPeli(int pelaajienMaara) {
        this.pelaajienMaara = pelaajienMaara;
        aloitaPeli();
        int j = 0;
        while (!lopetaPeli()){
            pelaa(j);
            j = (j + 1) % pelaajienMaara;
        }
        tulostaVoittaja();
    }
}

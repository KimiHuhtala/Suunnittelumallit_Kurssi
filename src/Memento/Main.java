package Memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();

        for(int i = 0; i < 5; i++) {
            Henkilo asiakas = new Henkilo(arvuuttaja);
            new Thread(asiakas, "Arvuuttaja " + (i +1)).start();
        }
    }
}

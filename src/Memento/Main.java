package Memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();

        for(int i = 0; i < 5; i++) {
            Person asiakas = new Person(arvuuttaja);
            new Thread(asiakas, "Arvuuttaja " + (i +1)).start();
        }
    }
}

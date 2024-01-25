package composite;

public class Main {
    public static void main(String[] args) {
        Kotelo kotelo = new Kotelo();

        Tuuletin koteloTuuletin = new Tuuletin();
        kotelo.lisaaLapsi(koteloTuuletin);

        Emolevy emolevy = new Emolevy();
        Naytonohjain naytonohjain = new Naytonohjain();
        emolevy.lisaaLapsi(naytonohjain);

        Prosessori prosessori = new Prosessori();
        Tuuletin prosessoriTuuletin = new Tuuletin();
        prosessori.lisaaLapsi(prosessoriTuuletin);
        emolevy.lisaaLapsi(prosessori);

        for (int i = 0; i < 3; i++){
            Muisti ram = new Muisti();
            emolevy.lisaaLapsi(ram);
        }

        kotelo.lisaaLapsi(emolevy);
        System.out.println("Kotelon hinta:");
        System.out.println(kotelo.getHinta());
    }
}
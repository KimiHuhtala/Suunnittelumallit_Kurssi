package State;

public class CharmeleonState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charmeleon hyökkää!");
    }

    @Override
    public void run() {
        System.out.println("Charmeleon juoksee!");
    }

    @Override
    public void rest() {
        System.out.println("Charmeleon lepää!");
    }
}
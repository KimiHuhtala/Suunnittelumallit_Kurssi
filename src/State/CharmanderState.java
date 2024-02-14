package State;

public class CharmanderState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charmander hyökkää!");
    }

    @Override
    public void run() {
        System.out.println("Charmander juoksee!");
    }

    @Override
    public void rest() {
        System.out.println("Charmander lepää!");
    }
}

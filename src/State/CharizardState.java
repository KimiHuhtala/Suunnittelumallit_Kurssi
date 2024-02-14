package State;

public class CharizardState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charizard hyökkää!");
    }

    @Override
    public void run() {
        System.out.println("Charizard juoksee!");
    }

    @Override
    public void rest() {
        System.out.println("Charizard lepää!");
    }
}

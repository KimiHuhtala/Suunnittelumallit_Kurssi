package Visitor;

public class CharizardState implements PokemonState {

    int bonusPoints = 20;

    public int getBonusPoints() {
        return bonusPoints;
    }
    @Override
    public void attack() {
        System.out.println("Charizard hyökkää");
    }

    @Override
    public void run() {
        System.out.println("Charizard juoksee");
    }

    @Override
    public void rest() {
        System.out.println("Charizard lepää");
    }

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
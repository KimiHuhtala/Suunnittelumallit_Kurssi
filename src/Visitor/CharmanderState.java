package Visitor;

public class CharmanderState implements PokemonState {

    int bonusPoints = 10;

    public int getBonusPoints() {
        return bonusPoints;
    }
    @Override
    public void attack() {
        System.out.println("Charmander hyökkää");
    }

    @Override
    public void run() {
        System.out.println("Charmander juoksee");
    }

    @Override
    public void rest() {
        System.out.println("Charmander lepää");
    }

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}

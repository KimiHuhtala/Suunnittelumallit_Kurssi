package Visitor;

public class CharmeleonState implements PokemonState {

    int bonusPoints = 15;

    public int getBonusPoints() {
        return bonusPoints;
    }
    @Override
    public void attack() {
        System.out.println("Charmeleon hyökkää");
    }

    @Override
    public void run() {
        System.out.println("Charmeleon juoksee");
    }

    @Override
    public void rest() {
        System.out.println("Charmeleon lepää");
    }

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }
}
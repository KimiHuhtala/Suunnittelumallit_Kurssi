package Visitor;

public class Bonus implements PokemonVisitor{
    int bonusPoint;

    public Bonus(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
    @Override
    public void visit(CharizardState charizardState) {
        System.out.println("Charizard saa " + bonusPoint + " bonus pistettä");
    }

    @Override
    public void visit(CharmeleonState charmeleonState) {
        System.out.println("Charmeleon saa " + bonusPoint + " bonus pistettä");
    }

    @Override
    public void visit(CharmanderState charmanderState) {
        System.out.println("Charmander saa " + bonusPoint + " bonus pistettä");
    }
}
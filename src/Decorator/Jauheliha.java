package Decorator;

public class Jauheliha extends PizzaDecorator {

    public Jauheliha(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decoratorPizza.getDescription() + " Jauheliha";
    }

    public double getPrice() {
        return decoratorPizza.getPrice() + 6;
    }
}

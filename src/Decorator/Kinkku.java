package Decorator;

public class Kinkku extends PizzaDecorator {

    public Kinkku(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decoratorPizza.getDescription() + " Kinkku";
    }

    public double getPrice() {
        return decoratorPizza.getPrice() + 4.50;
    }
}
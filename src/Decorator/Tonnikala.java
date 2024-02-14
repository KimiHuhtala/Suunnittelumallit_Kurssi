package Decorator;

public class Tonnikala extends PizzaDecorator {

    public Tonnikala(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decoratorPizza.getDescription() + " Tonnikala";
    }

    public double getPrice() {
        return decoratorPizza.getPrice() + 5.50;
    }
}

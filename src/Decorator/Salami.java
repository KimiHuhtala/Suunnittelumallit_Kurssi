package Decorator;

public class Salami extends PizzaDecorator {

    public Salami(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decoratorPizza.getDescription() + " Salami";
    }

    public double getPrice() {
        return decoratorPizza.getPrice() + 5.50;
    }
}

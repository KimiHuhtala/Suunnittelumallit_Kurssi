package Decorator;

public class Mozzarella extends PizzaDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return decoratorPizza.getDescription() + " Mozzarella";
    }

    public double getPrice() {
        return decoratorPizza.getPrice() + 2.50;
    }
}
package Decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratorPizza;

    public PizzaDecorator(Pizza newPizza) {
        decoratorPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return decoratorPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratorPizza.getPrice();
    }
}
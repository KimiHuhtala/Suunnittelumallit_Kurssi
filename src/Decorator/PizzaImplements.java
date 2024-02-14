package Decorator;

public class PizzaImplements implements Pizza {

    @Override
    public String getDescription() {
        return "Pizza, jossa";
    }

    @Override
    public double getPrice() {
        return 1;
    }
}

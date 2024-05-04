package Builder;

import java.util.ArrayList;

public class McBuilder extends BurgerBuilder {

    private StringBuilder burgir = new StringBuilder();

    @Override
    void addSalad() {
        burgir.append("Salaatti ");
    }

    @Override
    void addMeat() {
        burgir.append("Pihvi ");
    }

    @Override
    void addBun() {
        burgir.append("Sämpylä ");
    }

    @Override
    StringBuilder getBurger() {
        return burgir;
    }
}
package abstractfactory;

public class BossFactory implements AbstractFactory {
    public Lippis createLippis() {
        return new Lippis("Boss");
    }

    public Huppari createHuppari() {
        return new Huppari("Boss");
    }

    public Paita createPaita() {
        return new Paita("Boss");
    }

    public Housut createHousut() {
        return new Housut("Boss");
    }

    public Sukat createSukat() {
        return new Sukat("Boss");
    }

    public Kengat createKengat() {
        return new Kengat("Boss");
    }
}
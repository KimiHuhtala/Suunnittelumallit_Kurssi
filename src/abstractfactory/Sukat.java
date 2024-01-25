package abstractfactory;

public class Sukat {
    private String factoryName;

    public Sukat(String name) {
        factoryName = name;
    }
    public String toString() {
        return factoryName + "-sukat";
    }
}
package abstractfactory;

public class Paita {
    private String factoryName;

    public Paita(String name) {
        factoryName = name;
    }
    public String toString() {
        return factoryName + "-paita";
    }
}
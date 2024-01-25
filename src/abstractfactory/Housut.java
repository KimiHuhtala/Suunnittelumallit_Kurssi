package abstractfactory;

public class Housut {
    private String factoryName;

    public Housut(String name) {
        factoryName = name;
    }
    public String toString() {
        return factoryName + "-housut";
    }
}

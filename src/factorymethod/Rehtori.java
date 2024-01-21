package factorymethod;

public class Rehtori extends AterioivaOtus{
    public Juoma createJuoma(){
        return new Vesi();
    };
    public Ruoka createRuoka(){
        return new Pikaruoka();
    };
}

package factorymethod;

public class Oppilas extends AterioivaOtus {
    public Juoma createJuoma(){
        return new Limu();
    };
    public Ruoka createRuoka(){
        return new Pikaruoka();
    };
}

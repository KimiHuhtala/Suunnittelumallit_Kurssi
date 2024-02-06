package singleton;

public class main {
    public static void main(String[] args) {
        BrandFactory brandFactory = MicrosoftFactory.getInstance();
        Me me = new Me(brandFactory);
        System.out.println("Minä käytän tällä hetkellä : " + me.currentBrand());

        brandFactory = GoogleFactory.getInstance();
        me = new Me(brandFactory);
        System.out.println("Olen nyt insinööri ja alan käyttämään : " + me.currentBrand());
    }
}
package singleton;

public class GoogleFactory implements BrandFactory {
    private static GoogleFactory INSTANCE = null;

    private GoogleFactory() {
    }

    public static GoogleFactory getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new GoogleFactory();
        }
        return INSTANCE;
    }
    @Override
    public Email createEmail() {
        return new GoogleEmail();
    }

    @Override
    public Browser createBrowser() {
        return new GoogleBrowser();
    }

    @Override
    public Tools createTools() {
        return new GoogleTools();
    }
}

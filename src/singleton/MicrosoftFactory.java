package singleton;

public class MicrosoftFactory implements BrandFactory {

    private static MicrosoftFactory INSTANCE = null;

    private MicrosoftFactory() {
    }

    public static MicrosoftFactory getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new MicrosoftFactory();
        }
        return INSTANCE;
    }

    @Override
    public Email createEmail() {
        return new MicrosoftEmail();
    }

    @Override
    public Browser createBrowser() {
        return new MicrosoftBrowser();
    }

    @Override
    public Tools createTools() {
        return new MicrosoftTools();
    }
}

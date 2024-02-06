package singleton;

public class Me {
    private Email email;
    private Browser browser;
    private Tools tools;

    public Me(BrandFactory brandFactory) {
        email = brandFactory.createEmail();
        browser = brandFactory.createBrowser();
        tools = brandFactory.createTools();
    }

    public String currentBrand() {
        return email + ", " + browser + ", " + tools;
    }
}

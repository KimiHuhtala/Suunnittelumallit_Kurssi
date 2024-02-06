package singleton;


public interface Factory {
    public abstract String createEmail();
    public abstract String createBrowser();
    public abstract String createTools();

}
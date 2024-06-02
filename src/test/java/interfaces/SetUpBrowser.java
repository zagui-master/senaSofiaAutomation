package interfaces;

public interface SetUpBrowser extends DriverManager {
    default void visit( String url ) {
        getDriver().get( url );
    }
}

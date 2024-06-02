package interfaces;

public interface Typeable extends ExplicitWait {
    default void typeOn( String locator, String text ) {
        waitElement( locator ).sendKeys( text );
    }
}

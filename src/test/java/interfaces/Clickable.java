package interfaces;

import org.openqa.selenium.WebDriver;

public interface Clickable extends ExplicitWait {
    default void clickOn( String locator ) {
        waitElement( locator ).click();
    }
}

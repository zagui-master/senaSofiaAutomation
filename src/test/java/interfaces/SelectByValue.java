package interfaces;

import org.openqa.selenium.support.ui.Select;

public interface SelectByValue extends ExplicitWait {
    default void selectByValue( String locator, String value ) {
        Select select = new Select( waitElement( locator ) );
        select.selectByValue( value );
    }
}

package interfaces;

import org.openqa.selenium.support.ui.Select;

public interface SelectByIndex extends ExplicitWait {
    default void selectByIndex( String locator, int index ) {
        Select select = new Select( waitElement( locator ) );
        select.selectByIndex( index );
    }
}

package interfaces;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public interface GetAllOptionsFromSelect extends ExplicitWait {
    default List<String> getAllOptionsFromSelect( String locator ) {
        Select select = new Select( waitElement( locator ) );
        List<WebElement> options = select.getOptions();
        List<String> optionList = new ArrayList<>();
        for ( WebElement option : options ) {
            optionList.add( option.getText() );
        }
        return optionList;
    }
}

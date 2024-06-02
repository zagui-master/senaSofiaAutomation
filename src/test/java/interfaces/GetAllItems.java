package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public interface GetAllItems extends DriverManager {
    default List<String> getAllItems( String cssSelectorLocator ) {
        List<WebElement> elements = getDriver().findElements( By.cssSelector( cssSelectorLocator ) );
        List<String> resultList = new ArrayList<>();
        for ( WebElement element : elements ) {
            resultList.add( element.getText() );
        }
        return resultList;
    }
}

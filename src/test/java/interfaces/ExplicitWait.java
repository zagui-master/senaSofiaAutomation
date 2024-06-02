package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public interface ExplicitWait extends DriverManager {
    default WebElement waitElement( String xpathLocator ) {
        WebDriverWait wait = new WebDriverWait( getDriver(), Duration.ofSeconds( 10 ) );
        return wait.until( ExpectedConditions.presenceOfElementLocated( By.xpath( xpathLocator ) ) );
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    private static final WebDriver DRIVER;
    private static final WebDriverWait WAIT;

    static {
        DRIVER = new ChromeDriver();
        WAIT = new WebDriverWait( DRIVER, Duration.ofSeconds( 10 ) );
    }

    protected void navigateTo( String url ) {
        DRIVER.get( url );
    }

    protected void tearDownBrowser() {
        DRIVER.quit();
    }

    private WebElement waitElement( String locator ) {
        return WAIT.until( ExpectedConditions.visibilityOfElementLocated( By.xpath( locator ) ) );
    }

    protected void typeOn( String locator, String text ) {
        waitElement( locator ).sendKeys( text );
    }

    protected void clickOn( String locator ) {
        waitElement( locator ).click();
    }

    protected void selectByValue( String locator, String value ) {
        Select select = new Select( waitElement( locator ) );
        select.selectByValue( value );
    }

    protected void selectByIndex( String locator, int index ) {
        Select select = new Select( waitElement( locator ) );
        select.selectByIndex( index );
    }

    protected String getAtrributeSrc( String locator ) {
        return waitElement( locator ).getAttribute( "src" );
    }

    protected List<String> getSelectOptions( String locator ) {
        Select select = new Select( waitElement( locator ) );
        List<WebElement> options = select.getOptions();
        List<String> listOption = new ArrayList<>();
        for ( WebElement option : options ) {
            listOption.add( option.getText() );
        }
        return listOption;
    }

    protected String getElementTextByXpath( String locator ) {
        return waitElement( locator ).getText();
    }

    protected List<String> getAllResults( String locator ) {
        List<WebElement> elements = DRIVER.findElements( By.cssSelector( locator ) );
        List<String> results = new ArrayList<>();
        for ( WebElement element : elements ) {
            results.add( element.getText() );
        }
        return results;
    }
}

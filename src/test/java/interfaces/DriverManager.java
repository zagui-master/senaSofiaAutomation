package interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface DriverManager {
    WebDriver driver = new ChromeDriver();
    default WebDriver getDriver(){
        return driver;

    }
}

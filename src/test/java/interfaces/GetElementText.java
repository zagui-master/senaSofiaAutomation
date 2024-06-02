package interfaces;

public interface GetElementText extends ExplicitWait{
    default String getElementText(String locator){
        return waitElement( locator ).getText();
    }
}

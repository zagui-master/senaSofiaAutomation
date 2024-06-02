package pages;

import interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class SenaSofiaPlusPage implements SetUpBrowser, Typeable, Clickable, GetSrcAttribute, GetAllItems, GetElementText {
    private String popUpImgLocator = "//img[@src='http://portal.senasofiaplus.edu.co/emprendimiento/bannerOferta.jpg']";
    private String closePopUpLocator = "//div[text()='Cerrar Imagen']";
    private String inputCityLocator = "//input[@id='ciudadTextInput']";
    private String btnSearchLocator = "//span[text()='buscar']/ancestor::button";
    private String courseTitleLocator = "li h3 span";
    private String firstOfertResultLocator = "//li[1]//h3//span";
    private String linkSeeMoreLocator = "(//a[text()='Ver m\u00E1s...'])[1]";
    private String courseNameLocator = "//h1//span";
    private List<String> coursesResult = new ArrayList<>();

    public void openPage() {
        visit( "https://oferta.senasofiaplus.edu.co/sofia-oferta/" );
    }

    public String getAttributePopUp() {
        return getSrcAttribute( popUpImgLocator );
    }

    public void closePopUp() {
        clickOn( closePopUpLocator );
    }

    public void typeCity( String city ) {
        typeOn( inputCityLocator, city );
    }

    public void clickBtnSearch() {
        clickOn( btnSearchLocator );
    }

    public List<String> getSearchResult() {
        coursesResult.addAll( getAllItems( courseTitleLocator ) );
        return getAllItems( courseTitleLocator );
    }

    public List<String> coursesList() {
        return coursesResult;
    }

    public void displaySubmenu() {
        clickOn( firstOfertResultLocator );
    }

    public void clickLinkSeeMore() {
        clickOn( linkSeeMoreLocator );
    }

    public String getNameCourse() {
        return getElementText( courseNameLocator );
    }
}


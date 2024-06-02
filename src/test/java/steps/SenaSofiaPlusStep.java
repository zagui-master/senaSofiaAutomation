package steps;

import io.cucumber.java.en.*;
import pages.SenaSofiaPlusPage;

import static org.junit.jupiter.api.Assertions.*;

public class SenaSofiaPlusStep {
    SenaSofiaPlusPage senaSofiaPlusPage = new SenaSofiaPlusPage();

    @Given( "Que el usuario se encuentra en la pagina principal de sena Sofia plus" )
    public void goToPage() {
        senaSofiaPlusPage.openPage();
    }

    @Then( "El usuario podra ver el pop up" )
    public void validatePopUp() {
        String currentSrc = senaSofiaPlusPage.getAttributePopUp();
        String expectedSrc = "http://portal.senasofiaplus.edu.co/emprendimiento/bannerOferta.jpg";
        assertEquals( expectedSrc, currentSrc );
    }

    @And( "El usuario procedera a cerrarlo" )
    public void closePopUp() {
        senaSofiaPlusPage.closePopUp();
    }

    @Then( "El usuario ingresara la {word} donde quiere estudiar" )
    public void enterCity( String city ) {
        senaSofiaPlusPage.typeCity( city );
    }

    @And( "El usuario le dara click al button buscar" )
    public void clickOnBtnSearch() {
        senaSofiaPlusPage.clickBtnSearch();
    }

    @Then( "El usuario podra ver los cursos ofertados en la ciudad que ingreso" )
    public void validatePresentCourses() {
        assertNotNull( senaSofiaPlusPage.getSearchResult() );
    }

    @And( "El usuario seleccionara la primera oferta" )
    public void selectFirstOption() {
        senaSofiaPlusPage.displaySubmenu();
    }

    @When( "El usuario vera la informacion de la oferta y dara click en la opcion Ver mas" )
    public void goToMoreInformation() {
        senaSofiaPlusPage.clickLinkSeeMore();
    }

    @Then( "El usuario podra ver toda la informacion de la oferta" )
    public void validateCourseInformation() {
        String currentCourse = senaSofiaPlusPage.getNameCourse().substring( 0, senaSofiaPlusPage.getNameCourse().length() - 1 );
        String expectedCourse = senaSofiaPlusPage.coursesList().get( 0 );
        assertEquals( expectedCourse, currentCourse );
    }
}

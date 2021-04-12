package co.com.choucair.certification.proyectoDiana.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_CERTIFICATION = Target.the("Button that shows us the form to certifications curses").
            located(By.xpath("//div[@class='card-group col-md-6 col-lg-12']//strong[contains(text(),'Cursos y ')]"));

    public static final Target INPUT_SEARCH_COURSES = Target.the("Search input to find courses").
            located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Button to search courses").
            located(By.xpath("//button[contains(text(),'Ir')]"));

    public static final Target SELECT_COURSE = Target.the("Select course ISTQB - Test Automation Engineer").
            located(By.xpath("//div[@class='result-content' and contains(text(),'ISTQB - Test Automation Engineer')]"));
}

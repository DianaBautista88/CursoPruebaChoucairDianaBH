package co.com.choucair.certification.proyectoDiana.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login").
            located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("Where the user writes user").
            located(By.name("username"));

    public static final Target INPUT_PASSWORD = Target.the("Where the user writes the password").
            located(By.name("password"));

    public static final Target ENTER_BUTTON = Target.the("Button to confirm Login").
            located(By.xpath("//button[contains(text(),'Acceder')]"));
}

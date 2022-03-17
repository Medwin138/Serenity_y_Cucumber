package starter.steps;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import starter.pageObject.LoginPage;

public class LoginSteps extends PageObject {

    LoginPage loginPage;

    @Step
    public void AbrirURl() {
    loginPage.openUrl("https://opensource-demo.orangehrmlive.com");


    }
    @Step
    public void escribirusuario(String usuario) {
        loginPage.escrirUsuario(usuario);
    }
    @Step
    public void escribirContrasena(String contrasena) {
        loginPage.escrirContrasena(contrasena);
    }
    @Step
    public void clicLogin() {

    }
}

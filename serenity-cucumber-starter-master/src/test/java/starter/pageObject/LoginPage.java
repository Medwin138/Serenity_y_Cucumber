package starter.pageObject;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("https://opensource-demo.orangehrmlive.com/")



public class LoginPage extends PageObject {
    @FindBy(id="txtUsername")
    WebElementFacade usuario;
    public void escrirUsuario(String usuario) {
        this.usuario.type(usuario);

    }

    public void escrirContrasena(String contrasena) {
       // this.usuario.type(contrasena);
        $(By.id("txtPassword")).type(contrasena);
    }
}

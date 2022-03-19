package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.steps.LoginSteps;

public class ingresarHRM extends PageObject {


    @Steps
    LoginSteps login;

    @Given("Una vez el usuario se encuentre en el portal de prueba")
    public void una_vez_el_usuario_se_encuentre_en_el_portal_de_prueba() {
        login.AbrirURl();

    }
    @When("Ingrese sus credenciales usuario {string} y su contraseña {string}")
    public void ingrese_sus_credenciales_usuario_y_su_contraseña(String usuario, String contrasena) {
        login.escribirusuario(usuario);
        login.escribirContrasena(contrasena);
        login.clicLogin();
    }
    @Then("Sera direccionado al home de la pagina")
    public void sera_direccionado_al_home_de_la_pagina() {

    }
    @Then("podra navegar en la web")
    public void podra_navegar_en_la_web() {


    }


}

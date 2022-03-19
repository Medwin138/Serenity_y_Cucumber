package PasosDefinidos;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class FormularioDefinido {

    WebDriver driver;


    @Dado("que la web DEMOQA esta disponible")
    public void que_la_web_demoqa_esta_disponible() {
     System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
     driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("https://demoqa.com/text-box");
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Cuando("registro mis datos")
    public void registro_mis_datos() {

      driver.findElement(By.id("userName")).sendKeys("Miller Laguna");
      driver.findElement(By.id("userEmail")).sendKeys("milleredwin85@gmail.com");
      driver.findElement(By.id("currentAddress")).sendKeys("Pruebas de automatizacion");
      driver.findElement(By.id("permanentAddress")).sendKeys("Pruebas para ampliar el conocimiento");
    }

    @Entonces("se muestran los datos en pantalla")
    public void se_muestran_los_datos_en_pantalla() {
        driver.findElement(By.xpath("//button[@id=\'submit\']")).click();
        String informacionObtenida=driver.findElement(By.id("name")).getText();
        String informacionEsperada= "Name:Miller Laguna";
        System.out.println("informacion Obtenida:" +informacionObtenida);
        Assert.assertEquals(informacionEsperada,informacionObtenida);
        driver.quit();



    }



}

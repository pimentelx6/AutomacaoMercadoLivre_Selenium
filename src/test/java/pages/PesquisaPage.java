package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class PesquisaPage extends Utils {
    WebDriver driver;
    private By ml_Logo = By.className("nav-logo");

    public PesquisaPage(WebDriver driver){

        this.driver = driver;
    }
    public void acessarTelaPrincipal(){
        driver.get("https://www.mercadolivre.com.br/");
        esperarElementoEstarPresente(ml_Logo,20);

    }

}

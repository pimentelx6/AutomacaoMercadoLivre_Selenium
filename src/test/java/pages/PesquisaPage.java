package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class PesquisaPage extends Utils {
    WebDriver driver;

    private By ml_Logo = By.className("nav-logo");
    private By aceitar_cookies = By.xpath("/html/body/div[2]/div[1]/div/div[2]/button[1]");
    private By btn_maistarde_cep = By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/button[2]/span");

    // Receber o drive através do construtor
    //Btn direito/Generate/Constructor
    //Recebe Webdriver com nome driver
    public PesquisaPage(WebDriver driver){
        this.driver = driver;
    }
    public void acessarTelaPrincipal(){
        driver.get("https://www.mercadolivre.com.br/");//Capturar a página do mercado livre
        esperarElementoEstarPresente(ml_Logo,20);//Aguardar o carregamento do logo ML para iniciar a pesquisa
        driver.manage().window().maximize();//Maximiizar a página inicial
        driver.findElement(btn_maistarde_cep).click();//Desabilitar a modal referente a inclusão de cep
        driver.findElement(aceitar_cookies).click();//Desabilitar a modal referente a informações de cookie
    }

}

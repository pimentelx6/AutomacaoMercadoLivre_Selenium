package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class PesquisaProdutoPage {
    WebDriver driver;

    private By campo_pesquisa = By.id("cb1-edit");
    private By btn_pesquisar = By.className("nav-icon-search");
    private By campo_preço_mínimo = By.id(":R5cjsle6:");
    private By campo_preço_maximo = By.id(":R6cjsle6:");
    private By btn_pesquisa_preço = By.className("ui-search-price-filter-action-btn");
    private By Seleciona_Elemento_pesquisado = By.xpath("//*[@id=\":R2l5e6:\"]/div[2]/div[1]/a/h2");
    private By btn_comprar = By.cssSelector("#\\:Riml1d9im\\:");
    private By criar_conta = By.id("registration-link");

    public PesquisaProdutoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarProduto(){
        driver.findElement(campo_pesquisa).sendKeys("Adesivo Massa Plástica Cores Diversas 800gr Com Catalisador");
        driver.findElement(btn_pesquisar).click();
    }

    public void definirFaixaDeValor(){
        driver.findElement(campo_preço_mínimo).sendKeys("15");
        driver.findElement(campo_preço_maximo).sendKeys("30");
        driver.findElement(btn_pesquisa_preço).click();
        driver.findElement(Seleciona_Elemento_pesquisado).click();
        }
    public void comprar(){
        driver.findElement(btn_comprar).click();
    }
    public void acessarConta() {
        driver.findElement(criar_conta).click();
    }
    }

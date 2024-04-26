package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PesquisaPage;
import runner.RunCucumberTest;

public class PesquisaSteps extends RunCucumberTest {
    PesquisaPage pesquisaPage = new PesquisaPage(driver);

    @Given("que estou na página do mercado livre")
    public void que_estou_na_página_do_mercado_livre() {

        pesquisaPage.acessarTelaPrincipal();
    }
}

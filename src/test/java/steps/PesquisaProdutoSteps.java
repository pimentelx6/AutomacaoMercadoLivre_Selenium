package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PesquisaProdutoPage;
import runner.RunCucumberTest;

public class PesquisaProdutoSteps extends RunCucumberTest {
    PesquisaProdutoPage pesquisaProdutoPage = new PesquisaProdutoPage(driver);
    @When("pesquiso pelo produto")
    public void pesquiso_pelo_produto() {
        pesquisaProdutoPage.acessarProduto();
    }

    @When("defino a faixa de valor")
    public void defino_a_faixa_de_valor() {
        pesquisaProdutoPage.definirFaixaDeValor();
    }

    @When("inicio a compra")
    public void inicio_a_compra(){
    pesquisaProdutoPage.comprar();
    }

    @Then("é apresentada a mensagem de compra")
    public void é_apresentada_a_mensagem_de_compra() {
    pesquisaProdutoPage.acessarConta();
    }
}

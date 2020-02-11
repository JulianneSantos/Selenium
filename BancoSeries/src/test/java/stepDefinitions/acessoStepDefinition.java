package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class acessoStepDefinition {
	


    @Given("^O usuario acessa o site$")
    public void o_usuario_acessa_o_site() throws Throwable {
    	System.out.println("Acesso ao site");
    }

    @Given("^O usuario acessa o menu para a realizacao do cadastro$")
    public void o_usuario_acessa_o_menu_para_a_realizacao_do_cadastro() throws Throwable {
    	System.out.println("Acesso ao menu cadastro");
    }

    @Given("^O usuario acessa o menu para a realizacao do login$")
    public void o_usuario_acessa_o_menu_para_a_realizacao_do_login() throws Throwable {
    	System.out.println("Menu login");
    }

    @Given("^O usuario está conectado ao site$")
    public void o_usuario_est_conectado_ao_site() throws Throwable {
    	System.out.println("logado ao site");
    }

    @When("^O site é carregado com sucesso$")
    public void o_site_carregado_com_sucesso() throws Throwable {
    	System.out.println("site carregado com sucesso");
    }

    @When("^Preencher os dados solicitados pelo site$")
    public void preencher_os_dados_solicitados_pelo_site() throws Throwable {
    	System.out.println("preencher dados solicitados");
    }

    @When("^Acessar o menu de saída do site$")
    public void acessar_o_menu_de_sada_do_site() throws Throwable {
    	System.out.println("menu de saida");
    }

    @Then("^Cadastro é realizado com sucesso$")
    public void cadastro_realizado_com_sucesso() throws Throwable {
    	System.out.println("cadastro sucesso");
    }

    @Then("^Acesso ao site é realizado com sucesso$")
    public void acesso_ao_site_realizado_com_sucesso() throws Throwable {
    	System.out.println("acesso com sucesso");
    }

    @Then("^O site exibe a tela principal$")
    public void o_site_exibe_a_tela_principal() throws Throwable {
    	System.out.println("tela principal");
    }

    @And("^Clicar no botão \"([^\"]*)\"$")
    public void clicar_no_boto_something(String cadastrese, String strArg1) throws Throwable {
    	System.out.println("clique em botão");
    }

    @And("^Validar que que não existe usuário conectado ao site$")
    public void validar_que_que_no_existe_usurio_conectado_ao_site() throws Throwable {
    	System.out.println("não existe usuário logado");
    }

}

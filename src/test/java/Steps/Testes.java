package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class Testes {
	
	Metodos m = new Metodos();
	Elementos e = new Elementos();


	@Dado("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String url) throws Throwable {
		System.out.println("=========================");
		System.out.println("Aguarde Abrindo site !!!");
		System.out.println("=========================");
    m.abrindoNavegador(url);
		
		
	}

	@Quando("^eu preencher o nome do produto desejado Tênis Air Botinha$")
	public void eu_preencher_o_nome_do_produto_desejado_Tênis_Air_Botinha() throws Throwable {
		System.out.println("Buscar Produtos OK");
        m.preencher(e.getBuscarProdutos(), "Tênis Air Botinha");
			
	}

	@Quando("^clicar em pesquisar$")
	public void clicar_em_pesquisar() throws Throwable {
		System.out.println("Btn Pesquisar OK");
	    m.clicar(e.getBtnPesquisar());		
	}
	
	@Quando("^clicar no produto desejado$")
	public void clicar_no_produto_desejado() throws Throwable {
		System.out.println("Btn Produto OK");
		m.clicar(e.getBtnProduto());
	}

	@Quando("^escolher as características do produto$")
	public void escolher_as_características_do_produto() throws Throwable {
		System.out.println("Cor Produto OK");
		m.clicar(e.getCorProduto());
		System.out.println("Clicar Tamanho OK");
		m.clicar(e.getClicarTamanho());
		m.scrool();
		System.out.println("Aba Produto OK");
		m.clicar(e.getAbaProduto());
		Thread.sleep(1000);
		System.out.println("Quantidade Produto OK");
		m.clicar(e.getQuantidadeProduto());
		Thread.sleep(1000);
	}

	@Quando("^clicar no botão de \"([^\"]*)\"$")
	public void clicar_no_botão_de(String arg1) throws Throwable {
		
		System.out.println("Btn Comprar OK");
		m.clicar(e.getBtnComprar());
		
		System.out.println("======================");
		System.out.println("Aguarde finalizando...");
		System.out.println("======================");
		Thread.sleep(5000);
			
	}

	@Então("^deverá aparecer uma mensagem criar conta ou entrar$")
	public void deverá_aparecer_uma_mensagem_criar_conta_ou_entrar() throws Throwable {
		
		m.fecharNavegador();
		System.out.println("===================================");
		System.out.println("Cadastro finalizado com sucesso !!!");
		System.out.println("===================================");
	
	}
		
		
		
	}

	



	
	


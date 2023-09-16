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
	    System.out.println("=========================");		
        m.preencher(e.getBuscarProdutos(), "Tênis Air Botinha");
        System.out.println("Buscar Produtos OK");
        Thread.sleep(1000);
			}

	@Quando("^clicar em pesquisar$")
	public void clicar_em_pesquisar() throws Throwable {
	
	    m.clicar(e.getBtnPesquisar());
		System.out.println("Btn Pesquisar OK");
		Thread.sleep(1000);
	}
	
	@Quando("^clicar no produto desejado$")
	public void clicar_no_produto_desejado() throws Throwable {
		
		m.clicar(e.getBtnProduto());
		System.out.println("Btn Produto OK");
		Thread.sleep(1000);
	}

	@Quando("^escolher as características do produto$")
	public void escolher_as_características_do_produto() throws Throwable {
		
		m.clicar(e.getCorProduto());
		System.out.println("Cor Produto OK");
		Thread.sleep(1000);
		
		m.clicar(e.getClicarTamanho());
		System.out.println("Clicar Tamanho OK");
		Thread.sleep(1000);
		
		m.scrool();
		m.clicar(e.getAbaProduto());
		System.out.println("Aba Produto OK");
		Thread.sleep(1000);
		
		m.clicar(e.getQuantidadeProduto());
		System.out.println("Quantidade Produto OK");
		Thread.sleep(1000);
	}

	@Quando("^clicar no botão de \"([^\"]*)\"$")
	public void clicar_no_botão_de(String arg1) throws Throwable {
		
	
		m.clicar(e.getBtnComprar());
		System.out.println("Btn Comprar OK");
		Thread.sleep(1000);
		
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

	



	
	


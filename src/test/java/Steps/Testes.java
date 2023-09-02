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
		System.out.println("Abrindo Site Aguarde !!!");
		System.out.println("=========================");
		m.abrindoNavegador(url);
	 
	}

	@Quando("^eu preencher o nome do produto desejado Nike Jordan$")
	public void eu_preencher_o_nome_do_produto_desejado_Nike_Jordan() throws Throwable {
		System.out.println("Buscando Produto OK.");
		m.preencher(e.getBuscarProdutos(), "Tenis Bota Cano Alto Air Masculino Feminino Super Promoçãoo");
		
	
	}

	@Quando("^clicar em pesquisar o produto selecionado e escolher as características do produto$")
	public void clicar_em_pesquisar_o_produto_selecionado_e_escolher_as_características_do_produto() throws Throwable{
	System.out.println("Btn Pesquiar OK");
	m.clicar(e.getBtnPesquisar());
	Thread.sleep(500);	
	System.out.println("Btn Produto OK");
	m.clicar(e.getBtnProduto());
	Thread.sleep(500);	
	System.out.println("Cor Pesquiar OK");
	m.clicar(e.getCorProduto());
	Thread.sleep(500);	
	System.out.println("Clicar Tamanho OK");
	m.clicar(e.getClicarTamanho());
	Thread.sleep(500);	
	System.out.println("Tamanho Produto OK");
	m.clicar(e.getTamanhoProduto());
	Thread.sleep(500);	
	System.out.println("Scrool OK");
	m.scrool();
	
	
	}

	@Quando("^clicar no botão de \"([^\"]*)\"$")
	public void clicar_no_botão_de(String arg1) throws Throwable {
		
    Thread.sleep(500);	
    System.out.println("Btn Comprar OK");
    m.clicar(e.getBtnComprar());
    
	
	System.out.println("===============================");
    System.out.println("Desafio finalizado com sucesso!");
	System.out.println("===============================");
	 
	}

	@Então("^deverá aparecer uma mensagem criar conta ou entrar$")
	public void deverá_aparecer_uma_mensagem_criar_conta_ou_entrar() throws Throwable {
		
		System.out.println("=============================");
		System.out.println("Fechando navegador aguarde...");
		System.out.println("=============================");
		Thread.sleep(2000);
		m.fecharNavegador();

	}


	
	
}

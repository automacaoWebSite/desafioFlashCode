package Elementos;

import org.openqa.selenium.By;

public class Elementos {


	private By buscarProdutos = By.cssSelector("#cb1-edit");
	private By btnPesquisar = By.cssSelector("body > header > div > div.nav-area.nav-top-area.nav-center-area > form > button > div");
	private By btnProduto = By.cssSelector("#react-aria-\\:Rl9b9\\: > div.ui-search-result__content-wrapper.shops__result-content-wrapper > div.ui-search-item__group.ui-search-item__group--title.shops__items-group > a > h2");
	private By corProduto = By.xpath("//*[@id=\"variations\"]/div/div[1]/div[2]/a[2]/div/img");
	private By clicarTamanho = By.xpath("/html/body/main/div[2]/div[5]/div/div[1]/div/div[1]/div/div[4]/div/div[2]/div[2]/a[3]/div/p[1]");
	private By abaProduto = By.cssSelector("#quantity-selector > span > span.ui-pdp-buybox__quantity__selected");
	private By quantidadeProduto = By.cssSelector("#\\:r6\\:-1 > button");
	private By btnComprar = By.cssSelector("#\\:rl\\: > span");
	
	public By getBuscarProdutos() {
	    return buscarProdutos;
	  }
	public By getBtnPesquisar() {
		return btnPesquisar;
	  }
	public By getBtnProduto() {
	    return btnProduto;
	  }
	public By getCorProduto() {
		return corProduto;
		
	  }
    public By getClicarTamanho() {
		return clicarTamanho;
		
		}
	public By getAbaProduto() {
			return abaProduto;
			
			}
	public By getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public By getBtnComprar() {
		return btnComprar;
	}
	
}

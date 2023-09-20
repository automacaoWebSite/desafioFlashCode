package Elementos;

import org.openqa.selenium.By;

public class Elementos {


	private By buscarProdutos = By.cssSelector("#cb1-edit");
	private By btnPesquisar = By.cssSelector("body > header > div > div.nav-area.nav-top-area.nav-center-area > form > button > div");
	private By btnProduto = By.cssSelector("#react-aria-\\:R16gl9b9\\: > div.andes-carousel-snapped__controls-wrapper > div > div > div.andes-carousel-snapped__slide.andes-carousel-snapped__slide--active > a > img");
	private By corProduto = By.xpath("//*[@id=\"variations\"]/div/div[1]/div[2]/a[2]/div/img");
	private By clicarTamanho = By.xpath("/html/body/main/div[2]/div[5]/div/div[1]/div/div[1]/div/div[4]/div/div[2]/div[2]/a[3]/div/p[1]");
	private By abaProduto = By.cssSelector("#quantity-selector > span > span.ui-pdp-buybox__quantity__selected");
	private By quantidadeProduto = By.xpath("/html/body/main/div[2]/div[5]/div/div[1]/div/div[1]/div/div[7]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/ul/li[2]/button");
	private By btnComprar = By.xpath("//*[@id=\":ro:\"]/span");
	
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

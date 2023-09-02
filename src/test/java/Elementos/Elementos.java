package Elementos;

import org.openqa.selenium.By;

public class Elementos {


	private By buscarProdutos = By.id("cb1-edit");
	private By btnPesquisar = By.cssSelector("body > header > div > div.nav-area.nav-top-area.nav-center-area > form > button");
	private By btnProduto = By.cssSelector("#\\:Rjoakpp\\: > div.andes-carousel-snapped__controls-wrapper > div > div > div.andes-carousel-snapped__slide.andes-carousel-snapped__slide--active > a > img");
	private By corProduto = By.xpath("//*[@id=\"variations\"]/div/div[1]/div[2]/a[2]/div/img");
	private By clicarTamanho = By.xpath("//*[@id=\":R2kmb6c5:-display-values\"]/span/span");
	private By tamanhoProduto = By.xpath("/html/body/main/div[2]/div[5]/div/div[1]/div/div[1]/div/div[4]/div/div[2]/div[2]/div/div/div/div/ul/li[9]/div/div/span/span/span[1]");
	private By btnComprar = By.xpath("/html/body/main/div[2]/div[5]/div/div[1]/div/div[1]/div/div[7]/form/div/button[1]/span");
	
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
	public By getTamanhoProduto() {
		return tamanhoProduto;
	

	}
	public By getBtnComprar() {
		return btnComprar;
	}
	
}

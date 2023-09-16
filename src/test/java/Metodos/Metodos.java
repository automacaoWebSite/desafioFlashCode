package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;
	
	public void abrindoNavegador (String url) {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\ellbe\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
				
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
		
	}
	
	public void pausar(int tempo)throws InterruptedException{
		Thread.sleep(tempo);
		
	}
	
	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
			
	}
	

    public void scrool() {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollBy(0, 1800);");
    
    }
	
	public void fecharNavegador() {
		driver.quit();
			
	}
	
}

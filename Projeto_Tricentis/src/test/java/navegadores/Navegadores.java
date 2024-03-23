package navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegadores extends DriversFactory {
	static boolean exibirNavegador = false;
	public  static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		if(exibirNavegador) {	options.addArguments("--headless");
		
		}
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		

	}
	public static void fecharNavegador() {
		driver.quit();
	}

}

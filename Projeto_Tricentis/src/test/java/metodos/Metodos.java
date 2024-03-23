package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos extends DriversFactory {

	public void validarMensagem(By elemento, String msgEsperada) {
		String msgCapturado = driver.findElement(elemento).getText();
		assertEquals(msgEsperada, msgCapturado);

	}

	public void validarTitle(String tituloDesejado) {
		assertEquals(tituloDesejado, driver.getTitle());

	}

	public void evidencias(String evidencia) {
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File srcDest = new File("./evidencias/" + evidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, srcDest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void aguardarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		element.click();
	}

	public void validarUrl(String texto) {
		String url = driver.getCurrentUrl();
		assertTrue(url.contains(texto));
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public void uploadArquivo(String caminho) {
		try {
			Robot robot = new Robot();
			robot.delay(1000);
			StringSelection ss = new StringSelection(caminho);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(1000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_V);
		} catch (AWTException e) {

			e.printStackTrace();
		}

	}
}

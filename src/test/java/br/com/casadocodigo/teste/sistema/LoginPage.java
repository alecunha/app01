package br.com.casadocodigo.teste.sistema;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	// Declarando um objeto do tipo WebDriver, utilizado pelo Selenium WebDriver. 
	private static WebDriver driver; 
	// Método que inicia tudo que for necessário para o teste 
	@Before
	public void setUpTest() {
		driver = new FirefoxDriver();
		driver.get("http://10.3.1.101:8080/app01/web");
	}


	@Test
	public void usuarioErrado() {
		driver.findElement(By.id("usuario")).sendKeys("admin1");
		driver.findElement(By.id("senha")).sendKeys("123");
		
		driver.findElement(By.id("entrar")).click();
	    new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-danger")));
		assertTrue(driver.findElement(By.className("alert-danger")).getText().contains("Login/Senha inválidos"));

	}
	
	@Test
	public void senhaErrada() {
		
		driver.findElement(By.id("usuario")).sendKeys("admin");
		driver.findElement(By.id("senha")).sendKeys("12345");
		
		driver.findElement(By.id("entrar")).click();
		new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-danger")));
		assertTrue(driver.findElement(By.className("alert-danger")).getText().contains("Login/Senha inválidos"));
	}
	
	@Test
	public void usuarioEsenhaCorretos() {
		driver.findElement(By.id("usuario")).sendKeys("admin");
		driver.findElement(By.id("senha")).sendKeys("123");
		
		driver.findElement(By.id("entrar")).click();
		new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.id("home")));
		assertTrue(driver.findElement(By.id("home")).getText().contains("Bem vindo"));
	}
	
	@After
	public void tearDownTest(){
		driver.quit();
	}
}

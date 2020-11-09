package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_chrome() {
	    System.out.println("Abre el navegador Chrome");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost:8081/BancoPlatinium/Login.jsp");
	}

	@When("ingresa Username {string} y Password {string}")
	public void ingresa_username_y_password(String username, String password) {
	    System.out.println("Ingresa las credenciales de usuario");
	    driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);

	}

	@Then("inicia sesion")
	public void inicia_sesion() {
	    System.out.println("Inicia sesion con los datos de prueba de MyTest.feature");
	    driver.findElement(By.id("btnLogin")).click();

	}
	
		@Then("no inicia sesion")
		public void no_inicia_sesion() {
		    System.out.println("NO Inicia sesion con los datos de prueba de MyTest.feature");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

}

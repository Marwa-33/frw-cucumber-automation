package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.e2etests.automation.page_objects.RegisterPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
	public WebDriver driver;
	private RegisterPage registerpage;
	
	public RegisterStepDefinition() {
		driver = Setup.getDriver();
		this.registerpage = new RegisterPage();
	}

	@Given("je suis sur la page de connexion Mercury")
	public void jeSuisSurLaPageDeConnexionMercury() {
		registerpage.goToURL();
	}
	@When("je clique sur le lien registre")
	public void jeCliqueSurLeLienRegistre() {
		Actions actions = new Actions(driver);
		actions.moveToElement(registerpage.lienregister);
		registerpage.clickRegistre();
	}
	@When("je saisis firstName {string}")
	public void jeSaisisFirstName(String firstname) {
		registerpage.fillFirstName(firstname);
	}
	@When("je saisis lastName {string}")
	public void jeSaisisLastName(String lastname) {
		registerpage.fillLastName(lastname);
	 
	}
	@When("je saisis phone {string}")
	public void jeSaisisPhone(String phone) {
		registerpage.fillPhone(phone);
	    
	}
	@When("je saisis userName {string}")
	public void jeSaisisUserName(String username) {
		registerpage.fillUserName(username);
	   
	}
	@When("je saisis address1 {string}")
	public void jeSaisisAddress1(String adr) {
		registerpage.fillAdresse(adr);
	    
	}
	@When("je saisis city {string}")
	public void jeSaisisCity(String cityv) {
		registerpage.fillCity(cityv);
	   
	}
	@When("je saisis state {string}")
	public void jeSaisisState(String stat) {
		registerpage.fillState(stat);
	    
	}
	@When("je saisis postalCode {string}")
	public void jeSaisisPostalCode(String codep) {
		registerpage.fillCodePostal(codep);

	}
	@When("je saisis country {string}")
	public void jeSaisisCountry(String string) {
	    
	}
	@When("je saisis email {string}")
	public void jeSaisisEmail(String mail) {
		registerpage.fillEmail(mail);
	}
	@When("je saisis password {string}")
	public void jeSaisisPassword(String pwd) {
		registerpage.fillPassword(pwd);
	    
	}
	@When("je saisis confirmPassword {string}")
	public void jeSaisisConfirmPassword(String confpwd) {
		registerpage.fillConfirmPassword(confpwd);
	}
	@When("je clique sur le bouton envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		registerpage.ClickSubmitButton();
	    
	}
	@Then("je me redirigee vers la page de confirmation de mon inscritption et un message de succes s affiche  {string}")
	public void jeMeRedirigeeVersLaPageDeConfirmationDeMonInscritptionEtUnMessageDeSuccesSAffiche(String text) {
		String msg = registerpage.successMessage.getText();
	    Assert.assertEquals(msg, text);
	}



}

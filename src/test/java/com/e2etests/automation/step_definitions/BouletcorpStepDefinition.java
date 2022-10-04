package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletcorpStepDefinition extends SeleniumUtils{
	
	

	private BouletcorpPage bouletcorpPage;
	// private SeleniumUtils seleniumUtils;

	public BouletcorpStepDefinition() {
		this.bouletcorpPage = new BouletcorpPage();
		// this.seleniumUtils = new SeleniumUtils();
	}
	 
	@Given("Je me connecte sur le site BouletCorp")
	public void jeMeConnecteSurLeSiteBouletCorp() {
		bouletcorpPage.goToUrl();

	}
	
	

	String pageActuel = getPageSource();

	@When("Je clique sur boutton Aleatoire")
	public void jeCliqueSurBouttonAleatoire() {
		bouletcorpPage.clickOnBtnAleatoir();
	}

	@Then("Je me redirige vers autre page")
	public void jeMeRedirigeVersAutrePage() {
		String updatePage = getPageSource();
		Assert.assertNotEquals(updatePage, pageActuel);

	}

	@Then("Je verifier le widget facebook est bien afficher")
	public void jeVerifierLeWidgetFacebookEstBienAfficher() {
		Assert.assertTrue(bouletcorpPage.verifierFacebookAfficher());

	}

	@Then("Je verifier le widget twitter est bien afficher")
	public void jeVerifierLeWidgetTwitterEstBienAfficher() {
		
		Assert.assertTrue(bouletcorpPage.verifierTwitterAfficher());

	}

	@Then("Je verifier le widget tumblr est bien afficher {string}")
	public void jeVerifierLeWidgetTumblrEstBienAfficher(String text) {
		String message = BouletcorpPage.verifierTumblr.getText();
		Assert.assertTrue(message.contains(text));

	}

}

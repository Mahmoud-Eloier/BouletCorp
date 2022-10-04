package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class BouletcorpPage {

	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Aléatoire')]")
	public static WebElement btnaleatoir;
	@FindBy(how = How.ID, using = "today")
	public static WebElement actuelPage;
	@FindBy(how = How.ID, using = "today")
	public static WebElement Page;
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Partager sur Tumblr')]")
	public static WebElement verifierTumblr ;
	@FindBy(how = How.XPATH, using = "//*[@title='Twitter']")
	public static WebElement verifierTwitter ;
	@FindBy(how = How.XPATH, using = "//*[@title='Facebook']")
	public static WebElement verifierFacebook ;


	public BouletcorpPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create Method */
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));

	}
	
	public void clickOnBtnAleatoir() {
		btnaleatoir.click();
	}
	public boolean verifierTwitterAfficher() {
		return verifierTwitter.isDisplayed();
	}
	public boolean verifierFacebookAfficher() {
		return verifierFacebook.isDisplayed();
	}
}

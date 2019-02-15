package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import locators.EBayLocators;

public class eBayHome implements EBayLocators {

	@AndroidFindBy(id = SIGNIN_BTN)
	private WebElement signinBtn;

	@AndroidFindBy(id = HAMBURGER_MENU_BTN)
	private WebElement hamburgerMenuBtn;

	@AndroidFindBy(id = SETTINGS_BTN)
	private WebElement settingsBtn;

	@AndroidFindBy(id = COUNTRY_REGION_BTN)
	private WebElement countryRegionBtn;

	@AndroidFindBy(xpath = SEARCH_BOX)
	private AndroidElement search_Box;

	@AndroidFindBy(xpath = SEARCH_BOX_INPUT)
	private WebElement search_box_input;

	@AndroidFindBy(xpath = LED_TV)
	private WebElement ledTV_Option;

	@AndroidFindBy(id = AUTO_DETECT_TOGGLE_BTN)
	private WebElement auto_Detect_toggle_btn;

	@AndroidFindBy(xpath = OK_BTN)
	private WebElement ok_btn;

	@AndroidFindBy(id = PHONE_TEXT_BOX)
	private WebElement phn_txt_box;

	@AndroidFindBy(id = ADDRESS_TEXT_BOX)
	private WebElement address_txt_box;

	@AndroidFindBy(id = CONTINUE_BTN)
	private WebElement continue_Btn;

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public WebElement getAddress_txt_box() {
		return address_txt_box;
	}

	public void setAddress_txt_box(WebElement address_txt_box) {
		this.address_txt_box = address_txt_box;
	}

	public WebElement getPhn_txt_box() {
		return phn_txt_box;
	}

	public void setPhn_txt_box(WebElement phn_txt_box) {
		this.phn_txt_box = phn_txt_box;
	}

	public WebElement getOk_btn() {
		return ok_btn;
	}

	public void setOk_btn(WebElement ok_btn) {
		this.ok_btn = ok_btn;
	}

	public WebElement getLedTV_Option() {
		return ledTV_Option;
	}

	public WebElement getAuto_Detect_toggle_btn() {
		return auto_Detect_toggle_btn;
	}

	public WebElement getSearch_box_input() {
		return search_box_input;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getHamburgerMenuBtn() {
		return hamburgerMenuBtn;
	}

	public WebElement getSettingsBtn() {
		return settingsBtn;
	}

	public WebElement getCountryRegionBtn() {
		return countryRegionBtn;
	}

	public AndroidElement getSearch_Box() {
		return search_Box;
	}
}

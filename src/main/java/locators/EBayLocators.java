package locators;

public interface EBayLocators {

	public final String EBAY_PACKAGE_NAME = "com.eaby.mobile";

	// public final String ANDROID_PACKAGE_NAME = "com.android.packageinstaller";

	public final String SIGNIN_BTN = EBAY_PACKAGE_NAME + ":id/button_sign_in";

	public final String HAMBURGER_MENU_BTN = EBAY_PACKAGE_NAME + ":id/home";

	public final String SETTINGS_BTN = EBAY_PACKAGE_NAME + ":id/design_menu_item_text";

	public final String COUNTRY_REGION_BTN = "//android.widget.TextView[@text='Country/region' " + "and @resource-id='"
			+ EBAY_PACKAGE_NAME + ":id/title']";

	public final String AUTO_DETECT_TOGGLE_BTN = EBAY_PACKAGE_NAME + ":id/switch_widget";

	public final String COUNTRY_BTN = "//android.widget.TextView[@text='Country/region' " + "and @resource-id='"
			+ EBAY_PACKAGE_NAME + ":id/title']";

	public final String SEARCH_BOX = "//android.widget.TextView[@text='Search for anything' " + "and @resource-id='"
			+ EBAY_PACKAGE_NAME + ":id/search_box']";

//	public final String SEARCH_BOX = EBAY_PACKAGE_NAME + ":class/android.widget.TextView";

	public final String SEARCH_BOX_INPUT = "//android.widget.TextView[@text='Search for anything' "
			+ "and @resource-id='" + EBAY_PACKAGE_NAME + ":id/search_src_text']";

	public final String LED_TV = "//android.widget.TextView[@text='led tv\r\n" + "TV, Video & Home Audio Electronics' "
			+ "and @resource-id='" + EBAY_PACKAGE_NAME + ":id/text' and @index='0']";

	public final String BUYNOW_BTN = EBAY_PACKAGE_NAME + ":id/button_bin";

	public final String OK_BTN = "//android.widget.TextView[@text='OK' " + "and @resource-id='" + EBAY_PACKAGE_NAME
			+ ":id/button1']";
	public final String CONTINUE_BTN = "//android.widget.TextView[@text='Continue' " + "and @resource-id='"
			+ EBAY_PACKAGE_NAME + ":id/sbtBtn']";

	public final String ADDRESS_TEXT_BOX = EBAY_PACKAGE_NAME + ":id/addressSugg";

	public final String PHONE_TEXT_BOX = EBAY_PACKAGE_NAME + ":id/phoneFlagComp1";

}

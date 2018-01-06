
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "a[href='https://www.google.co.in/intl/en_in/about/?utm_source=google.com&utm_medium=referral&utm_campaign=hp-footer&fg=1']")
	@CacheLookup
	private WebElement about;

	@FindBy(css = "a.gb_ya.gb_Of")
	@CacheLookup
	private WebElement addAShortcut;

	@FindBy(css = "a.gb_Fa.gb_Kf.gb_Be.gb_Eb")
	@CacheLookup
	private WebElement addAccount;

	@FindBy(css = "a[href='/advanced_search?hl=en-IN&fg=1']")
	@CacheLookup
	private WebElement advancedSearch;

	@FindBy(css = "a[href='https://www.google.co.in/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1']")
	@CacheLookup
	private WebElement advertising;

	@FindBy(css = "a.gb_2b.gb_9a")
	@CacheLookup
	private WebElement allYourBrandAccounts;

	@FindBy(id = "gb30")
	@CacheLookup
	private WebElement blogger;

	@FindBy(id = "gb10")
	@CacheLookup
	private WebElement books;

	@FindBy(css = "a[href='https://www.google.co.in/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1']")
	@CacheLookup
	private WebElement business;

	@FindBy(id = "gb24")
	@CacheLookup
	private WebElement calendar;

	@FindBy(css = "a.gb_xb.gb_Of.gb_zb")
	@CacheLookup
	private WebElement change;

	@FindBy(id = "gb265")
	@CacheLookup
	private WebElement classroom;

	@FindBy(id = "gb53")
	@CacheLookup
	private WebElement contacts;

	@FindBy(css = "a[title='Share']")
	@CacheLookup
	private WebElement dataimagepngbase64ivborw0kggoaaaansuheugaaabyaaaawcayaaadetgw7aaaaokleqvr42mngsdvdqaz2aokzqpwaimdcxrbqydt0dbd;

	@FindBy(id = "gb25")
	@CacheLookup
	private WebElement docs;

	@FindBy(id = "gb49")
	@CacheLookup
	private WebElement drive;

	@FindBy(id = "hotword__chw-oe")
	@CacheLookup
	private WebElement enableOkGoogle;

	@FindBy(css = "a.gb_ka.gb_Jf")
	@CacheLookup
	private WebElement evenMoreFromGoogle;

	@FindBy(css = "#gbw div div.gb_lb.gb_Ag.gb_R.gb_zg.gb_Dg.gb_T div:nth-of-type(1) div:nth-of-type(2) a.gb_P")
	@CacheLookup
	private WebElement gmail1;

	@FindBy(id = "gb23")
	@CacheLookup
	private WebElement gmail2;

	@FindBy(id = "gb119")
	@CacheLookup
	private WebElement google;

	@FindBy(css = "#gbw div div.gb_lb.gb_Ag.gb_R.gb_zg.gb_Dg.gb_T div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(1) div.gb_yb div:nth-of-type(3) a:nth-of-type(1)")
	@CacheLookup
	private WebElement googleProfile;

	@FindBy(name = "btnK")
	@CacheLookup
	private WebElement googleSearch;

	@FindBy(id = "gb300")
	@CacheLookup
	private WebElement hangouts;

	@FindBy(css = "#chm div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(2)")
	@CacheLookup
	private WebElement help;

	@FindBy(css = "a[href='/history?hl=en-IN&fg=1']")
	@CacheLookup
	private WebElement history;

	@FindBy(name = "btnI")
	@CacheLookup
	private WebElement imFeelingLucky;

	@FindBy(css = "a[href='https://www.google.co.in/imghp?hl=en&tab=wi']")
	@CacheLookup
	private WebElement images;

	@FindBy(id = "gb136")
	@CacheLookup
	private WebElement keep;

	@FindBy(css = "a[href='//support.google.com/websearch/answer/186645?hl=en-IN']")
	@CacheLookup
	private WebElement learnMore1;

	@FindBy(css = "a[href='https://support.google.com/chrome/?p=ui_hotword_search']")
	@CacheLookup
	private WebElement learnMore2;

	@FindBy(id = "gb8")
	@CacheLookup
	private WebElement maps;

	@FindBy(css = "a.gb_ja.gb_Of")
	@CacheLookup
	private WebElement more;

	@FindBy(id = "gb192")
	@CacheLookup
	private WebElement myAccount1;

	@FindBy(css = "a.gb_Fa.gb_Lf.gbp1.gb_Be.gb_Eb")
	@CacheLookup
	private WebElement myAccount2;

	@FindBy(id = "gb5")
	@CacheLookup
	private WebElement news;

	@FindBy(id = "hotword__chw-on")
	@CacheLookup
	private WebElement noThanks;

	private final String pageLoadedText = "";

	private final String pageUrl = "/";

	@FindBy(id = "gb31")
	@CacheLookup
	private WebElement photos;

	@FindBy(id = "gb78")
	@CacheLookup
	private WebElement play;

	@FindBy(css = "a[href='https://myaccount.google.com/privacypolicy']")
	@CacheLookup
	private WebElement privacy1;

	@FindBy(css = "a[href='//www.google.co.in/intl/en_in/policies/privacy/?fg=1']")
	@CacheLookup
	private WebElement privacy2;

	@FindBy(id = "sbfblt")
	@CacheLookup
	private WebElement reportInappropriatePredictions;

	@FindBy(css = "#chm div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(1)")
	@CacheLookup
	private WebElement restartListening;

	@FindBy(id = "lst-ib")
	@CacheLookup
	private WebElement restartListeninghelphotwordDetectionIsOff1;

	@FindBy(id = "gs_taif0")
	@CacheLookup
	private WebElement restartListeninghelphotwordDetectionIsOff2;

	@FindBy(id = "gs_htif0")
	@CacheLookup
	private WebElement restartListeninghelphotwordDetectionIsOff3;

	@FindBy(id = "gb1")
	@CacheLookup
	private WebElement search;

	@FindBy(css = "a[href='//support.google.com/websearch/?p=ws_results_help&hl=en-IN&fg=1']")
	@CacheLookup
	private WebElement searchHelp;

	@FindBy(css = "a[href='https://www.google.co.in/preferences?hl=en-IN&fg=1']")
	@CacheLookup
	private WebElement searchSettings;

	@FindBy(id = "_Yvd")
	@CacheLookup
	private WebElement sendFeedback;

	@FindBy(id = "fsettl")
	@CacheLookup
	private WebElement settings;

	@FindBy(css = "a.gb_Ob.gb_Vb")
	@CacheLookup
	private WebElement shreyanshJainshreyanshJain79gmailComDefault;

	@FindBy(id = "csi")
	@CacheLookup
	private WebElement shreyanshgmailimagesmyAccountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchaddAShortcutmoredocsbooksbloggercontactshangoutskeepclassroomevenMoreFrom;

	@FindBy(id = "gb_71")
	@CacheLookup
	private WebElement signOut;

	@FindBy(css = "a[href='https://www.google.co.in/webhp?hl=en&ictx=2&sa=X&ved=0ahUKEwiynozL-LzXAhWKwI8KHfQYApsQPQgD']")
	@CacheLookup
	private WebElement stAnniversaryOfTheHolePuncher1131;

	@FindBy(css = "a[href='/search?site=&q=hole+punch+history&oi=ddle&ct=131st-anniversary-of-the-hole-puncher-5763551741345792&hl=en&sa=X&ved=0ahUKEwiynozL-LzXAhWKwI8KHfQYApsQPQgG']")
	@CacheLookup
	private WebElement stAnniversaryOfTheHolePuncher2131;

	@FindBy(css = "#chm div:nth-of-type(3) div a")
	@CacheLookup
	private WebElement startListeningForOkGoogle;

	@FindBy(css = "a[href='//www.google.co.in/intl/en_in/policies/terms/?fg=1']")
	@CacheLookup
	private WebElement terms;

	@FindBy(id = "gb51")
	@CacheLookup
	private WebElement translate;

	@FindBy(id = "gb36")
	@CacheLookup
	private WebElement youtube;

	public FirstPage() {
	}

	public FirstPage(WebDriver driver) {
		this();
		this.driver = driver;
	}

	public FirstPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public FirstPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickAboutLink() {
		about.click();
		return this;
	}

	/**
	 * Click on Add A Shortcut Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickAddAShortcutLink() {
		addAShortcut.click();
		return this;
	}

	/**
	 * Click on Add Account Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickAddAccountLink() {
		addAccount.click();
		return this;
	}

	/**
	 * Click on Advanced Search Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickAdvancedSearchLink() {
		advancedSearch.click();
		return this;
	}

	/**
	 * Click on Advertising Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickAdvertisingLink() {
		advertising.click();
		return this;
	}

	/**
	 * Click on All Your Brand Accounts Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickAllYourBrandAccountsLink() {
		allYourBrandAccounts.click();
		return this;
	}

	/**
	 * Click on Blogger Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickBloggerLink() {
		blogger.click();
		return this;
	}

	/**
	 * Click on Books Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickBooksLink() {
		books.click();
		return this;
	}

	/**
	 * Click on Business Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickBusinessLink() {
		business.click();
		return this;
	}

	/**
	 * Click on Calendar Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickCalendarLink() {
		calendar.click();
		return this;
	}

	/**
	 * Click on Change Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickChangeLink() {
		change.click();
		return this;
	}

	/**
	 * Click on Classroom Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickClassroomLink() {
		classroom.click();
		return this;
	}

	/**
	 * Click on Contacts Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickContactsLink() {
		contacts.click();
		return this;
	}

	/**
	 * Click on
	 * Dataimagepngbase64ivborw0kggoaaaansuheugaaabyaaaawcayaaadetgw7aaaaokleqvr42mngsdvdqaz2aokzqpwaimdcxrbqydt0dbd
	 * Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickDataimagepngbase64ivborw0kggoaaaansuheugaaabyaaaawcayaaadetgw7aaaaokleqvr42mngsdvdqaz2aokzqpwaimdcxrbqydt0dbdLink() {
		dataimagepngbase64ivborw0kggoaaaansuheugaaabyaaaawcayaaadetgw7aaaaokleqvr42mngsdvdqaz2aokzqpwaimdcxrbqydt0dbd
				.click();
		return this;
	}

	/**
	 * Click on Docs Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickDocsLink() {
		docs.click();
		return this;
	}

	/**
	 * Click on Drive Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickDriveLink() {
		drive.click();
		return this;
	}

	/**
	 * Click on Enable Ok Google Button.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickEnableOkGoogleButton() {
		enableOkGoogle.click();
		return this;
	}

	/**
	 * Click on Even More From Google Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickEvenMoreFromGoogleLink() {
		evenMoreFromGoogle.click();
		return this;
	}

	/**
	 * Click on Gmail Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickGmail1Link() {
		gmail1.click();
		return this;
	}

	/**
	 * Click on Gmail Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickGmail2Link() {
		gmail2.click();
		return this;
	}

	/**
	 * Click on Google Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickGoogleLink() {
		google.click();
		return this;
	}

	/**
	 * Click on Google Profile Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickGoogleProfileLink() {
		googleProfile.click();
		return this;
	}

	/**
	 * Click on Google Search Button.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickGoogleSearchButton() {
		googleSearch.click();
		return this;
	}

	/**
	 * Click on Hangouts Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickHangoutsLink() {
		hangouts.click();
		return this;
	}

	/**
	 * Click on Help Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickHelpLink() {
		help.click();
		return this;
	}

	/**
	 * Click on History Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickHistoryLink() {
		history.click();
		return this;
	}

	/**
	 * Click on Im Feeling Lucky Button.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickImFeelingLuckyButton() {
		imFeelingLucky.click();
		return this;
	}

	/**
	 * Click on Images Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickImagesLink() {
		images.click();
		return this;
	}

	/**
	 * Click on Keep Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickKeepLink() {
		keep.click();
		return this;
	}

	/**
	 * Click on Learn More Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickLearnMore1Link() {
		learnMore1.click();
		return this;
	}

	/**
	 * Click on Learn More Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickLearnMore2Link() {
		learnMore2.click();
		return this;
	}

	/**
	 * Click on Maps Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickMapsLink() {
		maps.click();
		return this;
	}

	/**
	 * Click on More Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickMoreLink() {
		more.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickMyAccount1Link() {
		myAccount1.click();
		return this;
	}

	/**
	 * Click on My Account Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickMyAccount2Link() {
		myAccount2.click();
		return this;
	}

	/**
	 * Click on News Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickNewsLink() {
		news.click();
		return this;
	}

	/**
	 * Click on No Thanks Button.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickNoThanksButton() {
		noThanks.click();
		return this;
	}

	/**
	 * Click on Photos Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickPhotosLink() {
		photos.click();
		return this;
	}

	/**
	 * Click on Play Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickPlayLink() {
		play.click();
		return this;
	}

	/**
	 * Click on Privacy Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickPrivacy1Link() {
		privacy1.click();
		return this;
	}

	/**
	 * Click on Privacy Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickPrivacy2Link() {
		privacy2.click();
		return this;
	}

	/**
	 * Click on Report Inappropriate Predictions Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickReportInappropriatePredictionsLink() {
		reportInappropriatePredictions.click();
		return this;
	}

	/**
	 * Click on Restart Listening Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickRestartListeningLink() {
		restartListening.click();
		return this;
	}

	/**
	 * Click on Search Help Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickSearchHelpLink() {
		searchHelp.click();
		return this;
	}

	/**
	 * Click on Search Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickSearchLink() {
		search.click();
		return this;
	}

	/**
	 * Click on Search Settings Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickSearchSettingsLink() {
		searchSettings.click();
		return this;
	}

	/**
	 * Click on Send Feedback Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickSendFeedbackLink() {
		sendFeedback.click();
		return this;
	}

	/**
	 * Click on Settings Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickSettingsLink() {
		settings.click();
		return this;
	}

	/**
	 * Click on Shreyansh Jainshreyansh.jain79gmail.com Default Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickShreyanshJainshreyanshJain79gmailComDefaultLink() {
		shreyanshJainshreyanshJain79gmailComDefault.click();
		return this;
	}

	/**
	 * Click on Sign Out Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickSignOutLink() {
		signOut.click();
		return this;
	}

	/**
	 * Click on 131st Anniversary Of The Hole Puncher Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickStAnniversaryOfTheHolePuncher1Link131() {
		stAnniversaryOfTheHolePuncher1131.click();
		return this;
	}

	/**
	 * Click on 131st Anniversary Of The Hole Puncher Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickStAnniversaryOfTheHolePuncher2Link131() {
		stAnniversaryOfTheHolePuncher2131.click();
		return this;
	}

	/**
	 * Click on Start Listening For Ok Google Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickStartListeningForOkGoogleLink() {
		startListeningForOkGoogle.click();
		return this;
	}

	/**
	 * Click on Terms Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickTermsLink() {
		terms.click();
		return this;
	}

	/**
	 * Click on Translate Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickTranslateLink() {
		translate.click();
		return this;
	}

	/**
	 * Click on Youtube Link.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage clickYoutubeLink() {
		youtube.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage fill() {
		setShreyanshgmailimagesmyAccountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchaddAShortcutmoredocsbooksbloggercontactshangoutskeepclassroomevenMoreFromTextareaField();
		setRestartListeninghelphotwordDetectionIsOff1TextField();
		setRestartListeninghelphotwordDetectionIsOff2TextField();
		setRestartListeninghelphotwordDetectionIsOff3TextField();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set default value to Restart Listeninghelphotword Detection Is Off Text
	 * field.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage setRestartListeninghelphotwordDetectionIsOff1TextField() {
		return setRestartListeninghelphotwordDetectionIsOff1TextField(
				data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_1"));
	}

	/**
	 * Set value to Restart Listeninghelphotword Detection Is Off Text field.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage setRestartListeninghelphotwordDetectionIsOff1TextField(
			String restartListeninghelphotwordDetectionIsOff1Value) {
		restartListeninghelphotwordDetectionIsOff1.sendKeys(restartListeninghelphotwordDetectionIsOff1Value);
		return this;
	}

	/**
	 * Set default value to Restart Listeninghelphotword Detection Is Off Text
	 * field.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage setRestartListeninghelphotwordDetectionIsOff2TextField() {
		return setRestartListeninghelphotwordDetectionIsOff2TextField(
				data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_2"));
	}

	/**
	 * Set value to Restart Listeninghelphotword Detection Is Off Text field.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage setRestartListeninghelphotwordDetectionIsOff2TextField(
			String restartListeninghelphotwordDetectionIsOff2Value) {
		restartListeninghelphotwordDetectionIsOff2.sendKeys(restartListeninghelphotwordDetectionIsOff2Value);
		return this;
	}

	/**
	 * Set default value to Restart Listeninghelphotword Detection Is Off Text
	 * field.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage setRestartListeninghelphotwordDetectionIsOff3TextField() {
		return setRestartListeninghelphotwordDetectionIsOff3TextField(
				data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_3"));
	}

	/**
	 * Set value to Restart Listeninghelphotword Detection Is Off Text field.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage setRestartListeninghelphotwordDetectionIsOff3TextField(
			String restartListeninghelphotwordDetectionIsOff3Value) {
		restartListeninghelphotwordDetectionIsOff3.sendKeys(restartListeninghelphotwordDetectionIsOff3Value);
		return this;
	}

	/**
	 * Set default value to Shreyanshgmailimagesmy
	 * Accountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchadd
	 * A Shortcutmoredocsbooksbloggercontactshangoutskeepclassroomeven More From
	 * Googlechangeshreyansh Jainshreyansh Textarea field.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage setShreyanshgmailimagesmyAccountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchaddAShortcutmoredocsbooksbloggercontactshangoutskeepclassroomevenMoreFromTextareaField() {
		return setShreyanshgmailimagesmyAccountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchaddAShortcutmoredocsbooksbloggercontactshangoutskeepclassroomevenMoreFromTextareaField(
				data.get(
						"SHREYANSHGMAILIMAGESMY_ACCOUNTSEARCHMAPSYOUTUBEPLAYNEWSGMAILDRIVECALENDARGOOGLETRANSLATEPHOTOSSEARCHADD_A_SHORTCUTMOREDOCSBOOKSBLOGGERCONTACTSHANGOUTSKEEPCLASSROOMEVEN_MORE_FROM"));
	}

	/**
	 * Set value to Shreyanshgmailimagesmy
	 * Accountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchadd
	 * A Shortcutmoredocsbooksbloggercontactshangoutskeepclassroomeven More From
	 * Googlechangeshreyansh Jainshreyansh Textarea field.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage setShreyanshgmailimagesmyAccountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchaddAShortcutmoredocsbooksbloggercontactshangoutskeepclassroomevenMoreFromTextareaField(
			String shreyanshgmailimagesmyAccountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchaddAShortcutmoredocsbooksbloggercontactshangoutskeepclassroomevenMoreFromValue) {
		shreyanshgmailimagesmyAccountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchaddAShortcutmoredocsbooksbloggercontactshangoutskeepclassroomevenMoreFrom
				.sendKeys(
						shreyanshgmailimagesmyAccountsearchmapsyoutubeplaynewsgmaildrivecalendargoogletranslatephotossearchaddAShortcutmoredocsbooksbloggercontactshangoutskeepclassroomevenMoreFromValue);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage submit() {
		clickImFeelingLuckyButton();
		return this;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage verifyPageLoaded() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getPageSource().contains(pageLoadedText);
			}
		});
		return this;
	}

	/**
	 * Verify that current page URL matches the expected URL.
	 *
	 * @return the FirstPage class instance.
	 */
	public FirstPage verifyPageUrl() {
		(new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;
	}
}

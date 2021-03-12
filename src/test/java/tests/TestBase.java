package tests;

import static helpers.DriverHelper.configureDriver;

import org.junit.jupiter.api.BeforeAll;

import pages.external.FacebookAuthPage;
import pages.external.GoogleAuthPage;


public class TestBase {
	GoogleAuthPage googleAuthPage = new GoogleAuthPage();
	FacebookAuthPage facebookAuthPage = new FacebookAuthPage();

	@BeforeAll
	public static void beforeAll() {
		configureDriver();
	}
}

package tests;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static config.ConfigHelper.getFacebookPassword;
import static config.ConfigHelper.getFacebookUsername;

import org.junit.jupiter.api.*;

import com.codeborne.selenide.Selenide;

import io.qameta.allure.Feature;


@Tag("web")
@Feature("Login tests")
public class LoginTests extends TestBase {

	@Test
	@Disabled
	@DisplayName("Successful login Google account'")
	void loginWithGoogleTest() {
		open("");
		$(".android.login-button").click();
		googleAuthPage.login("vltested1", "123qwe123*");
		$(by("data-test-id", "onboarding-geolocation-access")).shouldBe(visible);
	}

	@Test
	@DisplayName("Successful login Facebook account'")
	void loginWithFacebookTest() {
		open("https://medium.com/");
		$(byText("Sign In")).click();
		$(byText("Sign in with Facebook")).click();
		facebookAuthPage.login(getFacebookUsername(), getFacebookPassword());
		Selenide.sleep(5000);
//		$(by("data-test-id", "onboarding-geolocation-access")).shouldBe(visible);
	}
}

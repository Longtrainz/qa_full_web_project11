package pages.external;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

import io.qameta.allure.Step;


public class FacebookAuthPage {
	private final static SelenideElement
			facebookLoginForm = $("#loginform"),
			facebookEmailInput = $("#email"),
			facebookPasswordInput = $("#pass"),
			facebookLogInButton = $("#loginbutton");

	@Step("Authorization with Facebook")
	public void login(String username, String password) {
		facebookEmailInput.setValue(username);
		facebookPasswordInput.setValue(password);
		facebookLogInButton.click();

		facebookLoginForm.should(disappear);
	}
}

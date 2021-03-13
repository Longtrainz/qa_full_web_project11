package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static helpers.DriverHelper.getConsoleLogs;
import static io.qameta.allure.Allure.step;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.*;

import io.qameta.allure.Feature;


@Feature("Onboarding page content")
@Tag("web")
public class OnboardingPageTests extends TestBase {


	@Test
	@Disabled
	@DisplayName("Console log should not have any errors")
	void consoleLogShouldNotHaveErrors() {
		step("Open onboarding page", () -> open("/app/ru/onboarding"));

		step("Page should not have errors (SEVERE) in console", () -> {
			String consoleLogs = getConsoleLogs();
			assertThat(consoleLogs, not(containsString("WARNING")));
		});
	}

	@Test
	@DisplayName("Page should be opened from Main page")
	void shouldBeOpenedFromMainPageTest() {
		open("");
		$(byText("Check other ads")).click();
		switchTo().window(1);

		$("#root").shouldHave(
				text("THE ANONYMOUS HOOKUP APP"));
	}

	@Test
	@DisplayName("Page should have title \"THE ANONYMOUS HOOKUP APP\"")
	void titlePageTest() {
		open("/app/en/onboarding");

		$("#root").shouldHave(
				text("THE ANONYMOUS HOOKUP APP"));
	}

}
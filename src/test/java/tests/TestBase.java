package tests;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static config.ConfigHelper.isVideoOn;
import static helpers.AttachmentsHelper.*;
import static helpers.DriverHelper.*;

import org.junit.jupiter.api.AfterEach;
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

	@AfterEach
	public void addAttachments(){
		String sessionId = getSessionId();

		attachScreenshot("Last screenshot");
		attachPageSource();
		//        attachNetwork(); // todo
		attachAsText("Browser console logs", getConsoleLogs());
		if (isVideoOn()) attachVideo(sessionId);

		closeWebDriver();
	}
}

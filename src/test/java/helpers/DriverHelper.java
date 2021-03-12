package helpers;

import static org.openqa.selenium.logging.LogType.BROWSER;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;


public class DriverHelper {

	public static void configureDriver() {
		Configuration.baseUrl = "https://pure.app/";
	}

	public static String getConsoleLogs() {
		return String.join("\n", Selenide.getWebDriverLogs(BROWSER));
	}
}

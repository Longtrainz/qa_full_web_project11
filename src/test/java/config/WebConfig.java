package config;


import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
		"system:properties",
		"classpath:config/web.properties"
})
public interface WebConfig extends Config {
	@Key("web.url")
	String webUrl();

	@Key("web.browser")
	String webBrowser();

	@Key("web.browser.screen.resolution")
	String webBrowserScreenResolution();

	@Key("web.remote.driver.user")
	String webRemoteDriverUser();

	@Key("web.remote.driver.password")
	String webRemoteDriverPassword();

}

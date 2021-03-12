package config;


import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
		"system:properties",
		"classpath:config/authorization_example.properties"
})
public interface AuthorizationConfig extends Config {

	@Key("facebook.username")
	String facebookUsername();

	@Key("facebook.password")
	String facebookPassword();

}

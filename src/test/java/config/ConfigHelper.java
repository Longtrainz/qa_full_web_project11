package config;


import org.aeonbits.owner.ConfigFactory;


public class ConfigHelper {

	public static String getFacebookUsername() {
		return getAuthorizationConfig().facebookUsername();
	}

	public static String getFacebookPassword() {
		return getAuthorizationConfig().facebookPassword();
	}

	private static AuthorizationConfig getAuthorizationConfig() {
		return ConfigFactory.newInstance().create(AuthorizationConfig.class, System.getProperties());
	}
}

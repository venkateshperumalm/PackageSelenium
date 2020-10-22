package PackageSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyConfiguration {
	Properties properties;

	public PropertyConfiguration() throws IOException{
		File configFile = new File("./src/PackageSelenium/config.properties");
		try{
			FileInputStream fis = new FileInputStream(configFile);
			properties =new Properties();
			properties.load(fis);
		}catch(Exception exception){
			System.out.println(exception.getMessage());
		}
	}
	public String getGeckoDriver(){
		return properties.getProperty("GECKO_DRIVER");
	}
	public String getGeckoDriverPath(){
		return properties.getProperty("GECKO_DRIVER_PATH");
	}
	public String getDotDashUrl(){
		return properties.getProperty("DOTDASH_URL");
	}
	public String getSeleniumeasyUrl(){
		return properties.getProperty("SELENIUMEASY_URL");
	}
}

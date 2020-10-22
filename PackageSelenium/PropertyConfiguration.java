package PackageSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyConfiguration {
	static Properties properties;

	public PropertyConfiguration() throws IOException{
		File configFile = new File("./src/PackageSelenium/config.properties");//File is used to give abstract representation to a file/pathnames that 
		//are present in a system
		try{
			FileReader fis = new FileReader(configFile);
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
	public String getFormsSet(){
		return properties.getProperty("SWITCHTEXTBOXES");
	}
	public String getF3FrameworkUrl(){
		return properties.getProperty("F3FRAMEWORK");
	}
	public String getGmailUrl(){
		return properties.getProperty("GMAILURL");
	}
}

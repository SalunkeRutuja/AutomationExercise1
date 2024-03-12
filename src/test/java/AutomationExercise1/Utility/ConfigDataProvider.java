package AutomationExercise1.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
Properties pro;
	
	public void ConfigDataProviders()
	{
		File src = new File("Configuration/config.properties");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			
			pro= new Properties();
			
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to load config file "+e.getMessage());
		} 
	}

}

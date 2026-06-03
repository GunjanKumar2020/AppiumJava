package missllaneous.demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{

	protected static Properties prop;
	
	static
	{
		String filePath=System.getProperty("user.dir")+"/src/test/resources/config1.properties";
		try 
		{
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
			
		}
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			
			throw new RuntimeException("Failed to load config file" +e);
		}
	}
	
	public static String getProperty(String key)
	{
		String value=prop.getProperty(key);
		if(value==null)
		{
			throw new RuntimeException("Property not found !!"+key);
		}
		return value;
	}
}

package missllaneous.demo4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{

	protected static Properties prop;
	protected static String loadConfigFile=System.getProperty("user.dir")+"/src/test/resources/config2.properties";
	
	static
	{
		try 
		{
			FileInputStream fis=new FileInputStream(loadConfigFile);
			prop=new Properties();
			prop.load(fis);
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key)
	{
		String value=prop.getProperty(key);
		if(value==null)
		{
			throw new  RuntimeException("Fonfig is not loaded..."+key);
		}
		return value;
	}
}

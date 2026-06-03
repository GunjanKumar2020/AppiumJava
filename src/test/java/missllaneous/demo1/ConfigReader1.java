package missllaneous.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader1 
{	

			
	protected static Properties prop;
	protected static FileInputStream fis;
	protected static String configFilePath=System.getProperty("user.dir")+ File.separator +prop.getProperty("config.properties");
		
//	public static void readConfigFile() throws IOException
//	{
//		prop=new Properties();
//		fis=new FileInputStream(configFilePath);
//		prop.load(fis);
//		
//	}
	
	static
	{
		try
		{
		prop=new Properties();
		fis=new FileInputStream(configFilePath);
		prop.load(fis);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	

}

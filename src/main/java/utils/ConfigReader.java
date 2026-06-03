package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	protected static Properties prop;
	protected static FileInputStream fis;
	protected static String propFilePath=System.getProperty("user.dir")+"//src//test//resources//config.properties";
	
	public static void readPropertyFile() throws IOException
	{
		try
		{
		prop=new Properties();
		 
		fis=new FileInputStream(propFilePath);
		prop.load(fis);
		}
		
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
	}
	
	static
	{
		try 
		{
			readPropertyFile();
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}

}

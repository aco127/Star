package Resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class UpdateProperty {
	
	

		public static Properties prop;
		public static void updateconfig(String Propertyname,String Propertyvalue)
		{
			try 
			{
				prop= new Properties();
				
			String propertiesPath = System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Config.properties";
			System.out.println(propertiesPath);
					FileInputStream fis = new FileInputStream(propertiesPath);
					prop.load(fis);
					fis.close();
					prop.setProperty(Propertyname, Propertyvalue);
					
			OutputStream output = new FileOutputStream(propertiesPath);
				prop.store(output,null);
				output.close();
			} 
			catch (IOException e)
			{
		e.printStackTrace();
			}
		}
	}



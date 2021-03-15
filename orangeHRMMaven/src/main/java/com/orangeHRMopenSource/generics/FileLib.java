package com.orangeHRMopenSource.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Note: Generic class for data driven testing
 * @author SOUMYASANTA SAHOO
 *
 */

public class FileLib {

	/**
	 * Note: This is generic method to read the data from Property File
	 * @param path
	 * @param key
	 * @return String Value
	 * @throws IOException
	 */

	public String getPropertyValue(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:/HSSM40/orangeHRMMaven/src/test/resources/Data/orangeHRMopensource.property");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
}

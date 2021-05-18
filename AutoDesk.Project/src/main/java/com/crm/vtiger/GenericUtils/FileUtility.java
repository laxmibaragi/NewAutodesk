package com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * 
 * @author BasavaRAJ
 *
 */
public class FileUtility {
	/**
	 * this method used to read data from properties and return the value based on key specified
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getPropertyKeyValue(String key) throws IOException
{
	FileInputStream fis=new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
	Properties p=new Properties();
	p.load(fis);
	return p.getProperty(key);
}
/**
 * this method used to raed data fro properties and return the value based on jey specified
 * @param jsonkey
 * @return value
 * @throws IOException
 * @throws ParseException
 */
public String getDataFromJson(String jsonkey) throws IOException, ParseException
{
	FileReader reader=new FileReader(IPathConstant.JSON_FILEPATH);
	JSONParser parser=new JSONParser();
	Object object=parser.parse(reader);
	JSONObject jsonobject=(JSONObject)object;
	String value = jsonobject.get(jsonkey).toString();
	return value;
}
}

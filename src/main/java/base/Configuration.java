package base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

	private Properties property;
	private final String propertyPath = "." + "\\base\\eBay.properties";

	public Configuration() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyPath));
			property = new Properties();
			try {
				property.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyPath);
		}
	}

}

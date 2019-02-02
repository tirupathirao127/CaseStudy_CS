package case_study.gitV3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadTestData {

	String propertiesFile = System.getProperty("user.dir") + "/TestData/" + "testdata.properties";
	Properties prop = new Properties();
	InputStream is = null;
	
	
	public ReadTestData() throws IOException {
		is = new FileInputStream(propertiesFile);
		prop.load(is);
	}
	
	public String getValue(String key) {
		return prop.getProperty(key);
	}
	
}

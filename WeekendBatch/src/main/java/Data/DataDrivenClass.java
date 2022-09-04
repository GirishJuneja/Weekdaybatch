package Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenClass {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./configuration.properties");
p.load(fis);
System.out.println(p.getProperty("url"));
	}

}

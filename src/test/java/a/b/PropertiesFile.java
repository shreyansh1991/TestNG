package a.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesFile {
	static Properties p;
	static File file;

	PropertiesFile() throws IOException {
		p = new Properties();
		file = new File(
				System.getProperty("user.dir") + File.separator + "config" + File.separator + "config.properties");
		FileInputStream in = new FileInputStream(file);
		p.load(in);
	}

	public static void main(String[] args) throws IOException {
		new PropertiesFile();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		map.put("e", "5");
		map.put("f", "6");
		map.put("g", "7");
		
		map.put("g1", "78");
		
		FileOutputStream output = new FileOutputStream(file);
		for (Map.Entry<String, String> ref : map.entrySet()) {
			p.put(ref.getKey(), ref.getValue());
		}

		p.store(output, null);
		System.out.println("g - "+p.getProperty("g"));
	
	}

}

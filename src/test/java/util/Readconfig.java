package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Readconfig {

	Properties p;

	public Readconfig() {
		File src = new File("./Configuration/config.properties");
		FileInputStream f = null;
		try {
			f = new FileInputStream(src);

			// TODO Auto-generated catch block

			p = new Properties();

			p.load(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String Url()

	{

		String Urls = p.getProperty("url");
		return Urls;
	}

	
}

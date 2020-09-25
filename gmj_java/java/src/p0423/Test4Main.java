package p0423;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.Properties;

import javax.activity.InvalidActivityException;

public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.put("server ip", "210.23.34.45");
		prop.put("port", "8080");
		prop.put("ip", "scott");
		prop.put("pwd", "tiger");
		FileOutputStream os;
		try {
			os = new FileOutputStream("src/p0423/data.xml");
			prop.storeToXML(os, "Properties test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InvalidPropertiesFormatException e){
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		Iterator<Object> it = prop.keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			System.out.println(key+":"+prop.getProperty(key));
		}
		
	}

}

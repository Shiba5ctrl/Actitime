package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FileLib {
	@Test
	public String getProperty(String url) throws IOException {
		String path = "./src/test/resources/CommonData.property";
		FileInputStream fin= new FileInputStream(path);
		Properties p= new Properties();
		p.load(fin);
		String data = p.getProperty(url);
		return data;
		//System.out.println(data);
	}
}

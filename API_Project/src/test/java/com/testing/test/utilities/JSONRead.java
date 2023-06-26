package com.testing.test.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONRead {

	public static String readData(String filepath) throws FileNotFoundException //this method use for to read "bodyData.json" file and this is use for Post request mostly
	{
		File f = new File(filepath);
		FileInputStream fi = new FileInputStream(f);
		JSONTokener jt = new JSONTokener(fi);
		JSONObject j = new JSONObject(jt);
		return j.toString();
	}
}

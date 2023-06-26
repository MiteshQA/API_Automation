package com.testing.test.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.testing.test.teststeps.HTTPMethods;
import com.testing.test.utilities.JSONRead;
import com.testing.test.utilities.PropertiesData;

public class TestCase01_Postrequest {


	@Test
	public void postRequest() throws IOException
	{
		Properties probject = PropertiesData.readPropertyData("../API_Project/URIs.properties");
		String reqBodyData = JSONRead.readData("../API_Project/src/test/java/com/testing/test/resources/payLoad.json");
		HTTPMethods http = new HTTPMethods(probject);
		http.postRequest("API_URI", reqBodyData);


	}
}

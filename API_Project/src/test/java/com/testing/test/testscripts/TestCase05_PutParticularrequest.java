package com.testing.test.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.testing.test.teststeps.HTTPMethods;
import com.testing.test.utilities.JSONRead;
import com.testing.test.utilities.PropertiesData;

public class TestCase05_PutParticularrequest {

	@Test
	public void updateParticularData() throws IOException

	{
		Properties probject = PropertiesData.readPropertyData("../API_Project/URIs.properties");
		String requestBodyData = JSONRead.readData("../API_Project/src/test/java/com/testing/test/resources/updateFile.json");
		HTTPMethods http = new HTTPMethods(probject);
		http.putParticularRequest("API_URI",requestBodyData, "7");
	}

}

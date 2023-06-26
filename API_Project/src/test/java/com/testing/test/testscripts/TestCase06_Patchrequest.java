package com.testing.test.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.testing.test.teststeps.HTTPMethods;
import com.testing.test.utilities.JSONRead;
import com.testing.test.utilities.PropertiesData;

public class TestCase06_Patchrequest {

	@Test
	public void patchRequest() throws IOException
	{
		Properties probject = PropertiesData.readPropertyData("../API_Project/URIs.properties");
		String reqBodyData = JSONRead.readData("../API_Project/src/test/java/com/testing/test/resources/FnameUpdaet.json");
		HTTPMethods http = new HTTPMethods(probject);
		http.patchParticularRequest("API_URI", reqBodyData, "6");
	}

}

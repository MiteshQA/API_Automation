package com.testing.test.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.testing.test.teststeps.HTTPMethods;
import com.testing.test.utilities.PropertiesData;

public class TestCase02_GetAllrequest {

	@Test
	public void GetAlldata() throws IOException
	{
		Properties probject = PropertiesData.readPropertyData("../API_Project/URIs.properties");
		HTTPMethods http = new HTTPMethods(probject);
		http.getRequest("API_URI");
	}

}

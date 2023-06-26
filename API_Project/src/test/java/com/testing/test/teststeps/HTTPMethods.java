package com.testing.test.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {

	Properties pr;

	public HTTPMethods(Properties pr)
	{
		this.pr = pr;
	}
	public void postRequest(String uriKey, String reqBodyData)
	{
		String uriValue = pr.getProperty(uriKey);

		Response apiRes =
		given()
		.contentType(ContentType.JSON)
		.body(reqBodyData)
		.when()
		.post(uriValue);

		System.out.println("Post API response code is....");
		System.out.println(apiRes.statusCode());
		System.out.println("API response....");
		System.out.println(apiRes.asString());
	}

	public void getRequest(String uriKey)
	{
		String uriValue = pr.getProperty(uriKey);

		Response apiRes =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);

		System.out.println("GET All API response code is....");
		System.out.println(apiRes.statusCode());
		System.out.println("API resonse is....");
		System.out.println(apiRes.asString());
	}

	public void getParticularRequest(String filepath, String endpoint)
	{
		String uriValue = pr.getProperty(filepath)+ "/" +endpoint;

		Response apiRes =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);

		System.out.println("GET Particular data API reqsponse code is....");
		System.out.println(apiRes.statusCode());
		System.out.println("API resonpse is....");
		System.out.println(apiRes.asString());
	}

	public void deleteRequest(String filepath, String endpoint)
	{
		String uriValue = pr.getProperty(filepath)+ "/" +endpoint;

		Response apiRes =
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uriValue);

		System.out.println("Delete API response code is....");
		System.out.println(apiRes.statusCode());
		System.out.println("Specific Data has been deleted successfully");
	}

	public void putParticularRequest(String filepath,String reqBodyData, String endpoint)
	{
		String uriValue = pr.getProperty(filepath)+ "/" +endpoint;

		Response apiRes =
		given()
		.contentType(ContentType.JSON)
		.body(reqBodyData)
		.when()
		.put(uriValue);

		System.out.println("Updated API respose code is....");
		System.out.println(apiRes.statusCode());
		System.out.println("Specific Data has been updated successfully");
		System.out.println(apiRes.asString());

	}

	public void patchParticularRequest(String filepath,String reqBodyData, String endpoint)
	{
		String uriValue = pr.getProperty(filepath)+ "/" +endpoint;

		Response apiRes =
		given()
		.contentType(ContentType.JSON)
		.body(reqBodyData)
		.when()
		.patch(uriValue);

		System.out.println("Updated Particular API respose code is....");
		System.out.println(apiRes.statusCode());
		System.out.println("Specific Data has been updated successfully");
		System.out.println(apiRes.asString());

	}

}

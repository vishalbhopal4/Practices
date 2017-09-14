package ReatAssured;

import com.jayway.restassured.builder.RequestSpecBuilder;
//import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

//import junit.framework.Assert;

import static com.jayway.restassured.RestAssured.*;
import java.util.jar.JarException;
import org.junit.Test;

public class RestA {
	
	
	
	//********************************-----POST--------*********************
/*	@Test
	public void TemplatePost() throws JarException,InterruptedException {
			
		//Initializing Rest API's URL
		String APIUrl = "https://glp-dev.gl-poc.com/ns/v1/templates";
					
		//Initializing payload or API body
		String APIBody= "{\"productType\": \"dfgh234567}88v\",  \"appType\": \"34567\",   \"eventType\": \"sertyu\", \"channelType\": \"inbrowser\",\"template\": {\"locale\": \"wertyui\",      \"contactName\": \"wertyui\",\"payload\": { \"message\": \"sdfghj\" }}}";
		// Building request using requestSpecBuilder
		RequestSpecBuilder builder = new RequestSpecBuilder();
			
		//Setting API's body
		builder.setBody(APIBody);
			
		//Setting content type as application/json or application/xml
		builder.setContentType("application/json; charset=UTF-8");
			
		RequestSpecification requestSpec = builder.build();
		
		//Making post request with authentication, leave blank in case there are no credentials- basic("","")
		//Response response = given().authentication().preemptive().basic({username}, {password}).spec(requestSpec).when().post(APIUrl);
		Response response = given().header("correlationId","876").spec(requestSpec).when().post(APIUrl);
		System.out.println(response.body().prettyPrint());
		//JSONObject JSONResponseBody = new JSONObject(response.body().asString());

		//String status = null;
		
		//String result = response.asString();
		System.out.println(response.statusCode());
			
		
		//Assert.assertEquals(result, "{success}");

		}*/
	//********************************-----GET--------*********************
	/*@Test
	public void TemplateGet(){

	Response resp = when().
			get("http://api.openweathermap.org/data/2.5/weather?q=Gurgaon&appid=240cc2c1fc82251ed989ad6138d18773");
	//String xml_response=resp.asString();

	System.out.println(resp.getStatusCode());
	System.out.println(resp.body().prettyPrint());
	//System.out.println(xml_response);
	Assert.assertEquals(resp.getStatusCode(), 200);

//		String respo = get("http://api.openweathermap.org/data/2.5/weather?q=Gurgaon&appid=240cc2c1fc82251ed989ad6138d18773").asString();
//		System.out.println(respo);
	}*/
	//********************************-----PUT--------*********************
		@Test
		public void TemplatePost() throws JarException,InterruptedException {
				
			//Initializing Rest API's URL
			String APIUrl = "https://glp-dev.gl-poc.com/ns/v1/templates";
						
			//Initializing payload or API body
			String APIBody= "{\"productType\": \"dfgh234567}88v\",  \"appType\": \"34567\",   \"eventType\": \"sertyu\", \"channelType\": \"inbrowser\",\"template\": {\"locale\": \"wertyui\",      \"contactName\": \"wertyui\",\"payload\": { \"message\": \"sdfghj\" }}}";
			// Building request using requestSpecBuilder
			RequestSpecBuilder builder = new RequestSpecBuilder();
				
			//Setting API's body
			builder.setBody(APIBody);
				
			//Setting content type as application/json or application/xml
			builder.setContentType("application/json; charset=UTF-8");
				
			RequestSpecification requestSpec = builder.build();
			
			//Making post request with authentication, leave blank in case there are no credentials- basic("","")
			//Response response = given().authentication().preemptive().basic({username}, {password}).spec(requestSpec).when().post(APIUrl);
			Response response = given().header("correlationId","876").spec(requestSpec).when().put(APIUrl);
			System.out.println(response.body().prettyPrint());
			//JSONObject JSONResponseBody = new JSONObject(response.body().asString());

			//String status = null;
			
			//String result = response.asString();
			System.out.println(response.statusCode());
				
			
			//Assert.assertEquals(result, "{success}");

			}
	//********************************-----DELETE--------*********************
	/*@Test
	  public void deleteTest () {
	      
		Response resp =given().when ().contentType (ContentType.JSON).delete("https://glp-qa.gl-poc.com/ns/v1/templates/3432");
		System.out.println(resp.body().prettyPrint());
	}*/
}

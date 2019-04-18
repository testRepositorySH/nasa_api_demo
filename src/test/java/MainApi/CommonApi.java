package MainApi;



import  io.restassured.RestAssured;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class CommonApi {
	
	
	public Response response = null;
	
	
	//Set BASE URI
	
	public String getBaseURI() {
		
		
		RestAssured.baseURI="https://images-api.nasa.gov";
		return RestAssured.baseURI;
	}
	
	
	public static void setUpExtent() {
	
	}
	// Get request
	
	public void getCalls(String getCall) {
		
		RequestSpecification httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET,getCall);
		String getResponse = response.getBody().asString();
		System.out.println("Response Body : " + getResponse);
		
	}
	
	//Extract status code
	
	public int getStatusCode() {
		int respStatusCode =response.getStatusCode();
		
		return respStatusCode;
	}
	
	// Extrct status line
	
	public String getStatusLine() {
		String respStatusLine =response.getStatusLine();
		
		return respStatusLine;
	}
	

	public void testQ() {
		
		
		CommonApi commonApi = new CommonApi();
		RestAssured.baseURI=commonApi.getBaseURI();
		Response response = (Response) given()
				.param("q", "apollo 11")
				.when().get("/search")
				.then().extract().response();
		
		//Get the response in json 
		String respon = response.asString();
		JsonPath jsPath = new JsonPath(respon);
		String jsonResp = jsPath.get("").toString();
		String jsonResp1 = "Response body : " + "\n" +jsonResp;
	
		System.out.println(jsonResp1);
		
		//get status code
		int statusCode =response .getStatusCode(); 
		String stCode ="Status Code is :" + String.valueOf(statusCode);
		System.out.println(stCode);
		
		
		//get status line 
		
		String statusLine = response.getStatusLine();
		String statusLine1 = "StatusLine is : "+ statusLine;
		System.out.println(statusLine1);
	
		// verification 
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		Assert.assertEquals(statusCode, 200);
		
		//header validation
		
		Headers allHeaders = response.headers();
		 
		 // Iterate over all the Headers
		 for(Header header : allHeaders)
		 {
		 System.out.println(header.getName() + " : " + header.getValue());
		 }
		 
		 String contentType = response.header("Content-Type");
		 Assert.assertEquals(contentType,"application/json; charset=UTF-8");
		 String connectionValue = response.header("Connection");
		 Assert.assertEquals(connectionValue,"keep-alive");
	
		
	}
	
	
	
	public void year_start() {
		
		
		CommonApi commonApi = new CommonApi();
		RestAssured.baseURI=commonApi.getBaseURI();
		Response response = (Response) given()
				.param("year_start", "2011")
				.when().get("/search")
				.then().extract().response();
		
		//Get the response in json 
				String respon = response.asString();
				JsonPath jsPath = new JsonPath(respon);
				String jsonResp = jsPath.get("").toString();
				String jsonResp1 = "Response body : " + "\n" +jsonResp;
			
				System.out.println(jsonResp1);
				
				
				//get status code
				int statusCode =response .getStatusCode(); 
				String stCode ="Status Code is :" + String.valueOf(statusCode);
				System.out.println(stCode);
			
				
				//get status line 
				
				String statusLine = response.getStatusLine();
				String statusLine1 = "StatusLine is : "+ statusLine;
				System.out.println(statusLine1);
				
				// verification 
				Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
				Assert.assertEquals(statusCode, 200);
				
				//header validation
				
				Headers allHeaders = response.headers();
				 
				 // Iterate over all the Headers
				 for(Header header : allHeaders)
				 {
				 System.out.println(header.getName() + " : " + header.getValue());
				 }
				 
				 String contentType = response.header("Content-Type");
				 Assert.assertEquals(contentType,"application/json; charset=UTF-8");
				 String connectionValue = response.header("Connection");
				 Assert.assertEquals(connectionValue,"keep-alive");
			
	}
	
	public void media_type () {
	
		
		CommonApi commonApi = new CommonApi();
		RestAssured.baseURI=commonApi.getBaseURI();
		Response response = (Response) given()
				.param("media_type", "audio")
				.when().get("/search")
				.then().extract().response();
		
		//Get the response in json 
				String respon = response.asString();
				JsonPath jsPath = new JsonPath(respon);
				String jsonResp = jsPath.get("").toString();
				String jsonResp1 = "Response body : " + "\n" +jsonResp;
			
				System.out.println(jsonResp1);
			
				
				//get status code
				int statusCode =response .getStatusCode(); 
				String stCode ="Status Code is :" + String.valueOf(statusCode);
				System.out.println(stCode);
			
				
				//get status line 
				
				String statusLine = response.getStatusLine();
				String statusLine1 = "StatusLine is : "+ statusLine;
				System.out.println(statusLine1);
				
				// verification 
				Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
				Assert.assertEquals(statusCode, 200);
				
				//header validation
				
				Headers allHeaders = response.headers();
				 
				 // Iterate over all the Headers
				 for(Header header : allHeaders)
				 {
				 System.out.println(header.getName() + " : " + header.getValue());
				 }
				 
				 String contentType = response.header("Content-Type");
				 Assert.assertEquals(contentType,"application/json; charset=UTF-8");
				 String connectionValue = response.header("Connection");
				 Assert.assertEquals(connectionValue,"keep-alive");
				 
			
	}
	
	
	public void yearEnd() {

	CommonApi commonApi = new CommonApi();
	RestAssured.baseURI=commonApi.getBaseURI();
	Response response = (Response) given()
			.param("year_end", "1998")
			.when().get("/search")
			.then().extract().response();
	
	//Get the response in json 
			String respon = response.asString();
			JsonPath jsPath = new JsonPath(respon);
			String jsonResp = jsPath.get("").toString();
			String jsonResp1 = "Response body : " + "\n" +jsonResp;
		
			System.out.println(jsonResp1);
			
			
			//get status code
			int statusCode =response .getStatusCode(); 
			String stCode ="Status Code is :" + String.valueOf(statusCode);
			System.out.println(stCode);
			
			
			//get status line 
			
			String statusLine = response.getStatusLine();
			String statusLine1 = "StatusLine is : "+ statusLine;
			System.out.println(statusLine1);
			
			// verification 
			Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
			Assert.assertEquals(statusCode, 200);
			
			//header validation
			
			Headers allHeaders = response.headers();
			 
			 // Iterate over all the Headers
			 for(Header header : allHeaders)
			 {
			 System.out.println(header.getName() + " : " + header.getValue());
			 }
			 
			 String contentType = response.header("Content-Type");
			 Assert.assertEquals(contentType,"application/json; charset=UTF-8");
			 String connectionValue = response.header("Connection");
			 Assert.assertEquals(connectionValue,"keep-alive");
			 
			
}


}

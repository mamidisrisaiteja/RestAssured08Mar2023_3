package stepdefinition;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import net.serenitybdd.core.Serenity;
import utils.AuthTokenGeneration;

public class StepDefinition {
	
	AuthTokenGeneration authTokenObj=new AuthTokenGeneration();
	Response res;
	RequestSpecification resq;
	
	
	@Given("I have a auth token")
	public void i_have_a_auth_token() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 String authTokenLocal=authTokenObj.authTokenGeneration();
		 Serenity.setSessionVariable("authTokenGlobal").to(authTokenLocal);
	}

	@When("I Submit an order for books using POST call")
	public void i_submit_an_order_for_books_using_post_call() throws Exception, IOException, ParseException {
		String token=Serenity.sessionVariableCalled("authTokenGlobal");
		RestAssured.baseURI="https://simple-books-api.glitch.me";
        JSONParser parser = new JSONParser();// in json parser class we have parse method
        //JSON parsing is the process of converting a JSON object in text format to a Java or Javascript object that can be used inside a program. 
        //In Javascript, the standard way to do this is by using the method JSON.parse()

            
            Object obj = parser.parse(new FileReader("C:\\Users\\mamid\\eclipse-workspace\\RestAssured08Mar2023\\src\\test\\java\\payloadJson\\submitOrder.json"));
            // the payload defined in the file is a json object and .parse method is converting to java object
            // you are assigin to the java pbject to reference obj of type Object

            JSONObject jsonObject =  (JSONObject) obj;// here again type casting java object to json object
	    // Write code here that turns the phrase above into concrete actions
            
            String strobj=jsonObject.toString();
            System.out.println("the token value is "+ token);
            
            resq=RestAssured.given();
            res=resq
            		.headers("Authorization",token)
            		.headers("Content-Type","application/json")
            		.body(strobj)
            		.post("/orders");
            res.prettyPrint();
            Serenity.setSessionVariable("resGlobal").to(res);  //here the response is storde in resglobal variable
	   
	}
	 
	@Then("I veirfy the response to be {int}")
	public void i_veirfy_the_response_to_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		
		int expectedStatus=int1;// intitializing the method parameter(int 1 passed from the scripts) to a local variable
	   Response response=Serenity.sessionVariableCalled("resGlobal");
	   int actualStatus=response.getStatusCode();
	   System.out.println("the status code in from the response is "+actualStatus );
	   Assert.assertEquals(expectedStatus, actualStatus);
	   
	}
	
////	@And("I verify the response body")
////		public void i_veirfy_the_response_body() {
////		    // Write code here that turns the phrase above into concrete actions
////		//created==true
//		}
	
//
//	@Given("I get the order generated using GET call")
//	public void i_get_the_order_generated_using_get_call() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}

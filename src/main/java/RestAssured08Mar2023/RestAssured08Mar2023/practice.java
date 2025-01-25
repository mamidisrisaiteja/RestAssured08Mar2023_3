package RestAssured08Mar2023.RestAssured08Mar2023;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.cucumber.java.en.When;

import net.serenitybdd.core.Serenity;

public class practice {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		
	        JSONParser parser = new JSONParser();// in json parser class we have parse method
	        //JSON parsing is the process of converting a JSON object in text format to a Java or Javascript object that can be used inside a program. 
	        //In Javascript, the standard way to do this is by using the method JSON.parse()

	            
	            Object obj = parser.parse(new FileReader("C:\\Users\\mamid\\eclipse-workspace\\RestAssured08Mar2023\\src\\main\\java\\RestAssured08Mar2023\\RestAssured08Mar2023\\practice.json"));
	            // the payload defined in the file is a json object and .parse method is converting to java object
	            // you are assigin to the java pbject to reference obj of type Object

	            JSONObject jsonObject =  (JSONObject) obj;// here again type casting java object to json object
		    // Write code here that turns the phrase above into concrete actions
	            
	            String strobj=jsonObject.toString();
	            System.out.println("the token value is "+ strobj);
	            
	             //here the response is storde in resglobal variable
		   
		}
	}



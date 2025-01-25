package RestAssured08Mar2023.RestAssured08Mar2023;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.jayway.jsonpath.JsonPath;

public class pra {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException  {
//		{
//			// TODO Auto-generated method stub
//			String user;
//			try {
//		//		user = JsonPath.read("C:\\Users\\mamid\\eclipse-workspace\\RestAssured08Mar2023\\src\\main\\java\\RestAssured08Mar2023\\RestAssured08Mar2023\\practice.json");
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			 System.out.println(user);
////		ObjectMapper objectMapper = new ObjectMapper();
////		
////		FileReader reader = new FileReader("C:\\\\Users\\\\mamid\\\\eclipse-workspace\\\\RestAssured08Mar2023\\\\src\\\\main\\\\java\\\\RestAssured08Mar2023\\\\RestAssured08Mar2023\\\\practice.json");
////		 JsonElement jsonElement = JsonParser.(reader);
////	JSONParser parser = new JSONParser();// in json parser class we have parse method
////    //JSON parsing is the process of converting a JSON object in text format to a Java or Javascript object that can be used inside a program. 
////    //In Javascript, the standard way to do this is by using the method JSON.parse()
////
////        
////        Object obj = parser.parse(new FileReader("C:\\Users\\mamid\\eclipse-workspace\\RestAssured08Mar2023\\src\\main\\java\\RestAssured08Mar2023\\RestAssured08Mar2023\\practice.json"));
////        // the payload defined in the file is a json object and .parse method is converting to java object
////        // you are assigin to the java pbject to reference obj of type Object
////
////        JSONObject jsonObject =  (JSONObject) obj;// here again type casting java object to json object
////    // Write code here that turns the phrase above into concrete actions
////        
////		JsonNode rootNode = objectMapper.readTree(new File("C:\\\\Users\\\\mamid\\\\eclipse-workspace\\\\RestAssured08Mar2023\\\\src\\\\main\\\\java\\\\RestAssured08Mar2023\\\\RestAssured08Mar2023\\\\practice.json"));
////       // String strobj=jsonObject.toString();
////		int id = rootNode.path("user").path("id").asInt();
////		String streetName=rootNode.path("user").path("address").path("street").asText();
////		int orderid=rootNode.path("user").path("orders[2]").path("orderId").asInt();
//			//System.out.println(orderid);
//		}
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
	}
}

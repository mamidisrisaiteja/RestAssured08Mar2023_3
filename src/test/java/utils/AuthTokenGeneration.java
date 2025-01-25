package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.AuthorizationGenerattionRequestDTO;

public class AuthTokenGeneration {
	ConfigFileReading config=new ConfigFileReading();
	AuthorizationGenerattionRequestDTO authGenObj=new AuthorizationGenerattionRequestDTO();
	RandomNumberGeneratorProj randGeneration=new RandomNumberGeneratorProj();
	
	Response response;
	RequestSpecification resq;
	
	public String AUTH_TOKEN_URL="/api-clients/";
	
	public String authTokenGeneration() throws Exception {
		
//		RestAssured.baseURI=config.configFileReading(); 
		RestAssured.baseURI="https://simple-books-api.glitch.me";// we have taken base path from mehtod defined in utils package
		System.out.println(config.configFileReading());
		//Auth Request Body building using Pojo
		String clientEmail="Postman"+randGeneration.randomEmailGenerator()+"@example.com";
		String clientName="valentin"+randGeneration.randomNameGenerator();
		
		System.out.println(clientEmail);
		
		System.out.println(clientName);
		authGenObj.setClientEmail(clientEmail);
		authGenObj.setClientName(clientName);
		ObjectMapper objectMapper = new ObjectMapper(); // it is used in the process of convertign java object to json string
		  String authGenJsonObj = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(authGenObj);  // it is possible by converting java object to json objetc and to jason string
		
		  
		  System.out.println(authGenJsonObj);
		  resq=RestAssured.given();
		response=resq
				.headers("Content-Type","application/json")
				.body(authGenJsonObj)
				.post(AUTH_TOKEN_URL);
		
		response.prettyPrint();
		String accessToken=response.getBody().jsonPath().get("accessToken");
		
		
		return accessToken;
		
	}

}

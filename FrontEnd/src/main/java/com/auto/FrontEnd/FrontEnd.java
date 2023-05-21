package com.auto.FrontEnd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontEnd {

	public FrontEnd() {
		
	}
		 @Value("${backEndURL}")
		 String backEndURL;

		 //@GetMapping("/")
		 @RequestMapping(path = "/", method = RequestMethod.GET)
		 public String autovente(){
			 try{
		         RestTemplate restTemplate = new RestTemplate();
		         String s = restTemplate.getForObject(backEndURL, String.class);
		         ResponseEntity<String> response = restTemplate.getForEntity(backEndURL, String.class);
		         if (response.getStatusCode() == HttpStatus.OK) {
		             return response.getBody() + s;
		         } else {
		             return "Error occurred while fetching data from backend service";
		         }
		         //return "hello (from the front end)" + " " + s + " (from the back end)";
		      
			 }catch (Exception e){
		     
				 return e.getLocalizedMessage();
		        }
		    	}

}

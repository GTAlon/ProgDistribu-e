package com.auto.FrontEnd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

public class FrontEnd {

	public FrontEnd() {
		
	}
		 @Value("${backEndURL}")
		 String backEndURL;

		 @RequestMapping(path = "/", method = RequestMethod.GET)
		 public String autovente(){
			 try{
		         RestTemplate restTemplate = new RestTemplate();
		         String s = restTemplate.getForObject(backEndURL, String.class);
		         return "hello (from the front end)" + " " + s + " (from the back end)";
		      
			 }catch (Exception e){
		     
				 return e.getLocalizedMessage();
		        }
		    	}

}

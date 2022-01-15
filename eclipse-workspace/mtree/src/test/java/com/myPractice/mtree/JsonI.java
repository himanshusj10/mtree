package com.myPractice.mtree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonI {
	
	public String demo() throws IOException, ParseException {
		JSONParser jp = new JSONParser();
		FileReader reader = new FileReader(".//JSONFiles//OR.json");
		//JSONObject obj = (JSONObject) jp.parse(reader);
		Object obj = jp.parse(reader);
		JSONObject job = (JSONObject)obj;
		String name = (String)job.get("name");
		
		
		return name;
		
	}
	
	public String dem() throws IOException, ParseException {
		JSONParser jp = new JSONParser();
		FileReader reader=new FileReader(".//JSONFiles//OR.json");
		Object obj = jp.parse(reader);
		JSONObject jo = (JSONObject) obj;
		String res1 =(String) jo.get("week");
		return res1;
	}

}

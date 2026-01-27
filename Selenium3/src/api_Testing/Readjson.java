package api_Testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Readjson {
	public static void main(String[] args) throws IOException {

		byte[]bytearr=Files.readAllBytes(Paths.get("C:\\Users\\hp\\Desktop\\text.json"));
		String strjison	=new String(bytearr);
		//System.out.println(strjison);

		JSONObject rootjson	=new JSONObject(strjison);
		String typevalue=rootjson.getString("type");
		System.out.println(typevalue);
		int starvalue=rootjson.getInt("star_value");
		System.out.println(starvalue);
		int leadScore=rootjson.getInt("lead_score");
		System.out.println(leadScore);
		JSONArray tags	=rootjson.getJSONArray("tags");
		System.out.println(tags);
	
		JSONArray jsonpropertiesArray=rootjson.getJSONArray("properties");
		JSONArray arr = new JSONArray();
		arr.put(jsonpropertiesArray.getJSONObject(0));
		arr.put(jsonpropertiesArray.getJSONObject(1));
		arr.put(jsonpropertiesArray.getJSONObject(2));
		arr.put(jsonpropertiesArray.getJSONObject(3));
		arr.put(jsonpropertiesArray.getJSONObject(4));
		arr.put(jsonpropertiesArray.getJSONObject(5));

		System.out.println(arr);

	}
}

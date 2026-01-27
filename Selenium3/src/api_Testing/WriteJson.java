package api_Testing;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class WriteJson {

	public static void main(String[] args) throws IOException {

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("id", "5629585249009664");
		jsonObj.put("type", "PERSON");
		jsonObj.put("created_time", "1469170109");
		jsonObj.put("updated_time", "1469764466");
		jsonObj.put("last_contacted", 0);
		jsonObj.put("last_emailed", 0);
		jsonObj.put("last_campaign_emaild", 0);
		jsonObj.put("last_called", 0);
		jsonObj.put("viewed_time", 0);

		JSONObject viewedObj = new JSONObject();
		viewedObj.put("viewed_time", 1469764498855L);
		viewedObj.put("viewer_id", 6263975862861824L);
		jsonObj.put("viewed", viewedObj);

		jsonObj.put("star_value", "4");
		jsonObj.put("lead_score", "5");
		jsonObj.put("tags", "[]");

		JSONArray arr  = new JSONArray();
		JSONObject	arrobj=new JSONObject();
		arrobj.put("tag", "dummyTestTag");
		arrobj.put("createdTime", "1469510469602");
		arrobj.put("availableCount", "0");
		arrobj.put("entity_type", "tag");
		arr.put(arrobj);
		jsonObj.put("tagsWithTime", arr);
		System.out.println(jsonObj.toString(10));
		
	}

}

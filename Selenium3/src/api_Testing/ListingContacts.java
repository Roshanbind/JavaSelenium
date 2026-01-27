package api_Testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class ListingContacts {

	public static void main(String[] args) throws IOException {
		byte[]bytearr=Files.readAllBytes(Paths.get("C:\\Users\\hp\\Desktop\\ListingContacts.json"));
		String strjison	=new String(bytearr);
		//System.out.println(strjison);
		JSONArray jsonArr = new JSONArray(strjison);

		JSONObject obj = jsonArr.getJSONObject(0);
		int id = obj.getInt("id");
		System.out.println(id);
		String	strobj=obj.getString("type");
		System.out.println(strobj);
		Number createdtime=obj.getNumber("created_time");
		System.out.println(createdtime);
		Number updatedtime=obj.getNumber("updated_time");
		System.out.println(updatedtime);
		Number star_value=obj.getNumber("star_value");
		System.out.println(star_value);
		Number lead_score=obj.getNumber("lead_score");
		System.out.println(lead_score);
		JSONArray	arrobj=obj.getJSONArray("tags");
		System.out.println(arrobj);
		String firstTag = arrobj.getString(0);
		System.out.println(firstTag);
		String secondTag = arrobj.getString(1);
		System.out.println(secondTag);
		
		JSONArray	tagsWithTime=obj.getJSONArray("tagsWithTime");
		//System.out.println(tagsWithTime);
		JSONObject tagsWithTime_obj2=tagsWithTime.getJSONObject(0);
		System.out.println(tagsWithTime_obj2);
		String	tag1=tagsWithTime_obj2.getString("tag");
		System.out.println(tag1);


		System.out.println("------------------------------------------");
		JSONObject obj1 = jsonArr.getJSONObject(1);
		String	str=obj1.getString("cursor");
		System.out.println(str);
		Number	id1=obj1.getNumber("id");
		System.out.println(id1);
		String	type1=obj1.getString("type");
		System.out.println(type1);
		Number	created_time_1=obj1.getNumber("created_time");
		System.out.println(created_time_1);
		Number	star_value1=obj1.getNumber("star_value");
		System.out.println(star_value1);
		Number	lead_score_1=obj1.getNumber("lead_score");
		System.out.println(lead_score_1);
		JSONArray	tags1=obj1.getJSONArray("tags");
		System.out.println(tags1);
		JSONArray	tagsWithTime_1=obj1.getJSONArray("tagsWithTime");
		//System.out.println(tagsWithTime_1);
		JSONObject tagsWithTime_obj1=tagsWithTime_1.getJSONObject(0);
		System.out.println(tagsWithTime_obj1);
		String	tag=tagsWithTime_obj1.getString("tag");
		System.out.println(tag);

		System.out.println("-------------------------------------");
		JSONArray	properties=obj1.getJSONArray("properties");
		//System.out.println(properties);
		JSONObject	obj2=properties.getJSONObject(0);
		System.out.println(obj2);
		String	type=obj2.getString("type");
		System.out.println(type);
		JSONObject	obj3=properties.getJSONObject(1);
		System.out.println(obj3);
		
		JSONObject	obj4=properties.getJSONObject(5);
	//	System.out.println(obj4);
		String value1 = obj4.getString("value");
		//System.out.println(value1);
		
	}

}

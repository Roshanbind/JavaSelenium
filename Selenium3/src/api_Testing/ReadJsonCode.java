package api_Testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJsonCode {

	public static void main(String[] args) throws IOException {

		byte[]bytearr=Files.readAllBytes(Paths.get("C:\\Users\\hp\\Desktop\\text.json"));
		String strjison	=new String(bytearr);
		//System.out.println(strjison);

		JSONObject rootjson	=new JSONObject(strjison);
		String typevalue=rootjson.getString("type");
		System.out.println("type name is==="+typevalue);
		int starvalue=rootjson.getInt("star_value");
		System.out.println("star value is==="+starvalue);
		int leadScore=rootjson.getInt("lead_score");
		System.out.println("lead_score value is==="+leadScore);
		JSONArray tags	=rootjson.getJSONArray("tags");
		System.out.println("tags value is-==="+tags);
		JSONArray jsonpropertiesArray=rootjson.getJSONArray("properties");
		for(int i=0;i<3;i++) {
			JSONObject	propertiesobj=jsonpropertiesArray.getJSONObject(i);

			String	arrayObject=propertiesobj.getString("name");
			System.out.println(arrayObject);
			String	arrayObject1=propertiesobj.getString("type");
			System.out.println(arrayObject1);
			String	arrayObject2=propertiesobj.getString("value");
			System.out.println(arrayObject2);
		}
		for(int j=4;j<7;j++) {
			JSONObject	propertiesobj=jsonpropertiesArray.getJSONObject(j);
			String	arrayObject=propertiesobj.getString("name");
			System.out.println(arrayObject);
			String	arrayObject1=propertiesobj.getString("value");
			System.out.println(arrayObject1);
			String	arrayObject2=propertiesobj.getString("subtype");
			System.out.println(arrayObject2);
			
		}







	}

}

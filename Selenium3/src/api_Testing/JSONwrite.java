package api_Testing;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONwrite {
	public static void main(String[] args) {

		JSONObject jsroot = new JSONObject();
		jsroot.put("type", "COMPANY");
		jsroot.put("star_value", "4");
		jsroot.put("lead_score", "20");

		JSONArray tagrr = new JSONArray();
		tagrr.put("read");
		tagrr.put("school");
		tagrr.put("time");
		jsroot.put("tags", tagrr); 
		
		//System.out.println(jsroot.toString(4)); 
		JSONArray propert1 = new JSONArray();
		JSONObject arrobject = new JSONObject();
		arrobject.put("name", "Company Type");
		arrobject.put("type", "CUSTOM");
		arrobject.put("value", "MNC Inc");
		propert1.put(arrobject);
	
		JSONObject arrobject1 = new JSONObject();
		arrobject1.put("type", "SYSTEM");
		arrobject1.put("name", "url");
		arrobject1.put("value", "http://www.spicejet.com/");
		propert1.put(arrobject1);
		

		JSONObject arrobject2 = new JSONObject();
		arrobject2.put("type", "SYSTEM");
		arrobject2.put("name", "name");
		arrobject2.put("value", "Spicejet");
		propert1.put(arrobject2);
		
		JSONObject arrobject3 = new JSONObject();
		arrobject3.put("type", "email");
		arrobject3.put("value", "care@spicejet.com");
		arrobject3.put("subtype","");
		propert1.put(arrobject3);
		
		JSONObject arrobject4 = new JSONObject();
		arrobject4.put("name", "phone");
		arrobject4.put("value", "45500000");
		arrobject4.put("subtype","");
		propert1.put(arrobject4);
		
		JSONObject arrobject5 = new JSONObject();
		arrobject5.put("name", "website");
		arrobject5.put("value", "http://www.linkedin.com/company/agile-crm");
		arrobject5.put("subtype","LINKEDIN");
		propert1.put(arrobject5);
		
		JSONObject arrobject6 = new JSONObject();
		arrobject6.put("name", "address");
		arrobject6.put("value", "{\"address\":\"MS 35, 440 N Wolfe Road\",\"city\":\"Sunnyvale\",\"state\":\"CA\",\"zip\":\"94085\",\"country\":\"US\"}");
		arrobject6.put("subtype","office");
		propert1.put(arrobject6);
		jsroot.put("properties", propert1);
		System.out.println(jsroot.toString(4)); 
		

	}
}



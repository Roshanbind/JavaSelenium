package agilecrm_apiAutomation;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Work {

	public static void main(String[] args) {



		String FirstName=RandomStringUtils.randomAlphabetic(6);
		String LastName=RandomStringUtils.randomAlphabetic(6);
		String Email=RandomStringUtils.randomAlphabetic(6);


		String createContact="{\r\n"
				+ "    \"star_value\": \"4\",\r\n"
				+ "    \"lead_score\": \"92\",\r\n"
				+ "    \"tags\": [\r\n"
				+ "        \"Lead\",\r\n"
				+ "        \"Likely Buyer\"\r\n"
				+ "    ],\r\n"
				+ "    \"properties\": [\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"first_name\",\r\n"
				+ "            \"value\": \""+FirstName+"\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"last_name\",\r\n"
				+ "            \"value\": \""+LastName+"\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"email\",\r\n"
				+ "            \"subtype\": \"work\",\r\n"
				+ "            \"value\": \""+Email+"\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"address\",\r\n"
				+ "            \"value\": \"{\\\"address\\\":\\\"225 George Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"phone\",\r\n"
				+ "            \"value\": \"8888888889\",\r\n"
				+ "            \"subtype\": \"work\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"phone\",\r\n"
				+ "            \"value\": \"8888888889\",\r\n"
				+ "            \"subtype\": \"home\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"website\",\r\n"
				+ "            \"value\": \"www.youtube.com\",\r\n"
				+ "            \"subtype\": \"YOUTUBE\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"website\",\r\n"
				+ "            \"value\": \"www.linkedin.com\",\r\n"
				+ "            \"subtype\": \"LINKEDIN\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"website\",\r\n"
				+ "            \"value\": \"www.mywebsite.com\",\r\n"
				+ "            \"subtype\": \"URL\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type text\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": \"My name is ghanshyam\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type date\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": 1479580200\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type checkbox\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": \"on\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type list\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": \"lemon\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"My custom field of type companies\",\r\n"
				+ "            \"type\": \"CUSTOM\",\r\n"
				+ "            \"value\": \"[\\\"5767466600890368\\\",\\\"5114076984246272\\\",\\\"5746725247516672\\\"]\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";


		Response Create_contact=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
				.accept("application/json").contentType("application/json").body(createContact).post("https://roshanmodh.agilecrm.com/dev/api/contacts");
		String CreateContact=Create_contact.getBody().asPrettyString();
		int	statuscode=Create_contact.statusCode();
		System.out.println(statuscode);
		//System.out.println(CreateContact);

		JSONObject	rootjsonObj=new JSONObject(CreateContact);
		JSONArray	JsonpropArray=rootjsonObj.getJSONArray("properties");
		JSONObject firstobj=JsonpropArray.getJSONObject(0);
		String	name=firstobj.getString("value");
		if(name.equalsIgnoreCase(FirstName)) {
		System.out.println("passed: first name is matching-actual---"+name+", expected-"+FirstName);
		}else {
			System.out.println("Failed: first name is not matching-actual---"+name+", expected-"+FirstName);
		}
		
		JSONObject jsonObjSecond=JsonpropArray.getJSONObject(1);
		String	lastname=jsonObjSecond.getString("value");
		if(lastname.equalsIgnoreCase(LastName)) {
			System.out.println("passed: last name is matching-actual----"+lastname+", expected-"+LastName);
			}else {
				System.out.println("Failed: last name is not matching-actual----"+lastname+", expected-"+LastName);
			}

	}

}

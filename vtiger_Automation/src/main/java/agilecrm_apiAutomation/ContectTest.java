package agilecrm_apiAutomation;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ContectTest {

	public static void main(String[] args) {
		RequestSpecification rs=RestAssured.given();
		Response resp=rs.auth().basic("ros@agilecrm.com", "ros@123").accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/contacts/6283195278098432");
		String resJson=resp.getBody().asPrettyString();
		//System.out.println(resJson);
		int	statuscode=resp.getStatusCode();
		JSONObject	jsonobj=new JSONObject(resJson);
		System.out.println(statuscode);
		Number id=jsonobj.getNumber("id");
		//System.out.println(id);


		String createContectjson="{\r\n"
				+ "    \"star_value\": \"5\",\r\n"
				+ "    \"lead_score\": \"93\",\r\n"
				+ "    \"tags\": [\r\n"
				+ "        \"Lead\",\r\n"
				+ "        \"Likely Buyer\"\r\n"
				+ "    ],\r\n"
				+ "    \"properties\": [\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"first_name\",\r\n"
				+ "            \"value\": \"Ramesh\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"last_name\",\r\n"
				+ "            \"value\": \"singh\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"email\",\r\n"
				+ "            \"subtype\": \"work\",\r\n"
				+ "            \"value\": \"rameshkk@walt.ltd\"\r\n"
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
		Response createcontect=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
				.contentType("application/json").accept("application/json").body(createContectjson).post("https://roshanmodh.agilecrm.com/dev/api/contacts");
		System.out.println(statuscode);
		String	contactResponsjson=createcontect.getBody().asPrettyString();
		System.out.println(contactResponsjson);
	}

}

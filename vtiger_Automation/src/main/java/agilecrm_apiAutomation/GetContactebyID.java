package agilecrm_apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetContactebyID {

	public static void main(String[] args) {
		Response getcontectbyId=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
				.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/contacts/6283195278098432");
		int	statuscode=getcontectbyId.getStatusCode();
		System.out.println(statuscode);
		String	getResponsbyId=getcontectbyId.getBody().asPrettyString();
		//System.out.println(getResponsbyId);
		
		
		String updateContacte="{\r\n"
				+ "    \"id\": \"5676477903273984\",\r\n"
				+ "    \"properties\": [\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"first_name\",\r\n"
				+ "            \"value\": \"Vikash\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"last_name\",\r\n"
				+ "            \"value\": \"kumar\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"email\",\r\n"
				+ "            \"subtype\": \"work\",\r\n"
				+ "            \"value\": \"vikashh@walt.ltd\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"SYSTEM\",\r\n"
				+ "            \"name\": \"address\",\r\n"
				+ "            \"value\": \"{\\\"address\\\":\\\"225 George Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		Response UpdateContactebyId=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
				.accept("application/json").body(updateContacte).put("https://roshanmodh.agilecrm.com/dev/api/contacts/5073269292007424,");
		String	updateContactbyId=getcontectbyId.getBody().asPrettyString();
		System.out.println(updateContactbyId);
		int	updatestatuscode=UpdateContactebyId.getStatusCode();
		System.out.println(updatestatuscode);
		System.out.println();
		
	}

}

package agilecrm_apiAutomation;
import io.restassured.RestAssured;

import io.restassured.response.Response;

public class AllApiTesting {

	public static void main(String[] args) {
//		Response AllContact=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/contacts");
//		int	statuscode=AllContact.getStatusCode();
//		System.out.println(statuscode);
//		String	GetAllContect=AllContact.getBody().asPrettyString();
//		//System.out.println(GetAllContect);
//
//
//		// Get Contact by ID
//
//		Response GetContactbyID=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/contacts/4557551825518592");
//		int	statusCode=GetContactbyID.getStatusCode();
//		System.out.println(statusCode);
//		String	getContact=GetContactbyID.getBody().asPrettyString();
//		//System.out.println(getContact);
//
//		// Creating a Contact
//		String CreatingContactt="{\r\n"
//				+ "    \"star_value\": \"4\",\r\n"
//				+ "    \"lead_score\": \"92\",\r\n"
//				+ "    \"tags\": [\r\n"
//				+ "        \"Lead\",\r\n"
//				+ "        \"Likely Buyer\"\r\n"
//				+ "    ],\r\n"
//				+ "    \"properties\": [\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"first_name\",\r\n"
//				+ "            \"value\": \"Sohan\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"last_name\",\r\n"
//				+ "            \"value\": \"kumar\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"email\",\r\n"
//				+ "            \"subtype\": \"work\",\r\n"
//				+ "            \"value\": \"sohan@walt.ltd\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"address\",\r\n"
//				+ "            \"value\": \"{\\\"address\\\":\\\"225 George Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"phone\",\r\n"
//				+ "            \"value\": \"8888888889\",\r\n"
//				+ "            \"subtype\": \"work\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"phone\",\r\n"
//				+ "            \"value\": \"8888888889\",\r\n"
//				+ "            \"subtype\": \"home\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"website\",\r\n"
//				+ "            \"value\": \"www.youtube.com\",\r\n"
//				+ "            \"subtype\": \"YOUTUBE\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"website\",\r\n"
//				+ "            \"value\": \"www.linkedin.com\",\r\n"
//				+ "            \"subtype\": \"LINKEDIN\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"website\",\r\n"
//				+ "            \"value\": \"www.mywebsite.com\",\r\n"
//				+ "            \"subtype\": \"URL\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"My custom field of type text\",\r\n"
//				+ "            \"type\": \"CUSTOM\",\r\n"
//				+ "            \"value\": \"My name is ghanshyam\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"My custom field of type date\",\r\n"
//				+ "            \"type\": \"CUSTOM\",\r\n"
//				+ "            \"value\": 1479580200\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"My custom field of type checkbox\",\r\n"
//				+ "            \"type\": \"CUSTOM\",\r\n"
//				+ "            \"value\": \"on\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"My custom field of type list\",\r\n"
//				+ "            \"type\": \"CUSTOM\",\r\n"
//				+ "            \"value\": \"lemon\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"name\": \"My custom field of type companies\",\r\n"
//				+ "            \"type\": \"CUSTOM\",\r\n"
//				+ "            \"value\": \"[\\\"5767466600890368\\\",\\\"5114076984246272\\\",\\\"5746725247516672\\\"]\"\r\n"
//				+ "        }\r\n"
//				+ "    ]\r\n"
//				+ "}";
//
//		Response CreatingContact=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/json").accept("application/json").body(CreatingContactt).post("https://roshanmodh.agilecrm.com/dev/api/contacts");
//		int	StatusCode=CreatingContact.getStatusCode();
//		System.out.println(StatusCode);
//		String	creatingContact=CreatingContact.getBody().asPrettyString();
//		//	System.out.println(creatingContact);
//
//		// Update properties of a contact by ID
//
//		String UpdateContactbyid="{\r\n"
//				+ "    \"id\": \"5941662649614336\",\r\n"
//				+ "    \"properties\": [\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"first_name\",\r\n"
//				+ "            \"value\": \"Mohan\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"last_name\",\r\n"
//				+ "            \"value\": \"bind\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"email\",\r\n"
//				+ "            \"subtype\": \"work\",\r\n"
//				+ "            \"value\": \"mohan@walt.ltd\"\r\n"
//				+ "        },\r\n"
//				+ "        {\r\n"
//				+ "            \"type\": \"SYSTEM\",\r\n"
//				+ "            \"name\": \"address\",\r\n"
//				+ "            \"value\": \"{\\\"address\\\":\\\"225 George Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
//				+ "        }\r\n"
//				+ "    ]\r\n"
//				+ "}";
//
//		Response UpdateContactbyID=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/json").accept("application/json").body(UpdateContactbyid).put("https://roshanmodh.agilecrm.com/dev/api/contacts");
//		int	StatusCode2=UpdateContactbyID.getStatusCode();
//		System.out.println(StatusCode2);
//		String	UpdatecontactbyID=UpdateContactbyID.getBody().asPrettyString();
//		//System.out.println(UpdatecontactbyID);
//
//		//	Updatelead_scorebyID
//
//		String Update_lead_scorebyid="{\r\n"
//				+ "    \"id\": \"5941662649614336\",\r\n"
//				+ "    \"lead_score\": 20\r\n"
//				+ "}";
//
//		Response Updatelead_scorebyID=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/json").accept("application/json").body(Update_lead_scorebyid).put("https://roshanmodh.agilecrm.com/dev/api/contacts/edit/lead-score");
//		int	StatusCode3=Updatelead_scorebyID.getStatusCode();
//		System.out.println(StatusCode3);
//		String	Updatelead_scorebyid=Updatelead_scorebyID.getBody().asPrettyString();
//		//System.out.println(Updatelead_scorebyid);
//
//		//Update Star Value by ID
//
//		String UpdateStarValueby_Id="{\r\n"
//				+ "    \"id\": \"4557551825518592\",\r\n"
//				+ "    \"star_value\": 2\r\n"
//				+ "}";
//		Response UpdateStarValuebyid=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123").contentType("application/json")
//				.accept("application/json").body(UpdateStarValueby_Id).post("https://roshanmodh.agilecrm.com/###dev/api/contacts/edit/add-star");
//		String str=UpdateStarValuebyid.getBody().asPrettyString();
//		System.out.println(str);
//		int	StatusCode4=UpdateStarValuebyid.getStatusCode();
//		System.out.println(StatusCode4);
//		String	UpdateStarValuebyId=UpdateStarValuebyid.getBody().asPrettyString();
//		//		System.out.println(UpdateStarValuebyId);
//
//
//		//Update tags value by ID
//
//		String UpdateTagsby_ID="{\r\n"
//				+ "    \"id\": \"5941662649614336\",\r\n"
//				+ "    \"tags\": [\r\n"
//				+ "        \"mohan\",\r\n"
//				+ "        \"school\"\r\n"
//				+ "    ]\r\n"
//				+ "}"
//				+ "";
//
//		Response UpdateTagsbyID=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/json").accept("application/json").body(UpdateTagsby_ID).put("https://roshanmodh.agilecrm.com/dev/api/contacts/edit/tags");
//		int	StatusCode5=UpdateTagsbyID.getStatusCode();
//		System.out.println(StatusCode5);
//		String	UpdateTagsbyiD=UpdateTagsbyID.getBody().asPrettyString();
//		//System.out.println(UpdateTagsbyiD);
//
//
//		//Delete tags value by ID
//
//		String Deletetagsby_Id="{\r\n"
//				+ "    \"id\": \"5941662649614336\",\r\n"
//				+ "    \"tags\": [\r\n"
//				+ "        \"mohan\",\r\n"
//				+ "        \"test2\"\r\n"
//				+ "    ]\r\n"
//				+ "}"
//				+ "";
//
//		Response DeletetagsbyID=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/json").accept("application/json").body(Deletetagsby_Id).put("https://roshanmodh.agilecrm.com/dev/api/contacts/delete/tags");
//		int	StatusCode6=DeletetagsbyID.getStatusCode();
//		System.out.println(StatusCode6);
//		String	DeletetagsbyiD=DeletetagsbyID.getBody().asPrettyString();
//		//System.out.println(DeletetagsbyiD);
//
//		//6706585923158016	
//		// Delete single contact
//
//		Response DeleteSingleContact=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.accept("application/json").delete("https://roshanmodh.agilecrm.com/dev/api/contacts/6706585923158016");
//		int	StatusCode7=DeleteSingleContact.getStatusCode();
//		System.out.println(StatusCode7);
//		String	DeleteSingleContactt=DeleteSingleContact.getBody().asPrettyString();
//		//System.out.println(DeleteSingleContactt);
//
//		//Search contact by email
//
//		Response SearchContactbyEmail=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/contacts/search/email/rameshkk@walt.ltd");
//		int	StatusCode8=SearchContactbyEmail.getStatusCode();
//		System.out.println(StatusCode8);
//		String	SearchContactby_Email=SearchContactbyEmail.getBody().asPrettyString();
//		//System.out.println(SearchContactby_Email);
//
//		// Search contact by email
//		
//		String Email="email_ids=[\"rameshkk@walt.ltd\"]";
//
//		Response SearchContactbyemail=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/x-www-form-urlencoded").accept("application/json").body(Email).post("https://roshanmodh.agilecrm.com/dev/api/contacts/search/email");
//		int	StatusCode9=SearchContactbyemail.getStatusCode();
//		System.out.println(StatusCode9);
//		String	SearchContactby_email=SearchContactbyemail.getBody().asPrettyString();
//		//System.out.println(SearchContactby_email);
//
//		//Search contacts/companies
//		
//		String query = "ab";
//		int pageSize = 10;
//		Response SearchContactsCompanies=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/search?q=ab&page_size=200&type=\"COMPANY\"");
//		int	StatusCode10=SearchContactsCompanies.getStatusCode();
//		System.out.println(StatusCode10);
//		String responseBody = SearchContactsCompanies.getBody().asPrettyString();
//		System.out.println(responseBody);
//
//		//1.12 Adding tags to a contact based on email:
//
//		String email="email=rameshkk@walt.ltd&tags=[\"testingtesto\"]";
//		Response AddingTagsBy_email=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/x-www-form-urlencoded").accept("application/json").body(email).post("https://roshanmodh.agilecrm.com/dev/api/contacts/email/tags/add");
//		int	StatusCode11=AddingTagsBy_email.getStatusCode();
//		System.out.println(StatusCode11);
//		String AddingTagsBy_Email= AddingTagsBy_email.getBody().asPrettyString();
//		//System.out.println(AddingTagsBy_Email);
//
//
//		//Delete tags to a contact based on email:
//
//		String deleteTagsByEmail="email=rameshkk@walt.ltd&tags=[\"testingtesto\"]";
//		Response DeletetagsByEmail=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/x-www-form-urlencoded").accept("application/json").body(deleteTagsByEmail).post("https://roshanmodh.agilecrm.com/dev/api/contacts/email/tags/delete");
//		int	StatusCode12=DeletetagsByEmail.getStatusCode();
//		System.out.println(StatusCode12);
//		String DeletetagsBy_Email= DeletetagsByEmail.getBody().asPrettyString();
//		System.out.println(DeletetagsBy_Email);
//
//		//1.14 Add score to a contact using email ID
//
//		String addScorebyEmail="email=rameshkk@walt.ltd&score=100";
//		Response AddscoreEmailID=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/x-www-form-urlencoded").accept("application/json").body(addScorebyEmail).post("https://roshanmodh.agilecrm.com/dev/api/contacts/add-score");
//		int	StatusCode13=AddscoreEmailID.getStatusCode();
//		System.out.println(StatusCode13);
//		String AddscoreEmail_ID= AddscoreEmailID.getBody().asPrettyString();
//		//System.out.println(AddscoreEmail_ID);
//
//		//1.16 Updating contact properties by Email
//
//		String Updating_Propertiesby_Email="	{\r\n"
//				+ "	   \"type\": \"SYSTEM\",\r\n"
//				+ "	   \"name\": \"first_name\",\r\n"
//				+ "	   \"value\": \"EVA \"\r\n"
//				+ "   }";
//
//		Response UpdatingPropertiesbyEmail=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/json").body(Updating_Propertiesby_Email).post("https://roshanmodh.agilecrm.com/dev/api/contacts/add/property?email=kishan123@gmail.com");
//		int	StatusCode14=UpdatingPropertiesbyEmail.getStatusCode();
//		System.out.println(StatusCode14);
//		String UpdatingPropertiesby_Email= UpdatingPropertiesbyEmail.getBody().asPrettyString();
//		//System.out.println(UpdatingPropertiesby_Email);
//
//		//1.18 Add contact to a campaign
//
//		String Add_contact_Campaign="email=kishan123@gmail.com&workflow-id=374648289378263763";
//		Response AddcontactCampaign=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.contentType("application/x-www-form-urlencoded").accept("application/json").body(Add_contact_Campaign).post("https://roshanmodh.agilecrm.com/dev/api/campaigns/enroll/email");
//		int	StatusCode15=AddcontactCampaign.getStatusCode();
//		System.out.println(StatusCode15);
//		String Add_contactCampaign= AddcontactCampaign.getBody().asPrettyString();
//		System.out.println(Add_contactCampaign);
//
//		//1.19 Remove contact from a campaign
//
//		Response RemoveContact_campaign=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.accept("application/json").delete("https://roshanmodh.agilecrm.com/dev/api/workflows/remove-active-subscriber/374648289378263763/5128006227656704");
//		int	StatusCode16=RemoveContact_campaign.getStatusCode();
//		System.out.println(StatusCode16);
//		String RemoveContact_campaignn= RemoveContact_campaign.getBody().asPrettyString();
//		System.out.println(RemoveContact_campaignn);
//
//		//1.20 Get contact by phone number
//
//		Response Getby_phoneNumber=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//				.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/contacts/search/phonenumber/6355687746");
//		int	StatusCode17=Getby_phoneNumber.getStatusCode();
//		System.out.println(StatusCode17);
//		String Get_by_phoneNumber= Getby_phoneNumber.getBody().asPrettyString();
		//System.out.println(Get_by_phoneNumber);

System.out.println("-------------------------------  dynamic filter   --------------------------------");
		
//1.21 Getdynamic_filter


//String Get_dynamic_filter="page_size=25&global_sort_key=-created_time&filterJson={\"rules\":[{\"LHS\":\"tags\",\"CONDITION\":\"EQUALS\",\"RHS\":\"linkedin prospect\"}],\"contact_type\":\"PERSON\"}";
//String filterJson = "{"
//        + "\"rules\":[{"
//        + "\"LHS\":\"tags\","
//        + "\"CONDITION\":\"EQUALS\","
//        + "\"RHS\":\"linkedin prospect\""
//        + "}],"
//        + "\"contact_type\":\"PERSON\""
//        + "}";
//
//Response Getdynamic_filter=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//		.contentType("application/x-www-form-urlencoded").accept("application/json") .formParam("page_size", "25").formParam("global_sort_key", "-created_time").formParam("filterJson", filterJson).post("https://roshanmodh.agilecrm.com/dev/api/filters/filter/dynamic-filter");
//int	StatusCode1=Getdynamic_filter.getStatusCode();
//System.out.println(StatusCode1);
//String dynamic_filter= Getdynamic_filter.getBody().asPrettyString();
//System.out.println(dynamic_filter);
//
////2.1 Creating a company
//String Creating_company="{\r\n"
//		+ "    \"type\": \"COMPANY\",\r\n"
//		+ "    \"star_value\": 4,\r\n"
//		+ "    \"lead_score\": 120,\r\n"
//		+ "    \"tags\": [\r\n"
//		+ "        \"Permanent\",\r\n"
//		+ "        \"USA\",\r\n"
//		+ "        \"Hongkong\",\r\n"
//		+ "        \"Japan\"\r\n"
//		+ "    ],\r\n"
//		+ "    \"properties\": [\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"Company Type\",\r\n"
//		+ "            \"type\": \"CUSTOM\",\r\n"
//		+ "            \"value\": \"eva\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"type\": \"SYSTEM\",\r\n"
//		+ "            \"name\": \"name\",\r\n"
//		+ "            \"value\": \"kishan\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"type\": \"SYSTEM\",\r\n"
//		+ "            \"name\": \"url\",\r\n"
//		+ "            \"value\": \"http://www.spicejet.com/\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"email\",\r\n"
//		+ "            \"value\": \"kishan@spicejet.com\",\r\n"
//		+ "            \"subtype\": \"\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"phone\",\r\n"
//		+ "            \"value\": \"45500000\",\r\n"
//		+ "            \"subtype\": \"\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"website\",\r\n"
//		+ "            \"value\": \"http://www.linkedin.com/company/agile-crm\",\r\n"
//		+ "            \"subtype\": \"LINKEDIN\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"address\",\r\n"
//		+ "            \"value\": \"{\\\"address\\\":\\\"MS 35, 440 N Wolfe Road\\\",\\\"city\\\":\\\"Sunnyvale\\\",\\\"state\\\":\\\"CA\\\",\\\"zip\\\":\\\"94085\\\",\\\"country\\\":\\\"US\\\"}\",\r\n"
//		+ "            \"subtype\": \"office\"\r\n"
//		+ "        }\r\n"
//		+ "    ]\r\n"
//		+ "}";
//Response CreatingCompany=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//.contentType("application/json").accept("application/json").body(Creating_company).post("https://roshanmodh.agilecrm.com/dev/api/contacts");
//int	StatusCode2=CreatingCompany.getStatusCode();
//System.out.println(StatusCode2);
//String Creating_Company= CreatingCompany.getBody().asPrettyString();
////System.out.println(Creating_Company);
//
////2.2 Updating a company
//
//String Updating_company="{\r\n"
//		+ "    \"id\":5795129438437376,\r\n"
//		+ "    \"properties\": [\r\n"
//		+ "        {\r\n"
//		+ "            \"type\": \"SYSTEM\",\r\n"
//		+ "            \"name\": \"name\",\r\n"
//		+ "            \"value\": \"rss\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"type\": \"SYSTEM\",\r\n"
//		+ "            \"name\": \"url\",\r\n"
//		+ "            \"value\": \"http://www.spicejet.com/\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"email\",\r\n"
//		+ "            \"value\": \"rss@spicejet.com\",\r\n"
//		+ "            \"subtype\": \"\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"phone\",\r\n"
//		+ "            \"value\": \"45500000\",\r\n"
//		+ "            \"subtype\": \"\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"website\",\r\n"
//		+ "            \"value\": \"http://www.linkedin.com/company/agile-crm\",\r\n"
//		+ "            \"subtype\": \"LINKEDIN\"\r\n"
//		+ "        },\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"address\",\r\n"
//		+ "            \"value\": \"{\\\"address\\\":\\\"MS 35, 440 N Wolfe Road\\\",\\\"city\\\":\\\"Sunnyvale\\\",\\\"state\\\":\\\"CA\\\",\\\"zip\\\":\\\"94085\\\",\\\"country\\\":\\\"US\\\"}\",\r\n"
//		+ "            \"subtype\": \"office\"\r\n"
//		+ "        }\r\n"
//		+ "    ]\r\n"
//		+ "}";
//
//Response UpdatingCompany=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//.contentType("application/json").accept("application/json").body(Updating_company).put("https://roshanmodh.agilecrm.com/dev/api/contacts/edit-properties");
//int	StatusCode3=UpdatingCompany.getStatusCode();
//System.out.println(StatusCode3);
//String Updating_Company= UpdatingCompany.getBody().asPrettyString();
//System.out.println(Updating_Company);


//2.3 Get list of companies
//String Cursor="page_size=25&global_sort_key=-created_time&cursor=ClMKFgoMY3JlYXRlZF90aW1lEgYI-rbWrgUSNWoRc35hZ2lsZS1jcm0tY2xvdWRyFAsSB0NvbnRhY3QYgICAkNv0nQoMogEJZ2hhbnNoeWFtGAAgAQ";
//
//Response GetListCompanies=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123").accept("application/json").queryParams("page_size","25").queryParams("global_sort_key","-created_time").queryParams("cursor","ClMKFgoMY3JlYXRlZF90aW1lEgYI-rbWrgUSNWoRc35hZ2lsZS1jcm0tY2xvdWRyFAsSB0NvbnRhY3QYgICAkNv0nQoMogEJZ2hhbnNoeWFtGAAgAQ").post("https://roshanmodh.agilecrm.com/dev/api/contacts/companies/list");
//int	StatusCode4=GetListCompanies.getStatusCode();
//System.out.println(StatusCode4);
//String GetList_Companies= GetListCompanies.getBody().asPrettyString();
////System.out.println(GetList_Companies);
//
////2.4 Get company by ID
//Response GetCompanybyID=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/contacts/4874271773622272");
//int	statusCode5=GetCompanybyID.getStatusCode();
//System.out.println(statusCode5);
//String	GetCompanybyiD=GetCompanybyID.getBody().asPrettyString();
////System.out.println(GetCompanybyiD);
//
////2.5 DeleteSingleCompany
//
//Response DeleteSingleCompany=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//.accept("application/json").delete("https://roshanmodh.agilecrm.com/dev/api/contacts/4874271773622272");
//int	statusCode6=DeleteSingleCompany.getStatusCode();
//System.out.println(statusCode6);
//String	DeleteSingle_Company=DeleteSingleCompany.getBody().asPrettyString();
////System.out.println(DeleteSingle_Company);
//
////3.1 Listing deals
//
//Response Listingdeals=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//.contentType("application/json").accept("application/json").queryParam("page_size", "10").get("https://roshanmodh.agilecrm.com/dev/api/opportunity");
//int	StatusCode3=Listingdeals.getStatusCode();
//System.out.println(StatusCode3);
//String Listing_deals= Listingdeals.getBody().asPrettyString();
////System.out.println(Listing_deals);
//
////3.2 Get deal by its ID
//Response GetDealbyID=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/opportunity/4549734280396800");
//int	statusCode7=GetDealbyID.getStatusCode();
//System.out.println(statusCode7);
//String	GetDealby_ID=GetDealbyID.getBody().asPrettyString();
////System.out.println(GetDealby_ID);
//
////3.4 Update deal (Partial update)
//
//String UpdateDeal="{\r\n"
//		+ "    \"id\": \"4549734280396800\",\r\n"
//		+ "    \"expected_value\": \"1100\",\r\n"
//		+ "    \"probability\": \"25\",\r\n"
//		+ "    \"contact_ids\": [\r\n"
//		+ "        \"5629703511605249\",\r\n"
//		+ "        \"5744178885558279\"\r\n"
//		+ "    ],\r\n"
//		+ "    \"custom_data\": [\r\n"
//		+ "        {\r\n"
//		+ "            \"name\": \"dealTester\",\r\n"
//		+ "            \"value\": \"hello\"\r\n"
//		+ "        }\r\n"
//		+ "    ]\r\n"
//		+ "}\r\n"
//		+ "";
//
//Response Updatedeal=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
//.accept("application/json").contentType("application/json").body(UpdateDeal).put("https://roshanmodh.agilecrm.com/dev/api/opportunity/partial-update");
//int	statusCode8=Updatedeal.getStatusCode();
//System.out.println(statusCode8);
//String	Update_deal=Updatedeal.getBody().asPrettyString();
////System.out.println(Update_deal);

//3.5 Create deal to a contact using email ID
String CreateDealEmail_id="{\r\n"
		+ "    \"name\": \"rohit-kumar\",\r\n"
		+ "    \"expected_value\": \"500\",\r\n"
		+ "    \"probability\": \"75\",\r\n"
		+ "    \"close_date\": 1455042600,\r\n"
		+ "    \"milestone\": \"Proposal\",\r\n"
		+ "    \"custom_data\": [\r\n"
		+ "        {\r\n"
		+ "            \"name\": \"kishan\",\r\n"
		+ "            \"value\": \"10\"\r\n"
		+ "        }\r\n"
		+ "    ]\r\n"
		+ "}\r\n"
		+ "";

Response CreateDealEmailID=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
.accept("application/json").contentType("application/json").body(CreateDealEmail_id).post("https://roshanmodh.agilecrm.com/dev/api/opportunity/email/rohit123@gmail.com");
int	statusCode9=CreateDealEmailID.getStatusCode();
System.out.println(statusCode9);
String	CreateDealEmail_ID=CreateDealEmailID.getBody().asPrettyString();
//System.out.println(CreateDealEmail_ID);

//3.6 Delete deal

Response Delete_deal=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
.contentType("application/json").delete("https://roshanmodh.agilecrm.com/dev/api/opportunity/4557975798349824");
int	statusCode7=Delete_deal.getStatusCode();
System.out.println(statusCode7);
String	Deletedeal=Delete_deal.getBody().asPrettyString();
//System.out.println(Deletedeal);

//3.8 Get deals from default track grouped by milestones:

Response GetDealsGroupedbyMilestones=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/opportunity/byMilestone");
int	statusCode8=GetDealsGroupedbyMilestones.getStatusCode();
System.out.println(statusCode8);
String	GetDealsGroupedby_Milestones=GetDealsGroupedbyMilestones.getBody().asPrettyString();
//System.out.println(GetDealsGroupedby_Milestones);

//3.9 Get deals for a particular track (grouped by milestone)

Response GroupedbyMilestone=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/opportunity/byPipeline/based?pipeline_id=4756437");
int	statusCode10=GroupedbyMilestone.getStatusCode();
System.out.println(statusCode10);
String	Groupedby_Milestone=GroupedbyMilestone.getBody().asPrettyString();
//System.out.println(Groupedby_Milestone);

//3.12 Get deals of current user (my deals)
//GetDealsSpecificContact
Response GetDealsSpecificContact=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
.accept("application/json").get("https://roshanmodh.agilecrm.com/dev/api/contacts/4549734280396800/deals");
int	statusCode11=GetDealsSpecificContact.getStatusCode();
System.out.println(statusCode11);
String	GetDealsSpecific_Contact=GetDealsSpecificContact.getBody().asPrettyString();
System.out.println(GetDealsSpecific_Contact);

//3.13 Remove contacts of a deal
//RemoveContacts_deal
String RemoveContactsDeal="{\r\n"
		+ "      \"id\": \"4549734280396800\",\r\n"
		+ "      \"contact_ids\": [\r\n"
		+ "          \"4930210138947584\",\r\n"
		+ "	  \"4600356650614784\"\r\n"
		+ "      ]\r\n"
		+ "  }";
Response RemoveContacts_deal=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
.accept("application/json").contentType("application/json").body(RemoveContactsDeal).put("https://roshanmodh.agilecrm.com/dev/api/opportunity/partial-update/delete-contact");
int	statusCode12=RemoveContacts_deal.getStatusCode();
System.out.println(statusCode12);
String	RemoveContacts_Deal=RemoveContacts_deal.getBody().asPrettyString();
//System.out.println(RemoveContacts_Deal);


//4.1 Create a note and relate that to contacts 
//CreateNoteRelateContacts
String Create_NoteRelateContacts="{\r\n"
		+ "    \"subject\": \"imp Note subject\",\r\n"
		+ "    \"description\": \"Note description\",\r\n"
		+ "    \"contact_ids\": [\r\n"
		+ "        \"5688267051630592\",\r\n"
		+ "        \"5721389839417344\"\r\n"
		+ "    ]\r\n"
		+ "}";
Response CreateNoteRelateContacts=RestAssured.given().auth().basic("ros@agilecrm.com", "ros@123")
.accept("application/json").contentType("application/json").body(Create_NoteRelateContacts).post("https://roshanmodh.agilecrm.com/dev/api/notes");
int	statusCode13=CreateNoteRelateContacts.getStatusCode();
System.out.println(statusCode13);
String	CreateNoteRelate_Contacts=CreateNoteRelateContacts.getBody().asPrettyString();
System.out.println(CreateNoteRelate_Contacts);

//4.2 Add note to a contact using email ID:Add note contact email ID
//AddNoteContactbyEmailID







	}
	

}

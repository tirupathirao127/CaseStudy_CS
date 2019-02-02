package case_study.gitV3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeSuite;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;

public class Baseclass_API {
	
	private static String gitV3URL;
	
	@BeforeSuite
	public static void loadEnvDetails() throws IOException {
		ReadTestData configData = new ReadTestData();
		gitV3URL = configData.getValue("gitV3URL");
	}
	
	public static Response getCurrentUser(String token) {
		Response response = null;
		String currentUserURL = gitV3URL + "/user";
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", "token " + token);
		response = given().relaxedHTTPSValidation().headers(headers).request().when().get(currentUserURL);
		return response;
	}
}

package case_study.gitV3;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import case_study.gitV3.pojo.GetAuthorizeduserPOJO;
import junit.framework.Assert;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class GitV3_Authentication extends Baseclass_API {
	
	@Test(priority=1)
	public void getCurrentUserValidCredentials() throws JsonParseException, JsonMappingException, IOException {
		Response response = null;
		ReadTestData data = new ReadTestData();
		response = getCurrentUser(data.getValue("oAuth"));
		//Validating the response code
		Assert.assertEquals(200, response.getStatusCode());
		//Validating fields in response body
		ObjectMapper mapper = new ObjectMapper();
		GetAuthorizeduserPOJO getUser = mapper.readValue(response.asString(), GetAuthorizeduserPOJO.class);
		//Validating specific fields in response 
		Assert.assertEquals(false, getUser.getTwo_factor_authentication());
	}
	
	
}

package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static utilities.Authentication.generateToken;

public class ManagementonSchoolBaseUrl {

    protected RequestSpecification spec;

    @Before//This method will run before each @Test methods.
    public void setUp() {

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://managementonschools.com/")
                .addHeader("Authorization",""+generateToken())
                .build();

    }
}

package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.ApiRegisterRequestDto;
import io.swagger.client.model.WebApiResponseApiRegisterResultDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityApi
 */
public class SecurityApiTest {

    private SecurityApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SecurityApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiSecurityApiRegisterPostTest() {
        ApiRegisterRequestDto model = null;
        // WebApiResponseApiRegisterResultDto response = api.apiSecurityApiRegisterPost(model);

        // TODO: test validations
    }
}

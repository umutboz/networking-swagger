package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.LoginRequest;
import io.swagger.client.model.UserRegisterDto;
import io.swagger.client.model.WebApiResponseBoolean;
import io.swagger.client.model.WebApiResponseUserLoginResultDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
public class AccountApiTest {

    private AccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiAccountForgotPasswordPostTest() {
        LoginRequest loginRequest = null;
        // WebApiResponseBoolean response = api.apiAccountForgotPasswordPost(loginRequest);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiAccountLoginPostTest() {
        LoginRequest loginRequest = null;
        // WebApiResponseUserLoginResultDto response = api.apiAccountLoginPost(loginRequest);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiAccountUserRegisterPostTest() {
        UserRegisterDto user = null;
        // WebApiResponseUserLoginResultDto response = api.apiAccountUserRegisterPost(user);

        // TODO: test validations
    }
}

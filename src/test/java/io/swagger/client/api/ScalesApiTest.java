package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.WebApiResponseListScalesAnswersDto;
import io.swagger.client.model.WebApiResponseListScalesDto;
import io.swagger.client.model.WebApiResponseListScalesItakiFallDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScalesApi
 */
public class ScalesApiTest {

    private ScalesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ScalesApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiScalesGetScalesAnswersListGetTest() {
        // WebApiResponseListScalesAnswersDto response = api.apiScalesGetScalesAnswersListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiScalesGetScalesItakiFallListGetTest() {
        // WebApiResponseListScalesItakiFallDto response = api.apiScalesGetScalesItakiFallListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiScalesGetScalesListGetTest() {
        // WebApiResponseListScalesDto response = api.apiScalesGetScalesListGet();

        // TODO: test validations
    }
}

package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.WebApiResponseListCalculatedDiseasesDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DiseasesApi
 */
public class DiseasesApiTest {

    private DiseasesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DiseasesApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiDiseasesGetCalculatedDiseasesGetTest() {
        Integer patientInformationId = null;
        String type = null;
        // WebApiResponseListCalculatedDiseasesDto response = api.apiDiseasesGetCalculatedDiseasesGet(patientInformationId, type);

        // TODO: test validations
    }
}

package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.WebApiResponseCarePlansDto;
import io.swagger.client.model.WebApiResponseListCarePlansDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DiagnosisApi
 */
public class DiagnosisApiTest {

    private DiagnosisApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DiagnosisApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiDiagnosisGetCarePlanByDiagnosisNameGetTest() {
        String name = null;
        // WebApiResponseCarePlansDto response = api.apiDiagnosisGetCarePlanByDiagnosisNameGet(name);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiDiagnosisGetCarePlanByIdGetTest() {
        Integer id = null;
        // WebApiResponseCarePlansDto response = api.apiDiagnosisGetCarePlanByIdGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiDiagnosisGetCarePlansListGetTest() {
        // WebApiResponseListCarePlansDto response = api.apiDiagnosisGetCarePlansListGet();

        // TODO: test validations
    }
}

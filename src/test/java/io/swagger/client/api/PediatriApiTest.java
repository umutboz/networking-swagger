package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.PediatriQuestionAnswersDto;
import io.swagger.client.model.WebApiResponseBoolean;
import io.swagger.client.model.WebApiResponseListPediatriAnswerDto;
import io.swagger.client.model.WebApiResponseListPediatriMainDto;
import io.swagger.client.model.WebApiResponseListPediatriQuestionAnswersDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PediatriApi
 */
public class PediatriApiTest {

    private PediatriApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PediatriApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiPediatriGetPediatriAnswersListGetTest() {
        // WebApiResponseListPediatriAnswerDto response = api.apiPediatriGetPediatriAnswersListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPediatriGetPediatriListGetTest() {
        // WebApiResponseListPediatriMainDto response = api.apiPediatriGetPediatriListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGetTest() {
        Long id = null;
        // WebApiResponseListPediatriQuestionAnswersDto response = api.apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPediatriGetPediatriQuestionAnswersListGetTest() {
        // WebApiResponseListPediatriQuestionAnswersDto response = api.apiPediatriGetPediatriQuestionAnswersListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPediatriSetPediatriQuestionAnswersPostTest() {
        List<PediatriQuestionAnswersDto> pediatriQuestionAnswers = null;
        // WebApiResponseBoolean response = api.apiPediatriSetPediatriQuestionAnswersPost(pediatriQuestionAnswers);

        // TODO: test validations
    }
}

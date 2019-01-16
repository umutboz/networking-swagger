package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.FsoQuestionAnswersDto;
import io.swagger.client.model.WebApiResponseBoolean;
import io.swagger.client.model.WebApiResponseListFsoAnswersDto;
import io.swagger.client.model.WebApiResponseListFsoMainDto;
import io.swagger.client.model.WebApiResponseListFsoQuestionAnswersDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FsoApi
 */
public class FsoApiTest {

    private FsoApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FsoApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiFsoGetFsoAnswersListGetTest() {
        // WebApiResponseListFsoAnswersDto response = api.apiFsoGetFsoAnswersListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiFsoGetFsoListGetTest() {
        // WebApiResponseListFsoMainDto response = api.apiFsoGetFsoListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiFsoGetFsoQuestionAnswersByPatientInformationIdGetTest() {
        Long id = null;
        // WebApiResponseListFsoQuestionAnswersDto response = api.apiFsoGetFsoQuestionAnswersByPatientInformationIdGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiFsoGetFsoQuestionAnswersListGetTest() {
        // WebApiResponseListFsoQuestionAnswersDto response = api.apiFsoGetFsoQuestionAnswersListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiFsoSetFsoQuestionAnswersPostTest() {
        List<FsoQuestionAnswersDto> fsoQuestionAnswers = null;
        // WebApiResponseBoolean response = api.apiFsoSetFsoQuestionAnswersPost(fsoQuestionAnswers);

        // TODO: test validations
    }
}

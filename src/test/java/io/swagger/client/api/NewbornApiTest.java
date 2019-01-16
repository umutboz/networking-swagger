package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.NewbornQuestionAnswersDto;
import io.swagger.client.model.WebApiResponseBoolean;
import io.swagger.client.model.WebApiResponseListNewbornAnswerDto;
import io.swagger.client.model.WebApiResponseListNewbornMainDto;
import io.swagger.client.model.WebApiResponseListNewbornQuestionAnswersDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NewbornApi
 */
public class NewbornApiTest {

    private NewbornApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NewbornApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiNewbornGetNewbornAnswersListGetTest() {
        // WebApiResponseListNewbornAnswerDto response = api.apiNewbornGetNewbornAnswersListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiNewbornGetNewbornListGetTest() {
        // WebApiResponseListNewbornMainDto response = api.apiNewbornGetNewbornListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGetTest() {
        Long id = null;
        // WebApiResponseListNewbornQuestionAnswersDto response = api.apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiNewbornGetNewbornQuestionAnswersListGetTest() {
        // WebApiResponseListNewbornQuestionAnswersDto response = api.apiNewbornGetNewbornQuestionAnswersListGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiNewbornSetNewbornQuestionAnswersPostTest() {
        List<NewbornQuestionAnswersDto> newbornQuestionAnswers = null;
        // WebApiResponseBoolean response = api.apiNewbornSetNewbornQuestionAnswersPost(newbornQuestionAnswers);

        // TODO: test validations
    }
}

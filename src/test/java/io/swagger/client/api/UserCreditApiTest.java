package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.UserCreditTransactionsDto;
import io.swagger.client.model.WebApiResponseListUserCreditTransactionsDto;
import io.swagger.client.model.WebApiResponseUserCreditTransactionSummaryDto;
import io.swagger.client.model.WebApiResponseUserCreditTransactionsDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserCreditApi
 */
public class UserCreditApiTest {

    private UserCreditApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UserCreditApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiUserCreditGetUserCreditTransactionSummaryGetTest() {
        Long userId = null;
        // WebApiResponseUserCreditTransactionSummaryDto response = api.apiUserCreditGetUserCreditTransactionSummaryGet(userId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiUserCreditListUserCreditTransactionsByUserGetTest() {
        Long userId = null;
        // WebApiResponseListUserCreditTransactionsDto response = api.apiUserCreditListUserCreditTransactionsByUserGet(userId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiUserCreditListUserCreditTransactionsGetTest() {
        // WebApiResponseListUserCreditTransactionsDto response = api.apiUserCreditListUserCreditTransactionsGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiUserCreditSetUserCreditTransactionPostTest() {
        UserCreditTransactionsDto model = null;
        // WebApiResponseUserCreditTransactionsDto response = api.apiUserCreditSetUserCreditTransactionPost(model);

        // TODO: test validations
    }
}

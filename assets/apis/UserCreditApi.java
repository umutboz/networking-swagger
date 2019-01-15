package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.UserCreditTransactionsDto;
import io.swagger.client.model.WebApiResponseListUserCreditTransactionsDto;
import io.swagger.client.model.WebApiResponseUserCreditTransactionSummaryDto;
import io.swagger.client.model.WebApiResponseUserCreditTransactionsDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserCreditApi {
  /**
   * 
   * 
   * @param userId  (required)
   * @return Call&lt;WebApiResponseUserCreditTransactionSummaryDto&gt;
   */
  @GET("api/UserCredit/GetUserCreditTransactionSummary")
  Call<WebApiResponseUserCreditTransactionSummaryDto> apiUserCreditGetUserCreditTransactionSummaryGet(
    @retrofit2.http.Query("userId") Long userId
  );

  /**
   * 
   * 
   * @param userId  (required)
   * @return Call&lt;WebApiResponseListUserCreditTransactionsDto&gt;
   */
  @GET("api/UserCredit/ListUserCreditTransactionsByUser")
  Call<WebApiResponseListUserCreditTransactionsDto> apiUserCreditListUserCreditTransactionsByUserGet(
    @retrofit2.http.Query("userId") Long userId
  );

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListUserCreditTransactionsDto&gt;
   */
  @GET("api/UserCredit/ListUserCreditTransactions")
  Call<WebApiResponseListUserCreditTransactionsDto> apiUserCreditListUserCreditTransactionsGet();
    

  /**
   * 
   * 
   * @param model  (optional)
   * @return Call&lt;WebApiResponseUserCreditTransactionsDto&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/UserCredit/SetUserCreditTransaction")
  Call<WebApiResponseUserCreditTransactionsDto> apiUserCreditSetUserCreditTransactionPost(
    @retrofit2.http.Body UserCreditTransactionsDto model
  );

}

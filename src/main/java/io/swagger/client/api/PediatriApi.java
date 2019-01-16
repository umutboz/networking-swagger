package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.PediatriQuestionAnswersDto;
import io.swagger.client.model.WebApiResponseBoolean;
import io.swagger.client.model.WebApiResponseListPediatriAnswerDto;
import io.swagger.client.model.WebApiResponseListPediatriMainDto;
import io.swagger.client.model.WebApiResponseListPediatriQuestionAnswersDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PediatriApi {
  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListPediatriAnswerDto&gt;
   */
  @GET("api/Pediatri/GetPediatriAnswersList")
  Call<WebApiResponseListPediatriAnswerDto> apiPediatriGetPediatriAnswersListGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListPediatriMainDto&gt;
   */
  @GET("api/Pediatri/GetPediatriList")
  Call<WebApiResponseListPediatriMainDto> apiPediatriGetPediatriListGet();
    

  /**
   * 
   * 
   * @param id  (required)
   * @return Call&lt;WebApiResponseListPediatriQuestionAnswersDto&gt;
   */
  @GET("api/Pediatri/GetPediatriQuestionAnswersByPatientInformationId")
  Call<WebApiResponseListPediatriQuestionAnswersDto> apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet(
    @retrofit2.http.Query("id") Long id
  );

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListPediatriQuestionAnswersDto&gt;
   */
  @GET("api/Pediatri/GetPediatriQuestionAnswersList")
  Call<WebApiResponseListPediatriQuestionAnswersDto> apiPediatriGetPediatriQuestionAnswersListGet();
    

  /**
   * 
   * 
   * @param pediatriQuestionAnswers  (optional)
   * @return Call&lt;WebApiResponseBoolean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/Pediatri/SetPediatriQuestionAnswers")
  Call<WebApiResponseBoolean> apiPediatriSetPediatriQuestionAnswersPost(
    @retrofit2.http.Body List<PediatriQuestionAnswersDto> pediatriQuestionAnswers
  );

}

package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.NewbornQuestionAnswersDto;
import io.swagger.client.model.WebApiResponseBoolean;
import io.swagger.client.model.WebApiResponseListNewbornAnswerDto;
import io.swagger.client.model.WebApiResponseListNewbornMainDto;
import io.swagger.client.model.WebApiResponseListNewbornQuestionAnswersDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NewbornApi {
  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListNewbornAnswerDto&gt;
   */
  @GET("api/Newborn/GetNewbornAnswersList")
  Call<WebApiResponseListNewbornAnswerDto> apiNewbornGetNewbornAnswersListGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListNewbornMainDto&gt;
   */
  @GET("api/Newborn/GetNewbornList")
  Call<WebApiResponseListNewbornMainDto> apiNewbornGetNewbornListGet();
    

  /**
   * 
   * 
   * @param id  (required)
   * @return Call&lt;WebApiResponseListNewbornQuestionAnswersDto&gt;
   */
  @GET("api/Newborn/GetNewbornQuestionAnswersByPatientInformationId")
  Call<WebApiResponseListNewbornQuestionAnswersDto> apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet(
    @retrofit2.http.Query("id") Long id
  );

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListNewbornQuestionAnswersDto&gt;
   */
  @GET("api/Newborn/GetNewbornQuestionAnswersList")
  Call<WebApiResponseListNewbornQuestionAnswersDto> apiNewbornGetNewbornQuestionAnswersListGet();
    

  /**
   * 
   * 
   * @param newbornQuestionAnswers  (optional)
   * @return Call&lt;WebApiResponseBoolean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/Newborn/SetNewbornQuestionAnswers")
  Call<WebApiResponseBoolean> apiNewbornSetNewbornQuestionAnswersPost(
    @retrofit2.http.Body List<NewbornQuestionAnswersDto> newbornQuestionAnswers
  );

}

package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.FsoQuestionAnswersDto;
import io.swagger.client.model.WebApiResponseBoolean;
import io.swagger.client.model.WebApiResponseListFsoAnswersDto;
import io.swagger.client.model.WebApiResponseListFsoMainDto;
import io.swagger.client.model.WebApiResponseListFsoQuestionAnswersDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FsoApi {
  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListFsoAnswersDto&gt;
   */
  @GET("api/Fso/GetFsoAnswersList")
  Call<WebApiResponseListFsoAnswersDto> apiFsoGetFsoAnswersListGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListFsoMainDto&gt;
   */
  @GET("api/Fso/GetFsoList")
  Call<WebApiResponseListFsoMainDto> apiFsoGetFsoListGet();
    

  /**
   * 
   * 
   * @param id  (required)
   * @return Call&lt;WebApiResponseListFsoQuestionAnswersDto&gt;
   */
  @GET("api/Fso/GetFsoQuestionAnswersByPatientInformationId")
  Call<WebApiResponseListFsoQuestionAnswersDto> apiFsoGetFsoQuestionAnswersByPatientInformationIdGet(
    @retrofit2.http.Query("id") Long id
  );

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListFsoQuestionAnswersDto&gt;
   */
  @GET("api/Fso/GetFsoQuestionAnswersList")
  Call<WebApiResponseListFsoQuestionAnswersDto> apiFsoGetFsoQuestionAnswersListGet();
    

  /**
   * 
   * 
   * @param fsoQuestionAnswers  (optional)
   * @return Call&lt;WebApiResponseBoolean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/Fso/SetFsoQuestionAnswers")
  Call<WebApiResponseBoolean> apiFsoSetFsoQuestionAnswersPost(
    @retrofit2.http.Body List<FsoQuestionAnswersDto> fsoQuestionAnswers
  );

}

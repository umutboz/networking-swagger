package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.WebApiResponseListScalesAnswersDto;
import io.swagger.client.model.WebApiResponseListScalesDto;
import io.swagger.client.model.WebApiResponseListScalesItakiFallDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ScalesApi {
  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListScalesAnswersDto&gt;
   */
  @GET("api/Scales/GetScalesAnswersList")
  Call<WebApiResponseListScalesAnswersDto> apiScalesGetScalesAnswersListGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListScalesItakiFallDto&gt;
   */
  @GET("api/Scales/GetScalesItakiFallList")
  Call<WebApiResponseListScalesItakiFallDto> apiScalesGetScalesItakiFallListGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListScalesDto&gt;
   */
  @GET("api/Scales/GetScalesList")
  Call<WebApiResponseListScalesDto> apiScalesGetScalesListGet();
    

}

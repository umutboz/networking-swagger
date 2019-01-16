package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.ApiRegisterRequestDto;
import io.swagger.client.model.WebApiResponseApiRegisterResultDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SecurityApi {
  /**
   * 
   * 
   * @param model  (optional)
   * @return Call&lt;WebApiResponseApiRegisterResultDto&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/Security/ApiRegister")
  Call<WebApiResponseApiRegisterResultDto> apiSecurityApiRegisterPost(
    @retrofit2.http.Body ApiRegisterRequestDto model
  );

}

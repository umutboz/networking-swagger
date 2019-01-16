package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.LoginRequest;
import io.swagger.client.model.UserRegisterDto;
import io.swagger.client.model.WebApiResponseBoolean;
import io.swagger.client.model.WebApiResponseUserLoginResultDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountApi {
  /**
   * 
   * 
   * @param loginRequest  (optional)
   * @return Call&lt;WebApiResponseBoolean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/Account/ForgotPassword")
  Call<WebApiResponseBoolean> apiAccountForgotPasswordPost(
    @retrofit2.http.Body LoginRequest loginRequest
  );

  /**
   * 
   * 
   * @param loginRequest  (optional)
   * @return Call&lt;WebApiResponseUserLoginResultDto&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/Account/Login")
  Call<WebApiResponseUserLoginResultDto> apiAccountLoginPost(
    @retrofit2.http.Body LoginRequest loginRequest
  );

  /**
   * 
   * 
   * @param user  (optional)
   * @return Call&lt;WebApiResponseUserLoginResultDto&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/Account/UserRegister")
  Call<WebApiResponseUserLoginResultDto> apiAccountUserRegisterPost(
    @retrofit2.http.Body UserRegisterDto user
  );

}

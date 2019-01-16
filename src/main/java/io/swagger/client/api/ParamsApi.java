package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.WebApiResponseListParamsDto;
import io.swagger.client.model.WebApiResponseParamsDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ParamsApi {
  /**
   * 
   * 
   * @return Call&lt;WebApiResponseParamsDto&gt;
   */
  @GET("api/Params/GetEcareDbVersion")
  Call<WebApiResponseParamsDto> apiParamsGetEcareDbVersionGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListParamsDto&gt;
   */
  @GET("api/Params/GetParamsChronicDiseases")
  Call<WebApiResponseListParamsDto> apiParamsGetParamsChronicDiseasesGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListParamsDto&gt;
   */
  @GET("api/Params/GetParamsDiseases")
  Call<WebApiResponseListParamsDto> apiParamsGetParamsDiseasesGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListParamsDto&gt;
   */
  @GET("api/Params/GetParamsDrugType")
  Call<WebApiResponseListParamsDto> apiParamsGetParamsDrugTypeGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListParamsDto&gt;
   */
  @GET("api/Params/GetParamsInvasiveProcedure")
  Call<WebApiResponseListParamsDto> apiParamsGetParamsInvasiveProcedureGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListParamsDto&gt;
   */
  @GET("api/Params/GetParamsOperations")
  Call<WebApiResponseListParamsDto> apiParamsGetParamsOperationsGet();
    

}

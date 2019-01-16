package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.WebApiResponseCarePlansDto;
import io.swagger.client.model.WebApiResponseListCarePlansDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DiagnosisApi {
  /**
   * 
   * 
   * @param name  (optional)
   * @return Call&lt;WebApiResponseCarePlansDto&gt;
   */
  @GET("api/Diagnosis/GetCarePlanByDiagnosisName")
  Call<WebApiResponseCarePlansDto> apiDiagnosisGetCarePlanByDiagnosisNameGet(
    @retrofit2.http.Query("name") String name
  );

  /**
   * 
   * 
   * @param id  (required)
   * @return Call&lt;WebApiResponseCarePlansDto&gt;
   */
  @GET("api/Diagnosis/GetCarePlanById")
  Call<WebApiResponseCarePlansDto> apiDiagnosisGetCarePlanByIdGet(
    @retrofit2.http.Query("id") Integer id
  );

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListCarePlansDto&gt;
   */
  @GET("api/Diagnosis/GetCarePlansList")
  Call<WebApiResponseListCarePlansDto> apiDiagnosisGetCarePlansListGet();
    

}

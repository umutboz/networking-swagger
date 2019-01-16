package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.WebApiResponseListCalculatedDiseasesDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DiseasesApi {
  /**
   * 
   * 
   * @param patientInformationId  (required)
   * @param type  (optional)
   * @return Call&lt;WebApiResponseListCalculatedDiseasesDto&gt;
   */
  @GET("api/Diseases/GetCalculatedDiseases")
  Call<WebApiResponseListCalculatedDiseasesDto> apiDiseasesGetCalculatedDiseasesGet(
    @retrofit2.http.Query("patientInformationId") Integer patientInformationId, @retrofit2.http.Query("type") String type
  );

}

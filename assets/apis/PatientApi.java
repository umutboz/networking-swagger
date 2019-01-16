package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.PatientInfoSetCarePlansDto;
import io.swagger.client.model.PatientInformationDto;
import io.swagger.client.model.WebApiResponseListPatientClinicDto;
import io.swagger.client.model.WebApiResponseListPatientInfoSetCarePlansDto;
import io.swagger.client.model.WebApiResponseListPatientInformationDto;
import io.swagger.client.model.WebApiResponsePatientInfoSetCarePlansDto;
import io.swagger.client.model.WebApiResponsePatientInformationDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PatientApi {
  /**
   * 
   * 
   * @param id  (required)
   * @return Call&lt;WebApiResponsePatientInformationDto&gt;
   */
  @GET("api/Patient/GetPatientInformationById")
  Call<WebApiResponsePatientInformationDto> apiPatientGetPatientInformationByIdGet(
    @retrofit2.http.Query("id") Long id
  );

  /**
   * 
   * 
   * @param name  (optional)
   * @return Call&lt;WebApiResponsePatientInformationDto&gt;
   */
  @GET("api/Patient/GetPatientInformationByName")
  Call<WebApiResponsePatientInformationDto> apiPatientGetPatientInformationByNameGet(
    @retrofit2.http.Query("name") String name
  );

  /**
   * 
   * 
   * @param id  (required)
   * @return Call&lt;WebApiResponseListPatientInformationDto&gt;
   */
  @GET("api/Patient/GetPatientInformationListByCreater")
  Call<WebApiResponseListPatientInformationDto> apiPatientGetPatientInformationListByCreaterGet(
    @retrofit2.http.Query("id") Long id
  );

  /**
   * 
   * 
   * @param patientInformationId  (required)
   * @param carePlansId  (required)
   * @return Call&lt;WebApiResponsePatientInfoSetCarePlansDto&gt;
   */
  @GET("api/Patient/GetSelectedPatientCarePlansById")
  Call<WebApiResponsePatientInfoSetCarePlansDto> apiPatientGetSelectedPatientCarePlansByIdGet(
    @retrofit2.http.Query("PatientInformationId") Integer patientInformationId, @retrofit2.http.Query("CarePlansId") Integer carePlansId
  );

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListPatientClinicDto&gt;
   */
  @GET("api/Patient/ListClinics")
  Call<WebApiResponseListPatientClinicDto> apiPatientListClinicsGet();
    

  /**
   * 
   * 
   * @return Call&lt;WebApiResponseListPatientInfoSetCarePlansDto&gt;
   */
  @GET("api/Patient/ListPatientInfoSetCarePlans")
  Call<WebApiResponseListPatientInfoSetCarePlansDto> apiPatientListPatientInfoSetCarePlansGet();
    

  /**
   * 
   * 
   * @param model  (optional)
   * @return Call&lt;WebApiResponsePatientInformationDto&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/Patient/SetPatientInformation")
  Call<WebApiResponsePatientInformationDto> apiPatientSetPatientInformationPost(
    @retrofit2.http.Body PatientInformationDto model
  );

  /**
   * 
   * 
   * @param model  (optional)
   * @return Call&lt;WebApiResponsePatientInfoSetCarePlansDto&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/Patient/SetSelectedPatientCarePlans")
  Call<WebApiResponsePatientInfoSetCarePlansDto> apiPatientSetSelectedPatientCarePlansPost(
    @retrofit2.http.Body PatientInfoSetCarePlansDto model
  );

}

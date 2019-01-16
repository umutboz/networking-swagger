package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.PatientInfoSetCarePlansDto;
import io.swagger.client.model.PatientInformationDto;
import io.swagger.client.model.WebApiResponseListPatientClinicDto;
import io.swagger.client.model.WebApiResponseListPatientInfoSetCarePlansDto;
import io.swagger.client.model.WebApiResponseListPatientInformationDto;
import io.swagger.client.model.WebApiResponsePatientInfoSetCarePlansDto;
import io.swagger.client.model.WebApiResponsePatientInformationDto;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PatientApi
 */
public class PatientApiTest {

    private PatientApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PatientApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void apiPatientGetPatientInformationByIdGetTest() {
        Long id = null;
        // WebApiResponsePatientInformationDto response = api.apiPatientGetPatientInformationByIdGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPatientGetPatientInformationByNameGetTest() {
        String name = null;
        // WebApiResponsePatientInformationDto response = api.apiPatientGetPatientInformationByNameGet(name);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPatientGetPatientInformationListByCreaterGetTest() {
        Long id = null;
        // WebApiResponseListPatientInformationDto response = api.apiPatientGetPatientInformationListByCreaterGet(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPatientGetSelectedPatientCarePlansByIdGetTest() {
        Integer patientInformationId = null;
        Integer carePlansId = null;
        // WebApiResponsePatientInfoSetCarePlansDto response = api.apiPatientGetSelectedPatientCarePlansByIdGet(patientInformationId, carePlansId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPatientListClinicsGetTest() {
        // WebApiResponseListPatientClinicDto response = api.apiPatientListClinicsGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPatientListPatientInfoSetCarePlansGetTest() {
        // WebApiResponseListPatientInfoSetCarePlansDto response = api.apiPatientListPatientInfoSetCarePlansGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPatientSetPatientInformationPostTest() {
        PatientInformationDto model = null;
        // WebApiResponsePatientInformationDto response = api.apiPatientSetPatientInformationPost(model);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void apiPatientSetSelectedPatientCarePlansPostTest() {
        PatientInfoSetCarePlansDto model = null;
        // WebApiResponsePatientInfoSetCarePlansDto response = api.apiPatientSetSelectedPatientCarePlansPost(model);

        // TODO: test validations
    }
}

# PatientApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiPatientGetPatientInformationByIdGet**](PatientApi.md#apiPatientGetPatientInformationByIdGet) | **GET** api/Patient/GetPatientInformationById | 
[**apiPatientGetPatientInformationByNameGet**](PatientApi.md#apiPatientGetPatientInformationByNameGet) | **GET** api/Patient/GetPatientInformationByName | 
[**apiPatientGetPatientInformationListByCreaterGet**](PatientApi.md#apiPatientGetPatientInformationListByCreaterGet) | **GET** api/Patient/GetPatientInformationListByCreater | 
[**apiPatientGetSelectedPatientCarePlansByIdGet**](PatientApi.md#apiPatientGetSelectedPatientCarePlansByIdGet) | **GET** api/Patient/GetSelectedPatientCarePlansById | 
[**apiPatientListClinicsGet**](PatientApi.md#apiPatientListClinicsGet) | **GET** api/Patient/ListClinics | 
[**apiPatientListPatientInfoSetCarePlansGet**](PatientApi.md#apiPatientListPatientInfoSetCarePlansGet) | **GET** api/Patient/ListPatientInfoSetCarePlans | 
[**apiPatientSetPatientInformationPost**](PatientApi.md#apiPatientSetPatientInformationPost) | **POST** api/Patient/SetPatientInformation | 
[**apiPatientSetSelectedPatientCarePlansPost**](PatientApi.md#apiPatientSetSelectedPatientCarePlansPost) | **POST** api/Patient/SetSelectedPatientCarePlans | 


<a name="apiPatientGetPatientInformationByIdGet"></a>
# **apiPatientGetPatientInformationByIdGet**
> WebApiResponsePatientInformationDto apiPatientGetPatientInformationByIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
Long id = 789L; // Long | 
try {
    WebApiResponsePatientInformationDto result = apiInstance.apiPatientGetPatientInformationByIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#apiPatientGetPatientInformationByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**WebApiResponsePatientInformationDto**](WebApiResponsePatientInformationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPatientGetPatientInformationByNameGet"></a>
# **apiPatientGetPatientInformationByNameGet**
> WebApiResponsePatientInformationDto apiPatientGetPatientInformationByNameGet(name)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
String name = "name_example"; // String | 
try {
    WebApiResponsePatientInformationDto result = apiInstance.apiPatientGetPatientInformationByNameGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#apiPatientGetPatientInformationByNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | [optional]

### Return type

[**WebApiResponsePatientInformationDto**](WebApiResponsePatientInformationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPatientGetPatientInformationListByCreaterGet"></a>
# **apiPatientGetPatientInformationListByCreaterGet**
> WebApiResponseListPatientInformationDto apiPatientGetPatientInformationListByCreaterGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
Long id = 789L; // Long | 
try {
    WebApiResponseListPatientInformationDto result = apiInstance.apiPatientGetPatientInformationListByCreaterGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#apiPatientGetPatientInformationListByCreaterGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**WebApiResponseListPatientInformationDto**](WebApiResponseListPatientInformationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPatientGetSelectedPatientCarePlansByIdGet"></a>
# **apiPatientGetSelectedPatientCarePlansByIdGet**
> WebApiResponsePatientInfoSetCarePlansDto apiPatientGetSelectedPatientCarePlansByIdGet(patientInformationId, carePlansId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
Integer patientInformationId = 56; // Integer | 
Integer carePlansId = 56; // Integer | 
try {
    WebApiResponsePatientInfoSetCarePlansDto result = apiInstance.apiPatientGetSelectedPatientCarePlansByIdGet(patientInformationId, carePlansId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#apiPatientGetSelectedPatientCarePlansByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientInformationId** | **Integer**|  |
 **carePlansId** | **Integer**|  |

### Return type

[**WebApiResponsePatientInfoSetCarePlansDto**](WebApiResponsePatientInfoSetCarePlansDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPatientListClinicsGet"></a>
# **apiPatientListClinicsGet**
> WebApiResponseListPatientClinicDto apiPatientListClinicsGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
try {
    WebApiResponseListPatientClinicDto result = apiInstance.apiPatientListClinicsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#apiPatientListClinicsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListPatientClinicDto**](WebApiResponseListPatientClinicDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPatientListPatientInfoSetCarePlansGet"></a>
# **apiPatientListPatientInfoSetCarePlansGet**
> WebApiResponseListPatientInfoSetCarePlansDto apiPatientListPatientInfoSetCarePlansGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
try {
    WebApiResponseListPatientInfoSetCarePlansDto result = apiInstance.apiPatientListPatientInfoSetCarePlansGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#apiPatientListPatientInfoSetCarePlansGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListPatientInfoSetCarePlansDto**](WebApiResponseListPatientInfoSetCarePlansDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPatientSetPatientInformationPost"></a>
# **apiPatientSetPatientInformationPost**
> WebApiResponsePatientInformationDto apiPatientSetPatientInformationPost(model)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
PatientInformationDto model = new PatientInformationDto(); // PatientInformationDto | 
try {
    WebApiResponsePatientInformationDto result = apiInstance.apiPatientSetPatientInformationPost(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#apiPatientSetPatientInformationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**PatientInformationDto**](PatientInformationDto.md)|  | [optional]

### Return type

[**WebApiResponsePatientInformationDto**](WebApiResponsePatientInformationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiPatientSetSelectedPatientCarePlansPost"></a>
# **apiPatientSetSelectedPatientCarePlansPost**
> WebApiResponsePatientInfoSetCarePlansDto apiPatientSetSelectedPatientCarePlansPost(model)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
PatientInfoSetCarePlansDto model = new PatientInfoSetCarePlansDto(); // PatientInfoSetCarePlansDto | 
try {
    WebApiResponsePatientInfoSetCarePlansDto result = apiInstance.apiPatientSetSelectedPatientCarePlansPost(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#apiPatientSetSelectedPatientCarePlansPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**PatientInfoSetCarePlansDto**](PatientInfoSetCarePlansDto.md)|  | [optional]

### Return type

[**WebApiResponsePatientInfoSetCarePlansDto**](WebApiResponsePatientInfoSetCarePlansDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


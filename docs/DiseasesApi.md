# DiseasesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiDiseasesGetCalculatedDiseasesGet**](DiseasesApi.md#apiDiseasesGetCalculatedDiseasesGet) | **GET** api/Diseases/GetCalculatedDiseases | 


<a name="apiDiseasesGetCalculatedDiseasesGet"></a>
# **apiDiseasesGetCalculatedDiseasesGet**
> WebApiResponseListCalculatedDiseasesDto apiDiseasesGetCalculatedDiseasesGet(patientInformationId, type)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiseasesApi;


DiseasesApi apiInstance = new DiseasesApi();
Integer patientInformationId = 56; // Integer | 
String type = "type_example"; // String | 
try {
    WebApiResponseListCalculatedDiseasesDto result = apiInstance.apiDiseasesGetCalculatedDiseasesGet(patientInformationId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiseasesApi#apiDiseasesGetCalculatedDiseasesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientInformationId** | **Integer**|  |
 **type** | **String**|  | [optional]

### Return type

[**WebApiResponseListCalculatedDiseasesDto**](WebApiResponseListCalculatedDiseasesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


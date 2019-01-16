# DiagnosisApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiDiagnosisGetCarePlanByDiagnosisNameGet**](DiagnosisApi.md#apiDiagnosisGetCarePlanByDiagnosisNameGet) | **GET** api/Diagnosis/GetCarePlanByDiagnosisName | 
[**apiDiagnosisGetCarePlanByIdGet**](DiagnosisApi.md#apiDiagnosisGetCarePlanByIdGet) | **GET** api/Diagnosis/GetCarePlanById | 
[**apiDiagnosisGetCarePlansListGet**](DiagnosisApi.md#apiDiagnosisGetCarePlansListGet) | **GET** api/Diagnosis/GetCarePlansList | 


<a name="apiDiagnosisGetCarePlanByDiagnosisNameGet"></a>
# **apiDiagnosisGetCarePlanByDiagnosisNameGet**
> WebApiResponseCarePlansDto apiDiagnosisGetCarePlanByDiagnosisNameGet(name)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiagnosisApi;


DiagnosisApi apiInstance = new DiagnosisApi();
String name = "name_example"; // String | 
try {
    WebApiResponseCarePlansDto result = apiInstance.apiDiagnosisGetCarePlanByDiagnosisNameGet(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosisApi#apiDiagnosisGetCarePlanByDiagnosisNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | [optional]

### Return type

[**WebApiResponseCarePlansDto**](WebApiResponseCarePlansDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiDiagnosisGetCarePlanByIdGet"></a>
# **apiDiagnosisGetCarePlanByIdGet**
> WebApiResponseCarePlansDto apiDiagnosisGetCarePlanByIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiagnosisApi;


DiagnosisApi apiInstance = new DiagnosisApi();
Integer id = 56; // Integer | 
try {
    WebApiResponseCarePlansDto result = apiInstance.apiDiagnosisGetCarePlanByIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosisApi#apiDiagnosisGetCarePlanByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**WebApiResponseCarePlansDto**](WebApiResponseCarePlansDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiDiagnosisGetCarePlansListGet"></a>
# **apiDiagnosisGetCarePlansListGet**
> WebApiResponseListCarePlansDto apiDiagnosisGetCarePlansListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiagnosisApi;


DiagnosisApi apiInstance = new DiagnosisApi();
try {
    WebApiResponseListCarePlansDto result = apiInstance.apiDiagnosisGetCarePlansListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagnosisApi#apiDiagnosisGetCarePlansListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListCarePlansDto**](WebApiResponseListCarePlansDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


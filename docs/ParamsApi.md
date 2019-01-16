# ParamsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiParamsGetEcareDbVersionGet**](ParamsApi.md#apiParamsGetEcareDbVersionGet) | **GET** api/Params/GetEcareDbVersion | 
[**apiParamsGetParamsChronicDiseasesGet**](ParamsApi.md#apiParamsGetParamsChronicDiseasesGet) | **GET** api/Params/GetParamsChronicDiseases | 
[**apiParamsGetParamsDiseasesGet**](ParamsApi.md#apiParamsGetParamsDiseasesGet) | **GET** api/Params/GetParamsDiseases | 
[**apiParamsGetParamsDrugTypeGet**](ParamsApi.md#apiParamsGetParamsDrugTypeGet) | **GET** api/Params/GetParamsDrugType | 
[**apiParamsGetParamsInvasiveProcedureGet**](ParamsApi.md#apiParamsGetParamsInvasiveProcedureGet) | **GET** api/Params/GetParamsInvasiveProcedure | 
[**apiParamsGetParamsOperationsGet**](ParamsApi.md#apiParamsGetParamsOperationsGet) | **GET** api/Params/GetParamsOperations | 


<a name="apiParamsGetEcareDbVersionGet"></a>
# **apiParamsGetEcareDbVersionGet**
> WebApiResponseParamsDto apiParamsGetEcareDbVersionGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParamsApi;


ParamsApi apiInstance = new ParamsApi();
try {
    WebApiResponseParamsDto result = apiInstance.apiParamsGetEcareDbVersionGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamsApi#apiParamsGetEcareDbVersionGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseParamsDto**](WebApiResponseParamsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiParamsGetParamsChronicDiseasesGet"></a>
# **apiParamsGetParamsChronicDiseasesGet**
> WebApiResponseListParamsDto apiParamsGetParamsChronicDiseasesGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParamsApi;


ParamsApi apiInstance = new ParamsApi();
try {
    WebApiResponseListParamsDto result = apiInstance.apiParamsGetParamsChronicDiseasesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamsApi#apiParamsGetParamsChronicDiseasesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListParamsDto**](WebApiResponseListParamsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiParamsGetParamsDiseasesGet"></a>
# **apiParamsGetParamsDiseasesGet**
> WebApiResponseListParamsDto apiParamsGetParamsDiseasesGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParamsApi;


ParamsApi apiInstance = new ParamsApi();
try {
    WebApiResponseListParamsDto result = apiInstance.apiParamsGetParamsDiseasesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamsApi#apiParamsGetParamsDiseasesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListParamsDto**](WebApiResponseListParamsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiParamsGetParamsDrugTypeGet"></a>
# **apiParamsGetParamsDrugTypeGet**
> WebApiResponseListParamsDto apiParamsGetParamsDrugTypeGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParamsApi;


ParamsApi apiInstance = new ParamsApi();
try {
    WebApiResponseListParamsDto result = apiInstance.apiParamsGetParamsDrugTypeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamsApi#apiParamsGetParamsDrugTypeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListParamsDto**](WebApiResponseListParamsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiParamsGetParamsInvasiveProcedureGet"></a>
# **apiParamsGetParamsInvasiveProcedureGet**
> WebApiResponseListParamsDto apiParamsGetParamsInvasiveProcedureGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParamsApi;


ParamsApi apiInstance = new ParamsApi();
try {
    WebApiResponseListParamsDto result = apiInstance.apiParamsGetParamsInvasiveProcedureGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamsApi#apiParamsGetParamsInvasiveProcedureGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListParamsDto**](WebApiResponseListParamsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiParamsGetParamsOperationsGet"></a>
# **apiParamsGetParamsOperationsGet**
> WebApiResponseListParamsDto apiParamsGetParamsOperationsGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ParamsApi;


ParamsApi apiInstance = new ParamsApi();
try {
    WebApiResponseListParamsDto result = apiInstance.apiParamsGetParamsOperationsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamsApi#apiParamsGetParamsOperationsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListParamsDto**](WebApiResponseListParamsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


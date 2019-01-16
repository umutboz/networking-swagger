# PediatriApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiPediatriGetPediatriAnswersListGet**](PediatriApi.md#apiPediatriGetPediatriAnswersListGet) | **GET** api/Pediatri/GetPediatriAnswersList | 
[**apiPediatriGetPediatriListGet**](PediatriApi.md#apiPediatriGetPediatriListGet) | **GET** api/Pediatri/GetPediatriList | 
[**apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet**](PediatriApi.md#apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet) | **GET** api/Pediatri/GetPediatriQuestionAnswersByPatientInformationId | 
[**apiPediatriGetPediatriQuestionAnswersListGet**](PediatriApi.md#apiPediatriGetPediatriQuestionAnswersListGet) | **GET** api/Pediatri/GetPediatriQuestionAnswersList | 
[**apiPediatriSetPediatriQuestionAnswersPost**](PediatriApi.md#apiPediatriSetPediatriQuestionAnswersPost) | **POST** api/Pediatri/SetPediatriQuestionAnswers | 


<a name="apiPediatriGetPediatriAnswersListGet"></a>
# **apiPediatriGetPediatriAnswersListGet**
> WebApiResponseListPediatriAnswerDto apiPediatriGetPediatriAnswersListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PediatriApi;


PediatriApi apiInstance = new PediatriApi();
try {
    WebApiResponseListPediatriAnswerDto result = apiInstance.apiPediatriGetPediatriAnswersListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PediatriApi#apiPediatriGetPediatriAnswersListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListPediatriAnswerDto**](WebApiResponseListPediatriAnswerDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPediatriGetPediatriListGet"></a>
# **apiPediatriGetPediatriListGet**
> WebApiResponseListPediatriMainDto apiPediatriGetPediatriListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PediatriApi;


PediatriApi apiInstance = new PediatriApi();
try {
    WebApiResponseListPediatriMainDto result = apiInstance.apiPediatriGetPediatriListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PediatriApi#apiPediatriGetPediatriListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListPediatriMainDto**](WebApiResponseListPediatriMainDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet"></a>
# **apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet**
> WebApiResponseListPediatriQuestionAnswersDto apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PediatriApi;


PediatriApi apiInstance = new PediatriApi();
Long id = 789L; // Long | 
try {
    WebApiResponseListPediatriQuestionAnswersDto result = apiInstance.apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PediatriApi#apiPediatriGetPediatriQuestionAnswersByPatientInformationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**WebApiResponseListPediatriQuestionAnswersDto**](WebApiResponseListPediatriQuestionAnswersDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPediatriGetPediatriQuestionAnswersListGet"></a>
# **apiPediatriGetPediatriQuestionAnswersListGet**
> WebApiResponseListPediatriQuestionAnswersDto apiPediatriGetPediatriQuestionAnswersListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PediatriApi;


PediatriApi apiInstance = new PediatriApi();
try {
    WebApiResponseListPediatriQuestionAnswersDto result = apiInstance.apiPediatriGetPediatriQuestionAnswersListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PediatriApi#apiPediatriGetPediatriQuestionAnswersListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListPediatriQuestionAnswersDto**](WebApiResponseListPediatriQuestionAnswersDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiPediatriSetPediatriQuestionAnswersPost"></a>
# **apiPediatriSetPediatriQuestionAnswersPost**
> WebApiResponseBoolean apiPediatriSetPediatriQuestionAnswersPost(pediatriQuestionAnswers)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PediatriApi;


PediatriApi apiInstance = new PediatriApi();
List<PediatriQuestionAnswersDto> pediatriQuestionAnswers = Arrays.asList(new PediatriQuestionAnswersDto()); // List<PediatriQuestionAnswersDto> | 
try {
    WebApiResponseBoolean result = apiInstance.apiPediatriSetPediatriQuestionAnswersPost(pediatriQuestionAnswers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PediatriApi#apiPediatriSetPediatriQuestionAnswersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pediatriQuestionAnswers** | [**List&lt;PediatriQuestionAnswersDto&gt;**](PediatriQuestionAnswersDto.md)|  | [optional]

### Return type

[**WebApiResponseBoolean**](WebApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


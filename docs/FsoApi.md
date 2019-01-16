# FsoApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiFsoGetFsoAnswersListGet**](FsoApi.md#apiFsoGetFsoAnswersListGet) | **GET** api/Fso/GetFsoAnswersList | 
[**apiFsoGetFsoListGet**](FsoApi.md#apiFsoGetFsoListGet) | **GET** api/Fso/GetFsoList | 
[**apiFsoGetFsoQuestionAnswersByPatientInformationIdGet**](FsoApi.md#apiFsoGetFsoQuestionAnswersByPatientInformationIdGet) | **GET** api/Fso/GetFsoQuestionAnswersByPatientInformationId | 
[**apiFsoGetFsoQuestionAnswersListGet**](FsoApi.md#apiFsoGetFsoQuestionAnswersListGet) | **GET** api/Fso/GetFsoQuestionAnswersList | 
[**apiFsoSetFsoQuestionAnswersPost**](FsoApi.md#apiFsoSetFsoQuestionAnswersPost) | **POST** api/Fso/SetFsoQuestionAnswers | 


<a name="apiFsoGetFsoAnswersListGet"></a>
# **apiFsoGetFsoAnswersListGet**
> WebApiResponseListFsoAnswersDto apiFsoGetFsoAnswersListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FsoApi;


FsoApi apiInstance = new FsoApi();
try {
    WebApiResponseListFsoAnswersDto result = apiInstance.apiFsoGetFsoAnswersListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsoApi#apiFsoGetFsoAnswersListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListFsoAnswersDto**](WebApiResponseListFsoAnswersDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiFsoGetFsoListGet"></a>
# **apiFsoGetFsoListGet**
> WebApiResponseListFsoMainDto apiFsoGetFsoListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FsoApi;


FsoApi apiInstance = new FsoApi();
try {
    WebApiResponseListFsoMainDto result = apiInstance.apiFsoGetFsoListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsoApi#apiFsoGetFsoListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListFsoMainDto**](WebApiResponseListFsoMainDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiFsoGetFsoQuestionAnswersByPatientInformationIdGet"></a>
# **apiFsoGetFsoQuestionAnswersByPatientInformationIdGet**
> WebApiResponseListFsoQuestionAnswersDto apiFsoGetFsoQuestionAnswersByPatientInformationIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FsoApi;


FsoApi apiInstance = new FsoApi();
Long id = 789L; // Long | 
try {
    WebApiResponseListFsoQuestionAnswersDto result = apiInstance.apiFsoGetFsoQuestionAnswersByPatientInformationIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsoApi#apiFsoGetFsoQuestionAnswersByPatientInformationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**WebApiResponseListFsoQuestionAnswersDto**](WebApiResponseListFsoQuestionAnswersDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiFsoGetFsoQuestionAnswersListGet"></a>
# **apiFsoGetFsoQuestionAnswersListGet**
> WebApiResponseListFsoQuestionAnswersDto apiFsoGetFsoQuestionAnswersListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FsoApi;


FsoApi apiInstance = new FsoApi();
try {
    WebApiResponseListFsoQuestionAnswersDto result = apiInstance.apiFsoGetFsoQuestionAnswersListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsoApi#apiFsoGetFsoQuestionAnswersListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListFsoQuestionAnswersDto**](WebApiResponseListFsoQuestionAnswersDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiFsoSetFsoQuestionAnswersPost"></a>
# **apiFsoSetFsoQuestionAnswersPost**
> WebApiResponseBoolean apiFsoSetFsoQuestionAnswersPost(fsoQuestionAnswers)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FsoApi;


FsoApi apiInstance = new FsoApi();
List<FsoQuestionAnswersDto> fsoQuestionAnswers = Arrays.asList(new FsoQuestionAnswersDto()); // List<FsoQuestionAnswersDto> | 
try {
    WebApiResponseBoolean result = apiInstance.apiFsoSetFsoQuestionAnswersPost(fsoQuestionAnswers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsoApi#apiFsoSetFsoQuestionAnswersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsoQuestionAnswers** | [**List&lt;FsoQuestionAnswersDto&gt;**](FsoQuestionAnswersDto.md)|  | [optional]

### Return type

[**WebApiResponseBoolean**](WebApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


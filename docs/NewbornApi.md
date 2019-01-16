# NewbornApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiNewbornGetNewbornAnswersListGet**](NewbornApi.md#apiNewbornGetNewbornAnswersListGet) | **GET** api/Newborn/GetNewbornAnswersList | 
[**apiNewbornGetNewbornListGet**](NewbornApi.md#apiNewbornGetNewbornListGet) | **GET** api/Newborn/GetNewbornList | 
[**apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet**](NewbornApi.md#apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet) | **GET** api/Newborn/GetNewbornQuestionAnswersByPatientInformationId | 
[**apiNewbornGetNewbornQuestionAnswersListGet**](NewbornApi.md#apiNewbornGetNewbornQuestionAnswersListGet) | **GET** api/Newborn/GetNewbornQuestionAnswersList | 
[**apiNewbornSetNewbornQuestionAnswersPost**](NewbornApi.md#apiNewbornSetNewbornQuestionAnswersPost) | **POST** api/Newborn/SetNewbornQuestionAnswers | 


<a name="apiNewbornGetNewbornAnswersListGet"></a>
# **apiNewbornGetNewbornAnswersListGet**
> WebApiResponseListNewbornAnswerDto apiNewbornGetNewbornAnswersListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewbornApi;


NewbornApi apiInstance = new NewbornApi();
try {
    WebApiResponseListNewbornAnswerDto result = apiInstance.apiNewbornGetNewbornAnswersListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewbornApi#apiNewbornGetNewbornAnswersListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListNewbornAnswerDto**](WebApiResponseListNewbornAnswerDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiNewbornGetNewbornListGet"></a>
# **apiNewbornGetNewbornListGet**
> WebApiResponseListNewbornMainDto apiNewbornGetNewbornListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewbornApi;


NewbornApi apiInstance = new NewbornApi();
try {
    WebApiResponseListNewbornMainDto result = apiInstance.apiNewbornGetNewbornListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewbornApi#apiNewbornGetNewbornListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListNewbornMainDto**](WebApiResponseListNewbornMainDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet"></a>
# **apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet**
> WebApiResponseListNewbornQuestionAnswersDto apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewbornApi;


NewbornApi apiInstance = new NewbornApi();
Long id = 789L; // Long | 
try {
    WebApiResponseListNewbornQuestionAnswersDto result = apiInstance.apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewbornApi#apiNewbornGetNewbornQuestionAnswersByPatientInformationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**WebApiResponseListNewbornQuestionAnswersDto**](WebApiResponseListNewbornQuestionAnswersDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiNewbornGetNewbornQuestionAnswersListGet"></a>
# **apiNewbornGetNewbornQuestionAnswersListGet**
> WebApiResponseListNewbornQuestionAnswersDto apiNewbornGetNewbornQuestionAnswersListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewbornApi;


NewbornApi apiInstance = new NewbornApi();
try {
    WebApiResponseListNewbornQuestionAnswersDto result = apiInstance.apiNewbornGetNewbornQuestionAnswersListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewbornApi#apiNewbornGetNewbornQuestionAnswersListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListNewbornQuestionAnswersDto**](WebApiResponseListNewbornQuestionAnswersDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiNewbornSetNewbornQuestionAnswersPost"></a>
# **apiNewbornSetNewbornQuestionAnswersPost**
> WebApiResponseBoolean apiNewbornSetNewbornQuestionAnswersPost(newbornQuestionAnswers)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewbornApi;


NewbornApi apiInstance = new NewbornApi();
List<NewbornQuestionAnswersDto> newbornQuestionAnswers = Arrays.asList(new NewbornQuestionAnswersDto()); // List<NewbornQuestionAnswersDto> | 
try {
    WebApiResponseBoolean result = apiInstance.apiNewbornSetNewbornQuestionAnswersPost(newbornQuestionAnswers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewbornApi#apiNewbornSetNewbornQuestionAnswersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newbornQuestionAnswers** | [**List&lt;NewbornQuestionAnswersDto&gt;**](NewbornQuestionAnswersDto.md)|  | [optional]

### Return type

[**WebApiResponseBoolean**](WebApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


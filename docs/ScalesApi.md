# ScalesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiScalesGetScalesAnswersListGet**](ScalesApi.md#apiScalesGetScalesAnswersListGet) | **GET** api/Scales/GetScalesAnswersList | 
[**apiScalesGetScalesItakiFallListGet**](ScalesApi.md#apiScalesGetScalesItakiFallListGet) | **GET** api/Scales/GetScalesItakiFallList | 
[**apiScalesGetScalesListGet**](ScalesApi.md#apiScalesGetScalesListGet) | **GET** api/Scales/GetScalesList | 


<a name="apiScalesGetScalesAnswersListGet"></a>
# **apiScalesGetScalesAnswersListGet**
> WebApiResponseListScalesAnswersDto apiScalesGetScalesAnswersListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScalesApi;


ScalesApi apiInstance = new ScalesApi();
try {
    WebApiResponseListScalesAnswersDto result = apiInstance.apiScalesGetScalesAnswersListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScalesApi#apiScalesGetScalesAnswersListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListScalesAnswersDto**](WebApiResponseListScalesAnswersDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiScalesGetScalesItakiFallListGet"></a>
# **apiScalesGetScalesItakiFallListGet**
> WebApiResponseListScalesItakiFallDto apiScalesGetScalesItakiFallListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScalesApi;


ScalesApi apiInstance = new ScalesApi();
try {
    WebApiResponseListScalesItakiFallDto result = apiInstance.apiScalesGetScalesItakiFallListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScalesApi#apiScalesGetScalesItakiFallListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListScalesItakiFallDto**](WebApiResponseListScalesItakiFallDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiScalesGetScalesListGet"></a>
# **apiScalesGetScalesListGet**
> WebApiResponseListScalesDto apiScalesGetScalesListGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScalesApi;


ScalesApi apiInstance = new ScalesApi();
try {
    WebApiResponseListScalesDto result = apiInstance.apiScalesGetScalesListGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScalesApi#apiScalesGetScalesListGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListScalesDto**](WebApiResponseListScalesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


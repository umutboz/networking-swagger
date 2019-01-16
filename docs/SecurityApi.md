# SecurityApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiSecurityApiRegisterPost**](SecurityApi.md#apiSecurityApiRegisterPost) | **POST** api/Security/ApiRegister | 


<a name="apiSecurityApiRegisterPost"></a>
# **apiSecurityApiRegisterPost**
> WebApiResponseApiRegisterResultDto apiSecurityApiRegisterPost(model)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityApi;


SecurityApi apiInstance = new SecurityApi();
ApiRegisterRequestDto model = new ApiRegisterRequestDto(); // ApiRegisterRequestDto | 
try {
    WebApiResponseApiRegisterResultDto result = apiInstance.apiSecurityApiRegisterPost(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#apiSecurityApiRegisterPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**ApiRegisterRequestDto**](ApiRegisterRequestDto.md)|  | [optional]

### Return type

[**WebApiResponseApiRegisterResultDto**](WebApiResponseApiRegisterResultDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


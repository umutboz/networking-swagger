# AccountApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAccountForgotPasswordPost**](AccountApi.md#apiAccountForgotPasswordPost) | **POST** api/Account/ForgotPassword | 
[**apiAccountLoginPost**](AccountApi.md#apiAccountLoginPost) | **POST** api/Account/Login | 
[**apiAccountUserRegisterPost**](AccountApi.md#apiAccountUserRegisterPost) | **POST** api/Account/UserRegister | 


<a name="apiAccountForgotPasswordPost"></a>
# **apiAccountForgotPasswordPost**
> WebApiResponseBoolean apiAccountForgotPasswordPost(loginRequest)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
LoginRequest loginRequest = new LoginRequest(); // LoginRequest | 
try {
    WebApiResponseBoolean result = apiInstance.apiAccountForgotPasswordPost(loginRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#apiAccountForgotPasswordPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginRequest** | [**LoginRequest**](LoginRequest.md)|  | [optional]

### Return type

[**WebApiResponseBoolean**](WebApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAccountLoginPost"></a>
# **apiAccountLoginPost**
> WebApiResponseUserLoginResultDto apiAccountLoginPost(loginRequest)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
LoginRequest loginRequest = new LoginRequest(); // LoginRequest | 
try {
    WebApiResponseUserLoginResultDto result = apiInstance.apiAccountLoginPost(loginRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#apiAccountLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginRequest** | [**LoginRequest**](LoginRequest.md)|  | [optional]

### Return type

[**WebApiResponseUserLoginResultDto**](WebApiResponseUserLoginResultDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAccountUserRegisterPost"></a>
# **apiAccountUserRegisterPost**
> WebApiResponseUserLoginResultDto apiAccountUserRegisterPost(user)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
UserRegisterDto user = new UserRegisterDto(); // UserRegisterDto | 
try {
    WebApiResponseUserLoginResultDto result = apiInstance.apiAccountUserRegisterPost(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#apiAccountUserRegisterPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserRegisterDto**](UserRegisterDto.md)|  | [optional]

### Return type

[**WebApiResponseUserLoginResultDto**](WebApiResponseUserLoginResultDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


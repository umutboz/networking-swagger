# UserCreditApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiUserCreditGetUserCreditTransactionSummaryGet**](UserCreditApi.md#apiUserCreditGetUserCreditTransactionSummaryGet) | **GET** api/UserCredit/GetUserCreditTransactionSummary | 
[**apiUserCreditListUserCreditTransactionsByUserGet**](UserCreditApi.md#apiUserCreditListUserCreditTransactionsByUserGet) | **GET** api/UserCredit/ListUserCreditTransactionsByUser | 
[**apiUserCreditListUserCreditTransactionsGet**](UserCreditApi.md#apiUserCreditListUserCreditTransactionsGet) | **GET** api/UserCredit/ListUserCreditTransactions | 
[**apiUserCreditSetUserCreditTransactionPost**](UserCreditApi.md#apiUserCreditSetUserCreditTransactionPost) | **POST** api/UserCredit/SetUserCreditTransaction | 


<a name="apiUserCreditGetUserCreditTransactionSummaryGet"></a>
# **apiUserCreditGetUserCreditTransactionSummaryGet**
> WebApiResponseUserCreditTransactionSummaryDto apiUserCreditGetUserCreditTransactionSummaryGet(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserCreditApi;


UserCreditApi apiInstance = new UserCreditApi();
Long userId = 789L; // Long | 
try {
    WebApiResponseUserCreditTransactionSummaryDto result = apiInstance.apiUserCreditGetUserCreditTransactionSummaryGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserCreditApi#apiUserCreditGetUserCreditTransactionSummaryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |

### Return type

[**WebApiResponseUserCreditTransactionSummaryDto**](WebApiResponseUserCreditTransactionSummaryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiUserCreditListUserCreditTransactionsByUserGet"></a>
# **apiUserCreditListUserCreditTransactionsByUserGet**
> WebApiResponseListUserCreditTransactionsDto apiUserCreditListUserCreditTransactionsByUserGet(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserCreditApi;


UserCreditApi apiInstance = new UserCreditApi();
Long userId = 789L; // Long | 
try {
    WebApiResponseListUserCreditTransactionsDto result = apiInstance.apiUserCreditListUserCreditTransactionsByUserGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserCreditApi#apiUserCreditListUserCreditTransactionsByUserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**|  |

### Return type

[**WebApiResponseListUserCreditTransactionsDto**](WebApiResponseListUserCreditTransactionsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiUserCreditListUserCreditTransactionsGet"></a>
# **apiUserCreditListUserCreditTransactionsGet**
> WebApiResponseListUserCreditTransactionsDto apiUserCreditListUserCreditTransactionsGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserCreditApi;


UserCreditApi apiInstance = new UserCreditApi();
try {
    WebApiResponseListUserCreditTransactionsDto result = apiInstance.apiUserCreditListUserCreditTransactionsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserCreditApi#apiUserCreditListUserCreditTransactionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebApiResponseListUserCreditTransactionsDto**](WebApiResponseListUserCreditTransactionsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiUserCreditSetUserCreditTransactionPost"></a>
# **apiUserCreditSetUserCreditTransactionPost**
> WebApiResponseUserCreditTransactionsDto apiUserCreditSetUserCreditTransactionPost(model)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserCreditApi;


UserCreditApi apiInstance = new UserCreditApi();
UserCreditTransactionsDto model = new UserCreditTransactionsDto(); // UserCreditTransactionsDto | 
try {
    WebApiResponseUserCreditTransactionsDto result = apiInstance.apiUserCreditSetUserCreditTransactionPost(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserCreditApi#apiUserCreditSetUserCreditTransactionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**UserCreditTransactionsDto**](UserCreditTransactionsDto.md)|  | [optional]

### Return type

[**WebApiResponseUserCreditTransactionsDto**](WebApiResponseUserCreditTransactionsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


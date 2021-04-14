# DefaultApi

All URIs are relative to *https://apis.dnb.no/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**thingsGet**](DefaultApi.md#thingsGet) | **GET** /things | Short summary of the API Operation: ex: Get all things
[**thingsPost**](DefaultApi.md#thingsPost) | **POST** /things | Short summary of the API Operation: ex: Create one thing
[**thingsThingIdDelete**](DefaultApi.md#thingsThingIdDelete) | **DELETE** /things/{thingId} | Short summary of the API Operation: ex: Delete one thing by objectId
[**thingsThingIdGet**](DefaultApi.md#thingsThingIdGet) | **GET** /things/{thingId} | Short summary of the API Operation: ex: Get one thing by objectId
[**thingsThingIdPatch**](DefaultApi.md#thingsThingIdPatch) | **PATCH** /things/{thingId} | Short summary of the API Operation: ex: Update one thing by objectId
[**thingsThingIdSpecialThingGet**](DefaultApi.md#thingsThingIdSpecialThingGet) | **GET** /things/{thingId}/special-thing | Short summary of the API Operation: ex: Get one thing by objectId


<a name="thingsGet"></a>
# **thingsGet**
> List&lt;Thing&gt; thingsGet(xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2, field1)

Short summary of the API Operation: ex: Get all things

Description goes HERE  DNB naming convention: Root resource of API &#x3D; Name of API. Example: http://api.dnb.no/v1/accounts/ &#x3D; Accounts API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String xDNBAPITraceId = "xDNBAPITraceId_example"; // String | UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests.
String xDNBAPICustomHeader = "xDNBAPICustomHeader_example"; // String | Required custom header described
String xDNBAPICustomHeader2 = "xDNBAPICustomHeader2_example"; // String | Optional custom header described
String field1 = "field1_example"; // String | Query string parameter to narrow the list of things based on field1 value.
try {
    List<Thing> result = apiInstance.thingsGet(xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2, field1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#thingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xDNBAPITraceId** | **String**| UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests. |
 **xDNBAPICustomHeader** | **String**| Required custom header described |
 **xDNBAPICustomHeader2** | **String**| Optional custom header described | [optional]
 **field1** | **String**| Query string parameter to narrow the list of things based on field1 value. | [optional]

### Return type

[**List&lt;Thing&gt;**](Thing.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="thingsPost"></a>
# **thingsPost**
> Thing thingsPost(xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2, body)

Short summary of the API Operation: ex: Create one thing

Description goes HERE 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String xDNBAPITraceId = "xDNBAPITraceId_example"; // String | UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests.
String xDNBAPICustomHeader = "xDNBAPICustomHeader_example"; // String | Required custom header described
String xDNBAPICustomHeader2 = "xDNBAPICustomHeader2_example"; // String | Optional custom header described
PostThingRequest body = new PostThingRequest(); // PostThingRequest | Description goes HERE
try {
    Thing result = apiInstance.thingsPost(xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#thingsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xDNBAPITraceId** | **String**| UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests. |
 **xDNBAPICustomHeader** | **String**| Required custom header described |
 **xDNBAPICustomHeader2** | **String**| Optional custom header described | [optional]
 **body** | [**PostThingRequest**](PostThingRequest.md)| Description goes HERE | [optional]

### Return type

[**Thing**](Thing.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="thingsThingIdDelete"></a>
# **thingsThingIdDelete**
> thingsThingIdDelete(thingId, xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2)

Short summary of the API Operation: ex: Delete one thing by objectId

Description goes HERE 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String thingId = "thingId_example"; // String | ID defining a specific Thing.
String xDNBAPITraceId = "xDNBAPITraceId_example"; // String | UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests.
String xDNBAPICustomHeader = "xDNBAPICustomHeader_example"; // String | Required custom header described
String xDNBAPICustomHeader2 = "xDNBAPICustomHeader2_example"; // String | Optional custom header described
try {
    apiInstance.thingsThingIdDelete(thingId, xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#thingsThingIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thingId** | **String**| ID defining a specific Thing. |
 **xDNBAPITraceId** | **String**| UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests. |
 **xDNBAPICustomHeader** | **String**| Required custom header described |
 **xDNBAPICustomHeader2** | **String**| Optional custom header described | [optional]

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="thingsThingIdGet"></a>
# **thingsThingIdGet**
> Thing thingsThingIdGet(thingId, xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2)

Short summary of the API Operation: ex: Get one thing by objectId

Description goes HERE 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String thingId = "thingId_example"; // String | ID defining a specific Thing.
String xDNBAPITraceId = "xDNBAPITraceId_example"; // String | UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests.
String xDNBAPICustomHeader = "xDNBAPICustomHeader_example"; // String | Required custom header described
String xDNBAPICustomHeader2 = "xDNBAPICustomHeader2_example"; // String | Optional custom header described
try {
    Thing result = apiInstance.thingsThingIdGet(thingId, xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#thingsThingIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thingId** | **String**| ID defining a specific Thing. |
 **xDNBAPITraceId** | **String**| UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests. |
 **xDNBAPICustomHeader** | **String**| Required custom header described |
 **xDNBAPICustomHeader2** | **String**| Optional custom header described | [optional]

### Return type

[**Thing**](Thing.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="thingsThingIdPatch"></a>
# **thingsThingIdPatch**
> Thing thingsThingIdPatch(thingId, xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2, body)

Short summary of the API Operation: ex: Update one thing by objectId

Description goes HERE 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String thingId = "thingId_example"; // String | ID defining a specific Thing.
String xDNBAPITraceId = "xDNBAPITraceId_example"; // String | UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests.
String xDNBAPICustomHeader = "xDNBAPICustomHeader_example"; // String | Required custom header described
String xDNBAPICustomHeader2 = "xDNBAPICustomHeader2_example"; // String | Optional custom header described
PatchThingRequest body = new PatchThingRequest(); // PatchThingRequest | Description goes HERE
try {
    Thing result = apiInstance.thingsThingIdPatch(thingId, xDNBAPITraceId, xDNBAPICustomHeader, xDNBAPICustomHeader2, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#thingsThingIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thingId** | **String**| ID defining a specific Thing. |
 **xDNBAPITraceId** | **String**| UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests. |
 **xDNBAPICustomHeader** | **String**| Required custom header described |
 **xDNBAPICustomHeader2** | **String**| Optional custom header described | [optional]
 **body** | [**PatchThingRequest**](PatchThingRequest.md)| Description goes HERE | [optional]

### Return type

[**Thing**](Thing.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="thingsThingIdSpecialThingGet"></a>
# **thingsThingIdSpecialThingGet**
> Thing thingsThingIdSpecialThingGet(xDNBAPITraceId, xDNBAPICustomHeader, thingId, xDNBAPICustomHeader2)

Short summary of the API Operation: ex: Get one thing by objectId

Description goes HERE 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String xDNBAPITraceId = "xDNBAPITraceId_example"; // String | UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests.
String xDNBAPICustomHeader = "xDNBAPICustomHeader_example"; // String | Required custom header described
String thingId = "thingId_example"; // String | ID defining a specific Thing.
String xDNBAPICustomHeader2 = "xDNBAPICustomHeader2_example"; // String | Optional custom header described
try {
    Thing result = apiInstance.thingsThingIdSpecialThingGet(xDNBAPITraceId, xDNBAPICustomHeader, thingId, xDNBAPICustomHeader2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#thingsThingIdSpecialThingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xDNBAPITraceId** | **String**| UUID (Universally Unique Identifier) version 4  Custom correlation-id to be able to correlate request / response. By logging this value on the client, server and any backing services, it provides a mechanism to trace, diagnose and debug requests. |
 **xDNBAPICustomHeader** | **String**| Required custom header described |
 **thingId** | **String**| ID defining a specific Thing. |
 **xDNBAPICustomHeader2** | **String**| Optional custom header described | [optional]

### Return type

[**Thing**](Thing.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


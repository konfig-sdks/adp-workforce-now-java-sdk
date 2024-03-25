# TokenRequestApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWithAuthorizationHeader**](TokenRequestApi.md#createWithAuthorizationHeader) | **POST** /auth/oauth/v2/token | Token Request (Authorization Header) |


<a name="createWithAuthorizationHeader"></a>
# **createWithAuthorizationHeader**
> createWithAuthorizationHeader().grantType(grantType).clientId(clientId).clientSecret(clientSecret).body(body).execute();

Token Request (Authorization Header)

A request to get an OAuth bearer token for our demo ADP Workforce Now by adding an Authorization header containing the base-64 encoded credentials.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AdpWorkforceNow;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenRequestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://}";
    AdpWorkforceNow client = new AdpWorkforceNow(configuration);
    String grantType = "client_credentials";
    String clientId = "{{client-id}}";
    String clientSecret = "{{client-secret}}";
    try {
      client
              .tokenRequest
              .createWithAuthorizationHeader()
              .grantType(grantType)
              .clientId(clientId)
              .clientSecret(clientSecret)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenRequestApi#createWithAuthorizationHeader");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tokenRequest
              .createWithAuthorizationHeader()
              .grantType(grantType)
              .clientId(clientId)
              .clientSecret(clientSecret)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenRequestApi#createWithAuthorizationHeader");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | **String**|  | [optional] |
| **clientId** | **String**|  | [optional] |
| **clientSecret** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


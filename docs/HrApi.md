# HrApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkAsyncRequestStatus**](HrApi.md#checkAsyncRequestStatus) | **GET** /core/v1/operations/workerInformationManagement/hr.v2.workers/{key} | Worker V2 (Check Async Request Status) |
| [**getWorkerByAoid**](HrApi.md#getWorkerByAoid) | **GET** /hr/v2/workers/{anthony-albright-aoid} | Worker V2 (Single by AOID) |
| [**getWorkerDemographicsByAoid**](HrApi.md#getWorkerDemographicsByAoid) | **GET** /hr/v2/worker-demographics/{anthony-albright-aoid} | Worker Demographics V2 (Single by AOID) |
| [**listTop5PreventCache**](HrApi.md#listTop5PreventCache) | **GET** /hr/v2/workers | Worker V2 (List with Top 5 and Prevent Cache) |
| [**listTop5PreventCache_0**](HrApi.md#listTop5PreventCache_0) | **GET** /hr/v2/worker-demographics | Worker Demographics V2 (List with Top 5 and Prevent Cache) |


<a name="checkAsyncRequestStatus"></a>
# **checkAsyncRequestStatus**
> checkAsyncRequestStatus(key).$select($select).body(body).execute();

Worker V2 (Check Async Request Status)

Check the status of an async request to the Worker API given the key returned as part of the original asyn response&#39;s \&quot;link\&quot; header.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AdpWorkforceNow;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HrApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://}";
    AdpWorkforceNow client = new AdpWorkforceNow(configuration);
    String key = "key_example";
    String $select = "processingStatus";
    try {
      client
              .hr
              .checkAsyncRequestStatus(key)
              .$select($select)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#checkAsyncRequestStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hr
              .checkAsyncRequestStatus(key)
              .$select($select)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#checkAsyncRequestStatus");
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
| **key** | **String**|  | |
| **$select** | **String**|  | [optional] |
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

<a name="getWorkerByAoid"></a>
# **getWorkerByAoid**
> getWorkerByAoid(anthonyAlbrightAoid).preventCache(preventCache).body(body).execute();

Worker V2 (Single by AOID)

Request a single worker given their AOID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AdpWorkforceNow;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HrApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://}";
    AdpWorkforceNow client = new AdpWorkforceNow(configuration);
    String anthonyAlbrightAoid = "anthonyAlbrightAoid_example";
    String preventCache = "TIMESTAMP";
    try {
      client
              .hr
              .getWorkerByAoid(anthonyAlbrightAoid)
              .preventCache(preventCache)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#getWorkerByAoid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hr
              .getWorkerByAoid(anthonyAlbrightAoid)
              .preventCache(preventCache)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#getWorkerByAoid");
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
| **anthonyAlbrightAoid** | **String**|  | |
| **preventCache** | **String**|  | [optional] |
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

<a name="getWorkerDemographicsByAoid"></a>
# **getWorkerDemographicsByAoid**
> getWorkerDemographicsByAoid(anthonyAlbrightAoid).preventCache(preventCache).body(body).execute();

Worker Demographics V2 (Single by AOID)

Request demographic data for a single worker given their AOID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AdpWorkforceNow;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HrApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://}";
    AdpWorkforceNow client = new AdpWorkforceNow(configuration);
    String anthonyAlbrightAoid = "anthonyAlbrightAoid_example";
    String preventCache = "TIMESTAMP";
    try {
      client
              .hr
              .getWorkerDemographicsByAoid(anthonyAlbrightAoid)
              .preventCache(preventCache)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#getWorkerDemographicsByAoid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hr
              .getWorkerDemographicsByAoid(anthonyAlbrightAoid)
              .preventCache(preventCache)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#getWorkerDemographicsByAoid");
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
| **anthonyAlbrightAoid** | **String**|  | |
| **preventCache** | **String**|  | [optional] |
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

<a name="listTop5PreventCache"></a>
# **listTop5PreventCache**
> listTop5PreventCache().$top($top).preventCache(preventCache).$filter($filter).body(body).execute();

Worker V2 (List with Top 5 and Prevent Cache)

Request a collection of the top 5 workers using a URI cache-buster.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AdpWorkforceNow;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HrApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://}";
    AdpWorkforceNow client = new AdpWorkforceNow(configuration);
    String $top = "5";
    String preventCache = "TIMESTAMP";
    String $filter = "workers/workAssignments/homeOrganizationalUnits/typeCode/codeValue eq 'Department' and workers/workAssignments/homeOrganizationalUnits/nameCode/codeValue eq '001000'";
    try {
      client
              .hr
              .listTop5PreventCache()
              .$top($top)
              .preventCache(preventCache)
              .$filter($filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#listTop5PreventCache");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hr
              .listTop5PreventCache()
              .$top($top)
              .preventCache(preventCache)
              .$filter($filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#listTop5PreventCache");
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
| **$top** | **String**|  | [optional] |
| **preventCache** | **String**|  | [optional] |
| **$filter** | **String**|  | [optional] |
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

<a name="listTop5PreventCache_0"></a>
# **listTop5PreventCache_0**
> listTop5PreventCache_0().$top($top).preventCache(preventCache).$filter($filter).body(body).execute();

Worker Demographics V2 (List with Top 5 and Prevent Cache)

Request demographic data for a collection of the top 5 workers using a URI cache-buster.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AdpWorkforceNow;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HrApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://}";
    AdpWorkforceNow client = new AdpWorkforceNow(configuration);
    String $top = "5";
    String preventCache = "TIMESTAMP";
    String $filter = "workers/workAssignments/homeOrganizationalUnits/typeCode/codeValue eq 'Department' and workers/workAssignments/homeOrganizationalUnits/nameCode/codeValue eq '001000'";
    try {
      client
              .hr
              .listTop5PreventCache_0()
              .$top($top)
              .preventCache(preventCache)
              .$filter($filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#listTop5PreventCache_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hr
              .listTop5PreventCache_0()
              .$top($top)
              .preventCache(preventCache)
              .$filter($filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HrApi#listTop5PreventCache_0");
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
| **$top** | **String**|  | [optional] |
| **preventCache** | **String**|  | [optional] |
| **$filter** | **String**|  | [optional] |
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


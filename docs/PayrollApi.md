# PayrollApi

All URIs are relative to *http://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listPayrollOutputs**](PayrollApi.md#listPayrollOutputs) | **GET** /payroll/v1/payroll-output | Payroll Outputs V1 (List for Region / Company Code / Year / Week) |


<a name="listPayrollOutputs"></a>
# **listPayrollOutputs**
> listPayrollOutputs().$filter($filter).$count($count).useCache(useCache).level(level).$select($select).body(body).execute();

Payroll Outputs V1 (List for Region / Company Code / Year / Week)

Fetches a list of payroll outputs given a Region Code, Company Code, Year and Week.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AdpWorkforceNow;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://}";
    AdpWorkforceNow client = new AdpWorkforceNow(configuration);
    String $filter = "payrollScheduleReference/payrollYear eq 2018 and payrollScheduleReference/payrollWeekNumber eq 10 and payrollGroupCode/codeValue eq %26Y%26 and payrollRegionCode/codeValue eq BALT";
    String $count = "true";
    String useCache = "false";
    String level = "details";
    String $select = "earnings,reportableEarningsAndBenefits,reimbursements,statutoryDeductions,nonStatutoryDeductions,memos,configurationTags";
    try {
      client
              .payroll
              .listPayrollOutputs()
              .$filter($filter)
              .$count($count)
              .useCache(useCache)
              .level(level)
              .$select($select)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#listPayrollOutputs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .listPayrollOutputs()
              .$filter($filter)
              .$count($count)
              .useCache(useCache)
              .level(level)
              .$select($select)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#listPayrollOutputs");
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
| **$filter** | **String**|  | [optional] |
| **$count** | **String**|  | [optional] |
| **useCache** | **String**|  | [optional] |
| **level** | **String**|  | [optional] |
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


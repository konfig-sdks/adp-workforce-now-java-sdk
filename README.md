<div align="center">

[![Visit Adp](./header.png)](https://adp.com)

# [Adp](https://adp.com)

ADP API endpoints.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=ADP&serviceName=WorkforceNow&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>adp-workforce-now-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:adp-workforce-now-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/adp-workforce-now-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://}*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*HrApi* | [**checkAsyncRequestStatus**](docs/HrApi.md#checkAsyncRequestStatus) | **GET** /core/v1/operations/workerInformationManagement/hr.v2.workers/{key} | Worker V2 (Check Async Request Status)
*HrApi* | [**getWorkerByAoid**](docs/HrApi.md#getWorkerByAoid) | **GET** /hr/v2/workers/{anthony-albright-aoid} | Worker V2 (Single by AOID)
*HrApi* | [**getWorkerDemographicsByAoid**](docs/HrApi.md#getWorkerDemographicsByAoid) | **GET** /hr/v2/worker-demographics/{anthony-albright-aoid} | Worker Demographics V2 (Single by AOID)
*HrApi* | [**listTop5PreventCache**](docs/HrApi.md#listTop5PreventCache) | **GET** /hr/v2/workers | Worker V2 (List with Top 5 and Prevent Cache)
*HrApi* | [**listTop5PreventCache_0**](docs/HrApi.md#listTop5PreventCache_0) | **GET** /hr/v2/worker-demographics | Worker Demographics V2 (List with Top 5 and Prevent Cache)
*PayrollApi* | [**listPayrollOutputs**](docs/PayrollApi.md#listPayrollOutputs) | **GET** /payroll/v1/payroll-output | Payroll Outputs V1 (List for Region / Company Code / Year / Week)
*TokenRequestApi* | [**createWithAuthorizationHeader**](docs/TokenRequestApi.md#createWithAuthorizationHeader) | **POST** /auth/oauth/v2/token | Token Request (Authorization Header)


## Documentation for Models



## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

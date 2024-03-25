/*
 * ADP APIs
 * ADP API endpoints.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TokenRequestApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TokenRequestApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TokenRequestApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createWithAuthorizationHeaderCall(String grantType, String clientId, String clientSecret, Object body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/auth/oauth/v2/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (grantType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("grant_type", grantType));
        }

        if (clientId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("client_id", clientId));
        }

        if (clientSecret != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("client_secret", clientSecret));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/octet-stream"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createWithAuthorizationHeaderValidateBeforeCall(String grantType, String clientId, String clientSecret, Object body, final ApiCallback _callback) throws ApiException {
        return createWithAuthorizationHeaderCall(grantType, clientId, clientSecret, body, _callback);

    }


    private ApiResponse<Void> createWithAuthorizationHeaderWithHttpInfo(String grantType, String clientId, String clientSecret, Object body) throws ApiException {
        okhttp3.Call localVarCall = createWithAuthorizationHeaderValidateBeforeCall(grantType, clientId, clientSecret, body, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call createWithAuthorizationHeaderAsync(String grantType, String clientId, String clientSecret, Object body, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createWithAuthorizationHeaderValidateBeforeCall(grantType, clientId, clientSecret, body, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class CreateWithAuthorizationHeaderRequestBuilder {
        private String grantType;
        private String clientId;
        private String clientSecret;
        private Object body;

        private CreateWithAuthorizationHeaderRequestBuilder() {
        }

        /**
         * Set body
         * @param body  (optional)
         * @return CreateWithAuthorizationHeaderRequestBuilder
         */
        public CreateWithAuthorizationHeaderRequestBuilder body(Object body) {
            this.body = body;
            return this;
        }

        /**
         * Set grantType
         * @param grantType  (optional)
         * @return CreateWithAuthorizationHeaderRequestBuilder
         */
        public CreateWithAuthorizationHeaderRequestBuilder grantType(String grantType) {
            this.grantType = grantType;
            return this;
        }
        
        /**
         * Set clientId
         * @param clientId  (optional)
         * @return CreateWithAuthorizationHeaderRequestBuilder
         */
        public CreateWithAuthorizationHeaderRequestBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        
        /**
         * Set clientSecret
         * @param clientSecret  (optional)
         * @return CreateWithAuthorizationHeaderRequestBuilder
         */
        public CreateWithAuthorizationHeaderRequestBuilder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        
        /**
         * Build call for createWithAuthorizationHeader
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            Object body = buildBodyParams();
            return createWithAuthorizationHeaderCall(grantType, clientId, clientSecret, body, _callback);
        }

        private Object buildBodyParams() {
            return this.body;
        }

        /**
         * Execute createWithAuthorizationHeader request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            Object body = buildBodyParams();
            createWithAuthorizationHeaderWithHttpInfo(grantType, clientId, clientSecret, body);
        }

        /**
         * Execute createWithAuthorizationHeader request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            Object body = buildBodyParams();
            return createWithAuthorizationHeaderWithHttpInfo(grantType, clientId, clientSecret, body);
        }

        /**
         * Execute createWithAuthorizationHeader request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            Object body = buildBodyParams();
            return createWithAuthorizationHeaderAsync(grantType, clientId, clientSecret, body, _callback);
        }
    }

    /**
     * Token Request (Authorization Header)
     * A request to get an OAuth bearer token for our demo ADP Workforce Now by adding an Authorization header containing the base-64 encoded credentials.
     * @return CreateWithAuthorizationHeaderRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public CreateWithAuthorizationHeaderRequestBuilder createWithAuthorizationHeader() throws IllegalArgumentException {
        return new CreateWithAuthorizationHeaderRequestBuilder();
    }
}
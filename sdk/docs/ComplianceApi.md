# ComplianceApi

All URIs are relative to *https://www.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteComplianceRule**](ComplianceApi.md#deleteComplianceRule) | **DELETE** /api/compliance/rules/{scope}/{code} | [EXPERIMENTAL] DeleteComplianceRule: Deletes a compliance rule.
[**getBreachedOrdersInfo**](ComplianceApi.md#getBreachedOrdersInfo) | **GET** /api/compliance/runs/breached/{runId} | [EXPERIMENTAL] GetBreachedOrdersInfo: Get the Ids of Breached orders in a given compliance run and the corresponding list of rules that could have caused it.
[**getComplianceRule**](ComplianceApi.md#getComplianceRule) | **GET** /api/compliance/rules/{scope}/{code} | [EXPERIMENTAL] GetComplianceRule: Retrieve the definition of single compliance rule.
[**getComplianceRunResults**](ComplianceApi.md#getComplianceRunResults) | **GET** /api/compliance/runs/{runId} | [EXPERIMENTAL] GetComplianceRunResults: Get the details of a single compliance run.
[**listComplianceRules**](ComplianceApi.md#listComplianceRules) | **GET** /api/compliance/rules | [EXPERIMENTAL] ListComplianceRules: List compliance rules, with optional filtering.
[**listComplianceRunInfo**](ComplianceApi.md#listComplianceRunInfo) | **GET** /api/compliance/runs | [EXPERIMENTAL] ListComplianceRunInfo: List historical compliance run ids.
[**runCompliance**](ComplianceApi.md#runCompliance) | **POST** /api/compliance/runs | [EXPERIMENTAL] RunCompliance: Kick off the compliance check process
[**upsertComplianceRules**](ComplianceApi.md#upsertComplianceRules) | **POST** /api/compliance/rules | [EXPERIMENTAL] UpsertComplianceRules: Upsert compliance rules.


<a name="deleteComplianceRule"></a>
# **deleteComplianceRule**
> DeletedEntityResponse deleteComplianceRule(scope, code)

[EXPERIMENTAL] DeleteComplianceRule: Deletes a compliance rule.

Deletes the rule for all effective time.                The rule will remain viewable at previous as at times, and as part of the results of compliance runs, but it  will no longer be considered in new compliance runs.                This cannot be undone.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String scope = "scope_example"; // String | The compliance rule scope.
    String code = "code_example"; // String | The compliance rule code.
    try {
      DeletedEntityResponse result = apiInstance.deleteComplianceRule(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#deleteComplianceRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The compliance rule scope. |
 **code** | **String**| The compliance rule code. |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getBreachedOrdersInfo"></a>
# **getBreachedOrdersInfo**
> ResourceListOfComplianceBreachedOrderInfo getBreachedOrdersInfo(runId, orderScope, orderCode, limit)

[EXPERIMENTAL] GetBreachedOrdersInfo: Get the Ids of Breached orders in a given compliance run and the corresponding list of rules that could have caused it.

Use this endpoint to get a list or breached orders and the set of rules that may have caused the breach.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String runId = "runId_example"; // String | The RunId that the results should be checked for
    String orderScope = "orderScope_example"; // String | Optional. Find rules related to a specific order by providing an Order Scope/Code combination
    String orderCode = "orderCode_example"; // String | Optional. Find rules related to a specific order by providing an Order Scope/Code combination
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    try {
      ResourceListOfComplianceBreachedOrderInfo result = apiInstance.getBreachedOrdersInfo(runId, orderScope, orderCode, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getBreachedOrdersInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **String**| The RunId that the results should be checked for |
 **orderScope** | **String**| Optional. Find rules related to a specific order by providing an Order Scope/Code combination | [optional]
 **orderCode** | **String**| Optional. Find rules related to a specific order by providing an Order Scope/Code combination | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional]

### Return type

[**ResourceListOfComplianceBreachedOrderInfo**](ResourceListOfComplianceBreachedOrderInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The potentially breached orders and their rules from a specific compliance run |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getComplianceRule"></a>
# **getComplianceRule**
> ComplianceRule getComplianceRule(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetComplianceRule: Retrieve the definition of single compliance rule.

Retrieves the compliance rule definition at the given effective and as at times.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String scope = "scope_example"; // String | The compliance rule scope.
    String code = "code_example"; // String | The compliance rule code.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definition. Defaults to the current LUSID  system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified.
    try {
      ComplianceRule result = apiInstance.getComplianceRule(scope, code, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getComplianceRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The compliance rule scope. |
 **code** | **String**| The compliance rule code. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the rule definition. Defaults to the current LUSID  system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified. | [optional]

### Return type

[**ComplianceRule**](ComplianceRule.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Details of one compliance rule. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getComplianceRunResults"></a>
# **getComplianceRunResults**
> ResourceListOfComplianceRuleResult getComplianceRunResults(runId, page, limit, filter)

[EXPERIMENTAL] GetComplianceRunResults: Get the details of a single compliance run.

Use this endpoint to fetch the detail associated with a specific compliance run, including a breakdown  of the passing state of each rule, portfolio combination.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String runId = "runId_example"; // String | The unique identifier of the compliance run requested.
    String page = "page_example"; // String | The pagination token to use to continue listing compliance rule results from a previous call to list compliance rule result.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfComplianceRuleResult result = apiInstance.getComplianceRunResults(runId, page, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getComplianceRunResults");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runId** | **String**| The unique identifier of the compliance run requested. |
 **page** | **String**| The pagination token to use to continue listing compliance rule results from a previous call to list compliance rule result.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**ResourceListOfComplianceRuleResult**](ResourceListOfComplianceRuleResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The rule results of a specific compliance run |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listComplianceRules"></a>
# **listComplianceRules**
> ResourceListOfComplianceRule listComplianceRules(effectiveAt, asAt, page, limit, filter)

[EXPERIMENTAL] ListComplianceRules: List compliance rules, with optional filtering.

For more information about filtering results,  see https://support.lusid.com/knowledgebase/article/KA-01914.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definitions. Defaults to the current LUSID  system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified.
    String page = "page_example"; // String | The pagination token to use to continue listing entities; this value is returned from the previous call. If  a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the  original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.
    try {
      ResourceListOfComplianceRule result = apiInstance.listComplianceRules(effectiveAt, asAt, page, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#listComplianceRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the rule definitions. Defaults to the current LUSID  system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing entities; this value is returned from the previous call. If  a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the  original request. | [optional]
 **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional]
 **filter** | **String**| Expression to filter the results. | [optional]

### Return type

[**ResourceListOfComplianceRule**](ResourceListOfComplianceRule.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A filtered list of compliance rules available. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listComplianceRunInfo"></a>
# **listComplianceRunInfo**
> ResourceListOfComplianceRunInfo listComplianceRunInfo(asAt, page, limit, filter)

[EXPERIMENTAL] ListComplianceRunInfo: List historical compliance run ids.

Use this endpoint to fetch a list of all historical compliance runs.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The time at which to get results from. Default : latest
    String page = "page_example"; // String | The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfComplianceRunInfo result = apiInstance.listComplianceRunInfo(asAt, page, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#listComplianceRunInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| Optional. The time at which to get results from. Default : latest | [optional]
 **page** | **String**| The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**ResourceListOfComplianceRunInfo**](ResourceListOfComplianceRunInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The List of IDs and information for all compliance runs completed |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="runCompliance"></a>
# **runCompliance**
> ComplianceRunInfo runCompliance(isPreTrade, recipeIdScope, recipeIdCode, byTaxlots)

[EXPERIMENTAL] RunCompliance: Kick off the compliance check process

Use this endpoint to fetch the start a compliance run, based on a pre-set mapping file.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    Boolean isPreTrade = true; // Boolean | Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false
    String recipeIdScope = "recipeIdScope_example"; // String | Required: the scope of the recipe to be used
    String recipeIdCode = "recipeIdCode_example"; // String | Optional: The code of the recipe to be used. If left blank, the default recipe will be used.
    Boolean byTaxlots = true; // Boolean | Optional.
    try {
      ComplianceRunInfo result = apiInstance.runCompliance(isPreTrade, recipeIdScope, recipeIdCode, byTaxlots);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#runCompliance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isPreTrade** | **Boolean**| Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false |
 **recipeIdScope** | **String**| Required: the scope of the recipe to be used |
 **recipeIdCode** | **String**| Optional: The code of the recipe to be used. If left blank, the default recipe will be used. | [optional]
 **byTaxlots** | **Boolean**| Optional. | [optional]

### Return type

[**ComplianceRunInfo**](ComplianceRunInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The identifying information of a compliance run |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertComplianceRules"></a>
# **upsertComplianceRules**
> ComplianceRuleUpsertResponse upsertComplianceRules(requestBody, effectiveAt)

[EXPERIMENTAL] UpsertComplianceRules: Upsert compliance rules.

To upsert a new rule, the code field must be left empty, a code will then be assigned and returned as part  of the response. To update an existing rule, include the rule code. It is possible to both create and update  compliance rules in the same request.                The upsert is transactional - either all create/update operations will succeed or none of them will.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    Map<String, ComplianceRuleUpsertRequest> requestBody = new HashMap(); // Map<String, ComplianceRuleUpsertRequest> | A dictionary of upsert request identifiers to rule upsert requests. The request               identifiers are valid for the request only and can be used to link the upserted compliance rule to the code               of a created compliance rule.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition.
    try {
      ComplianceRuleUpsertResponse result = apiInstance.upsertComplianceRules(requestBody, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#upsertComplianceRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**Map&lt;String, ComplianceRuleUpsertRequest&gt;**](ComplianceRuleUpsertRequest.md)| A dictionary of upsert request identifiers to rule upsert requests. The request               identifiers are valid for the request only and can be used to link the upserted compliance rule to the code               of a created compliance rule. |
 **effectiveAt** | **String**| The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition. | [optional]

### Return type

[**ComplianceRuleUpsertResponse**](ComplianceRuleUpsertResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Upsert compliance rules. New compliance rules must have an empty code field. Where a codeis given, this rule must already exist and will be updated. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |


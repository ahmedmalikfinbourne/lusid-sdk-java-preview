/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | | <a name=\"791\">791</a>|Custom Entity definition already exists|  | | <a name=\"792\">792</a>|Compliance PropertyKey is missing.|  | | <a name=\"793\">793</a>|Compliance Criteria Value for matching is missing.|  | | <a name=\"800\">800</a>|Can not upsert an instrument event of this type.|  | | <a name=\"801\">801</a>|The instrument event does not exist.|  | | <a name=\"802\">802</a>|The Instrument event is missing salient information.|  | | <a name=\"803\">803</a>|The Instrument event could not be processed.|  | 
 *
 * The version of the OpenAPI document: 0.11.4507
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiCallback;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.ApiResponse;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.Pair;
import com.finbourne.lusid.ProgressRequestBody;
import com.finbourne.lusid.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.lusid.model.ComplianceRule;
import com.finbourne.lusid.model.ComplianceRuleUpsertRequest;
import com.finbourne.lusid.model.ComplianceRuleUpsertResponse;
import com.finbourne.lusid.model.ComplianceRun;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.ResourceListOfComplianceRule;
import com.finbourne.lusid.model.ResourceListOfComplianceRuleResult;
import com.finbourne.lusid.model.ResourceListOfComplianceRun;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplianceApi {
    private ApiClient localVarApiClient;
    public ComplianceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ComplianceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteComplianceRule
     * @param scope The compliance rule scope. (required)
     * @param code The compliance rule code. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteComplianceRuleCall(String scope, String code, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/compliance/rules/{scope}/{code}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4507");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteComplianceRuleValidateBeforeCall(String scope, String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteComplianceRule(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteComplianceRule(Async)");
        }
        

        okhttp3.Call localVarCall = deleteComplianceRuleCall(scope, code, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] DeleteComplianceRule: Deletes a compliance rule.
     * Deletes the rule for all effective time.                The rule will remain viewable at previous as at times, and as part of the results of compliance runs, but it  will no longer be considered in new compliance runs.                This cannot be undone.
     * @param scope The compliance rule scope. (required)
     * @param code The compliance rule code. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteComplianceRule(String scope, String code) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteComplianceRuleWithHttpInfo(scope, code);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] DeleteComplianceRule: Deletes a compliance rule.
     * Deletes the rule for all effective time.                The rule will remain viewable at previous as at times, and as part of the results of compliance runs, but it  will no longer be considered in new compliance runs.                This cannot be undone.
     * @param scope The compliance rule scope. (required)
     * @param code The compliance rule code. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteComplianceRuleWithHttpInfo(String scope, String code) throws ApiException {
        okhttp3.Call localVarCall = deleteComplianceRuleValidateBeforeCall(scope, code, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] DeleteComplianceRule: Deletes a compliance rule. (asynchronously)
     * Deletes the rule for all effective time.                The rule will remain viewable at previous as at times, and as part of the results of compliance runs, but it  will no longer be considered in new compliance runs.                This cannot be undone.
     * @param scope The compliance rule scope. (required)
     * @param code The compliance rule code. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteComplianceRuleAsync(String scope, String code, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteComplianceRuleValidateBeforeCall(scope, code, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getComplianceRule
     * @param scope The compliance rule scope. (required)
     * @param code The compliance rule code. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the rule definition. Defaults to the current LUSID  system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Details of one compliance rule. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getComplianceRuleCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/compliance/rules/{scope}/{code}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4507");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getComplianceRuleValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getComplianceRule(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getComplianceRule(Async)");
        }
        

        okhttp3.Call localVarCall = getComplianceRuleCall(scope, code, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] GetComplianceRule: Retrieve the definition of single compliance rule.
     * Retrieves the compliance rule definition at the given effective and as at times.
     * @param scope The compliance rule scope. (required)
     * @param code The compliance rule code. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the rule definition. Defaults to the current LUSID  system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified. (optional)
     * @return ComplianceRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Details of one compliance rule. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ComplianceRule getComplianceRule(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<ComplianceRule> localVarResp = getComplianceRuleWithHttpInfo(scope, code, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetComplianceRule: Retrieve the definition of single compliance rule.
     * Retrieves the compliance rule definition at the given effective and as at times.
     * @param scope The compliance rule scope. (required)
     * @param code The compliance rule code. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the rule definition. Defaults to the current LUSID  system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified. (optional)
     * @return ApiResponse&lt;ComplianceRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Details of one compliance rule. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ComplianceRule> getComplianceRuleWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getComplianceRuleValidateBeforeCall(scope, code, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<ComplianceRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetComplianceRule: Retrieve the definition of single compliance rule. (asynchronously)
     * Retrieves the compliance rule definition at the given effective and as at times.
     * @param scope The compliance rule scope. (required)
     * @param code The compliance rule code. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the rule definition. Defaults to the current LUSID  system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Details of one compliance rule. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getComplianceRuleAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<ComplianceRule> _callback) throws ApiException {
        okhttp3.Call localVarCall = getComplianceRuleValidateBeforeCall(scope, code, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<ComplianceRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getComplianceRunResults
     * @param runId The unique identifier of the compliance run requested. (required)
     * @param page The pagination token to use to continue listing compliance rule results from a previous call to list compliance rule result.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The rule results of a specific compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getComplianceRunResultsCall(String runId, String page, Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/compliance/runs/{runId}"
            .replaceAll("\\{" + "runId" + "\\}", localVarApiClient.escapeString(runId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4507");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getComplianceRunResultsValidateBeforeCall(String runId, String page, Integer limit, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'runId' is set
        if (runId == null) {
            throw new ApiException("Missing the required parameter 'runId' when calling getComplianceRunResults(Async)");
        }
        

        okhttp3.Call localVarCall = getComplianceRunResultsCall(runId, page, limit, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] GetComplianceRunResults: Get the details of a single compliance run.
     * Use this endpoint to fetch the detail associated with a specific compliance run, including a breakdown  of the passing state of each rule, portfolio combination.
     * @param runId The unique identifier of the compliance run requested. (required)
     * @param page The pagination token to use to continue listing compliance rule results from a previous call to list compliance rule result.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @return ResourceListOfComplianceRuleResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The rule results of a specific compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfComplianceRuleResult getComplianceRunResults(String runId, String page, Integer limit) throws ApiException {
        ApiResponse<ResourceListOfComplianceRuleResult> localVarResp = getComplianceRunResultsWithHttpInfo(runId, page, limit);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetComplianceRunResults: Get the details of a single compliance run.
     * Use this endpoint to fetch the detail associated with a specific compliance run, including a breakdown  of the passing state of each rule, portfolio combination.
     * @param runId The unique identifier of the compliance run requested. (required)
     * @param page The pagination token to use to continue listing compliance rule results from a previous call to list compliance rule result.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @return ApiResponse&lt;ResourceListOfComplianceRuleResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The rule results of a specific compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfComplianceRuleResult> getComplianceRunResultsWithHttpInfo(String runId, String page, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = getComplianceRunResultsValidateBeforeCall(runId, page, limit, null);
        Type localVarReturnType = new TypeToken<ResourceListOfComplianceRuleResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetComplianceRunResults: Get the details of a single compliance run. (asynchronously)
     * Use this endpoint to fetch the detail associated with a specific compliance run, including a breakdown  of the passing state of each rule, portfolio combination.
     * @param runId The unique identifier of the compliance run requested. (required)
     * @param page The pagination token to use to continue listing compliance rule results from a previous call to list compliance rule result.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The rule results of a specific compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getComplianceRunResultsAsync(String runId, String page, Integer limit, final ApiCallback<ResourceListOfComplianceRuleResult> _callback) throws ApiException {
        okhttp3.Call localVarCall = getComplianceRunResultsValidateBeforeCall(runId, page, limit, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfComplianceRuleResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listComplianceRules
     * @param effectiveAt The effective datetime or cut label at which to retrieve the rule definitions. Defaults to the current LUSID  system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. (optional)
     * @param page The pagination token to use to continue listing entities; this value is returned from the previous call. If  a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the  original request. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A filtered list of compliance rules available. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listComplianceRulesCall(String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, String page, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/compliance/rules";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4507");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listComplianceRulesValidateBeforeCall(String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, String page, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listComplianceRulesCall(effectiveAt, asAt, limit, filter, page, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] ListComplianceRules: List compliance rules, with optional filtering.
     * For more information about filtering results,  see https://support.lusid.com/knowledgebase/article/KA-01914.
     * @param effectiveAt The effective datetime or cut label at which to retrieve the rule definitions. Defaults to the current LUSID  system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. (optional)
     * @param page The pagination token to use to continue listing entities; this value is returned from the previous call. If  a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the  original request. (optional)
     * @return ResourceListOfComplianceRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A filtered list of compliance rules available. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfComplianceRule listComplianceRules(String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, String page) throws ApiException {
        ApiResponse<ResourceListOfComplianceRule> localVarResp = listComplianceRulesWithHttpInfo(effectiveAt, asAt, limit, filter, page);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListComplianceRules: List compliance rules, with optional filtering.
     * For more information about filtering results,  see https://support.lusid.com/knowledgebase/article/KA-01914.
     * @param effectiveAt The effective datetime or cut label at which to retrieve the rule definitions. Defaults to the current LUSID  system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. (optional)
     * @param page The pagination token to use to continue listing entities; this value is returned from the previous call. If  a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the  original request. (optional)
     * @return ApiResponse&lt;ResourceListOfComplianceRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A filtered list of compliance rules available. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfComplianceRule> listComplianceRulesWithHttpInfo(String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, String page) throws ApiException {
        okhttp3.Call localVarCall = listComplianceRulesValidateBeforeCall(effectiveAt, asAt, limit, filter, page, null);
        Type localVarReturnType = new TypeToken<ResourceListOfComplianceRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListComplianceRules: List compliance rules, with optional filtering. (asynchronously)
     * For more information about filtering results,  see https://support.lusid.com/knowledgebase/article/KA-01914.
     * @param effectiveAt The effective datetime or cut label at which to retrieve the rule definitions. Defaults to the current LUSID  system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. (optional)
     * @param page The pagination token to use to continue listing entities; this value is returned from the previous call. If  a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the  original request. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A filtered list of compliance rules available. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listComplianceRulesAsync(String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, String page, final ApiCallback<ResourceListOfComplianceRule> _callback) throws ApiException {
        okhttp3.Call localVarCall = listComplianceRulesValidateBeforeCall(effectiveAt, asAt, limit, filter, page, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfComplianceRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listComplianceRunInfo
     * @param asAt Optional. The time at which to get results from. Default : latest (optional)
     * @param page The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The List of IDs for all compliance runs completed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listComplianceRunInfoCall(OffsetDateTime asAt, String page, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/compliance/runs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4507");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listComplianceRunInfoValidateBeforeCall(OffsetDateTime asAt, String page, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listComplianceRunInfoCall(asAt, page, limit, filter, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] ListComplianceRunInfo: List historical compliance run ids.
     * Use this endpoint to fetch a list of all historical compliance runs.
     * @param asAt Optional. The time at which to get results from. Default : latest (optional)
     * @param page The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ResourceListOfComplianceRun
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The List of IDs for all compliance runs completed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfComplianceRun listComplianceRunInfo(OffsetDateTime asAt, String page, Integer limit, String filter) throws ApiException {
        ApiResponse<ResourceListOfComplianceRun> localVarResp = listComplianceRunInfoWithHttpInfo(asAt, page, limit, filter);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListComplianceRunInfo: List historical compliance run ids.
     * Use this endpoint to fetch a list of all historical compliance runs.
     * @param asAt Optional. The time at which to get results from. Default : latest (optional)
     * @param page The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;ResourceListOfComplianceRun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The List of IDs for all compliance runs completed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfComplianceRun> listComplianceRunInfoWithHttpInfo(OffsetDateTime asAt, String page, Integer limit, String filter) throws ApiException {
        okhttp3.Call localVarCall = listComplianceRunInfoValidateBeforeCall(asAt, page, limit, filter, null);
        Type localVarReturnType = new TypeToken<ResourceListOfComplianceRun>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListComplianceRunInfo: List historical compliance run ids. (asynchronously)
     * Use this endpoint to fetch a list of all historical compliance runs.
     * @param asAt Optional. The time at which to get results from. Default : latest (optional)
     * @param page The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The List of IDs for all compliance runs completed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listComplianceRunInfoAsync(OffsetDateTime asAt, String page, Integer limit, String filter, final ApiCallback<ResourceListOfComplianceRun> _callback) throws ApiException {
        okhttp3.Call localVarCall = listComplianceRunInfoValidateBeforeCall(asAt, page, limit, filter, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfComplianceRun>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listComplianceRuns
     * @param page The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The List of all compliance runs completed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listComplianceRunsCall(String page, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/compliance";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4507");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listComplianceRunsValidateBeforeCall(String page, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listComplianceRunsCall(page, limit, filter, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] ListComplianceRuns: List historical compliance runs. -- DEPRECATING IN FAVOUR OF NEW ENDPOINT
     * Use this endpoint to fetch a list of all historical compliance runs.
     * @param page The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ResourceListOfComplianceRun
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The List of all compliance runs completed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfComplianceRun listComplianceRuns(String page, Integer limit, String filter) throws ApiException {
        ApiResponse<ResourceListOfComplianceRun> localVarResp = listComplianceRunsWithHttpInfo(page, limit, filter);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListComplianceRuns: List historical compliance runs. -- DEPRECATING IN FAVOUR OF NEW ENDPOINT
     * Use this endpoint to fetch a list of all historical compliance runs.
     * @param page The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;ResourceListOfComplianceRun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The List of all compliance runs completed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfComplianceRun> listComplianceRunsWithHttpInfo(String page, Integer limit, String filter) throws ApiException {
        okhttp3.Call localVarCall = listComplianceRunsValidateBeforeCall(page, limit, filter, null);
        Type localVarReturnType = new TypeToken<ResourceListOfComplianceRun>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListComplianceRuns: List historical compliance runs. -- DEPRECATING IN FAVOUR OF NEW ENDPOINT (asynchronously)
     * Use this endpoint to fetch a list of all historical compliance runs.
     * @param page The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The List of all compliance runs completed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listComplianceRunsAsync(String page, Integer limit, String filter, final ApiCallback<ResourceListOfComplianceRun> _callback) throws ApiException {
        okhttp3.Call localVarCall = listComplianceRunsValidateBeforeCall(page, limit, filter, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfComplianceRun>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for runCompliance
     * @param isPreTrade Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false (required)
     * @param recipeIdScope Required: the scope of the recipe to be used (required)
     * @param recipeIdCode Optional: The code of the recipe to be used. If left blank, the default recipe will be used. (optional)
     * @param byTaxlots Optional. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The identifying information of a compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runComplianceCall(Boolean isPreTrade, String recipeIdScope, String recipeIdCode, Boolean byTaxlots, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/compliance/runs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (isPreTrade != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("isPreTrade", isPreTrade));
        }

        if (recipeIdScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdScope", recipeIdScope));
        }

        if (recipeIdCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdCode", recipeIdCode));
        }

        if (byTaxlots != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("byTaxlots", byTaxlots));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4507");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call runComplianceValidateBeforeCall(Boolean isPreTrade, String recipeIdScope, String recipeIdCode, Boolean byTaxlots, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'isPreTrade' is set
        if (isPreTrade == null) {
            throw new ApiException("Missing the required parameter 'isPreTrade' when calling runCompliance(Async)");
        }
        
        // verify the required parameter 'recipeIdScope' is set
        if (recipeIdScope == null) {
            throw new ApiException("Missing the required parameter 'recipeIdScope' when calling runCompliance(Async)");
        }
        

        okhttp3.Call localVarCall = runComplianceCall(isPreTrade, recipeIdScope, recipeIdCode, byTaxlots, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] RunCompliance: Kick off the compliance check process
     * Use this endpoint to fetch the start a compliance run, based on a pre-set mapping file.
     * @param isPreTrade Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false (required)
     * @param recipeIdScope Required: the scope of the recipe to be used (required)
     * @param recipeIdCode Optional: The code of the recipe to be used. If left blank, the default recipe will be used. (optional)
     * @param byTaxlots Optional. (optional)
     * @return ComplianceRun
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The identifying information of a compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ComplianceRun runCompliance(Boolean isPreTrade, String recipeIdScope, String recipeIdCode, Boolean byTaxlots) throws ApiException {
        ApiResponse<ComplianceRun> localVarResp = runComplianceWithHttpInfo(isPreTrade, recipeIdScope, recipeIdCode, byTaxlots);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] RunCompliance: Kick off the compliance check process
     * Use this endpoint to fetch the start a compliance run, based on a pre-set mapping file.
     * @param isPreTrade Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false (required)
     * @param recipeIdScope Required: the scope of the recipe to be used (required)
     * @param recipeIdCode Optional: The code of the recipe to be used. If left blank, the default recipe will be used. (optional)
     * @param byTaxlots Optional. (optional)
     * @return ApiResponse&lt;ComplianceRun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The identifying information of a compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ComplianceRun> runComplianceWithHttpInfo(Boolean isPreTrade, String recipeIdScope, String recipeIdCode, Boolean byTaxlots) throws ApiException {
        okhttp3.Call localVarCall = runComplianceValidateBeforeCall(isPreTrade, recipeIdScope, recipeIdCode, byTaxlots, null);
        Type localVarReturnType = new TypeToken<ComplianceRun>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] RunCompliance: Kick off the compliance check process (asynchronously)
     * Use this endpoint to fetch the start a compliance run, based on a pre-set mapping file.
     * @param isPreTrade Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false (required)
     * @param recipeIdScope Required: the scope of the recipe to be used (required)
     * @param recipeIdCode Optional: The code of the recipe to be used. If left blank, the default recipe will be used. (optional)
     * @param byTaxlots Optional. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The identifying information of a compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runComplianceAsync(Boolean isPreTrade, String recipeIdScope, String recipeIdCode, Boolean byTaxlots, final ApiCallback<ComplianceRun> _callback) throws ApiException {
        okhttp3.Call localVarCall = runComplianceValidateBeforeCall(isPreTrade, recipeIdScope, recipeIdCode, byTaxlots, _callback);
        Type localVarReturnType = new TypeToken<ComplianceRun>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for runComplianceCheck
     * @param fileName The name of compliance mappings file to use. Has to exist in drive ComplianceRules folder (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The identifying information of a compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runComplianceCheckCall(String fileName, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/compliance/run";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fileName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fileName", fileName));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4507");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call runComplianceCheckValidateBeforeCall(String fileName, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling runComplianceCheck(Async)");
        }
        

        okhttp3.Call localVarCall = runComplianceCheckCall(fileName, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] RunComplianceCheck: Kick off the compliance check process -- DEPRECATING - POST TRADE ONLY
     * Use this endpoint to fetch the start a compliance run, based on a pre-set mapping file.
     * @param fileName The name of compliance mappings file to use. Has to exist in drive ComplianceRules folder (required)
     * @return ComplianceRun
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The identifying information of a compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ComplianceRun runComplianceCheck(String fileName) throws ApiException {
        ApiResponse<ComplianceRun> localVarResp = runComplianceCheckWithHttpInfo(fileName);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] RunComplianceCheck: Kick off the compliance check process -- DEPRECATING - POST TRADE ONLY
     * Use this endpoint to fetch the start a compliance run, based on a pre-set mapping file.
     * @param fileName The name of compliance mappings file to use. Has to exist in drive ComplianceRules folder (required)
     * @return ApiResponse&lt;ComplianceRun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The identifying information of a compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ComplianceRun> runComplianceCheckWithHttpInfo(String fileName) throws ApiException {
        okhttp3.Call localVarCall = runComplianceCheckValidateBeforeCall(fileName, null);
        Type localVarReturnType = new TypeToken<ComplianceRun>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] RunComplianceCheck: Kick off the compliance check process -- DEPRECATING - POST TRADE ONLY (asynchronously)
     * Use this endpoint to fetch the start a compliance run, based on a pre-set mapping file.
     * @param fileName The name of compliance mappings file to use. Has to exist in drive ComplianceRules folder (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The identifying information of a compliance run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runComplianceCheckAsync(String fileName, final ApiCallback<ComplianceRun> _callback) throws ApiException {
        okhttp3.Call localVarCall = runComplianceCheckValidateBeforeCall(fileName, _callback);
        Type localVarReturnType = new TypeToken<ComplianceRun>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertComplianceRules
     * @param requestBody A dictionary of upsert request identifiers to rule upsert requests. The request               identifiers are valid for the request only and can be used to link the upserted compliance rule to the code               of a created compliance rule. (required)
     * @param effectiveAt The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Upsert compliance rules. New compliance rules must have an empty code field. Where a codeis given, this rule must already exist and will be updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertComplianceRulesCall(Map<String, ComplianceRuleUpsertRequest> requestBody, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/compliance/rules";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4507");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertComplianceRulesValidateBeforeCall(Map<String, ComplianceRuleUpsertRequest> requestBody, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling upsertComplianceRules(Async)");
        }
        

        okhttp3.Call localVarCall = upsertComplianceRulesCall(requestBody, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] UpsertComplianceRules: Upsert compliance rules.
     * To upsert a new rule, the code field must be left empty, a code will then be assigned and returned as part  of the response. To update an existing rule, include the rule code. It is possible to both create and update  compliance rules in the same request.                The upsert is transactional - either all create/update operations will succeed or none of them will.
     * @param requestBody A dictionary of upsert request identifiers to rule upsert requests. The request               identifiers are valid for the request only and can be used to link the upserted compliance rule to the code               of a created compliance rule. (required)
     * @param effectiveAt The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition. (optional)
     * @return ComplianceRuleUpsertResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Upsert compliance rules. New compliance rules must have an empty code field. Where a codeis given, this rule must already exist and will be updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ComplianceRuleUpsertResponse upsertComplianceRules(Map<String, ComplianceRuleUpsertRequest> requestBody, String effectiveAt) throws ApiException {
        ApiResponse<ComplianceRuleUpsertResponse> localVarResp = upsertComplianceRulesWithHttpInfo(requestBody, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] UpsertComplianceRules: Upsert compliance rules.
     * To upsert a new rule, the code field must be left empty, a code will then be assigned and returned as part  of the response. To update an existing rule, include the rule code. It is possible to both create and update  compliance rules in the same request.                The upsert is transactional - either all create/update operations will succeed or none of them will.
     * @param requestBody A dictionary of upsert request identifiers to rule upsert requests. The request               identifiers are valid for the request only and can be used to link the upserted compliance rule to the code               of a created compliance rule. (required)
     * @param effectiveAt The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition. (optional)
     * @return ApiResponse&lt;ComplianceRuleUpsertResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Upsert compliance rules. New compliance rules must have an empty code field. Where a codeis given, this rule must already exist and will be updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ComplianceRuleUpsertResponse> upsertComplianceRulesWithHttpInfo(Map<String, ComplianceRuleUpsertRequest> requestBody, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = upsertComplianceRulesValidateBeforeCall(requestBody, effectiveAt, null);
        Type localVarReturnType = new TypeToken<ComplianceRuleUpsertResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] UpsertComplianceRules: Upsert compliance rules. (asynchronously)
     * To upsert a new rule, the code field must be left empty, a code will then be assigned and returned as part  of the response. To update an existing rule, include the rule code. It is possible to both create and update  compliance rules in the same request.                The upsert is transactional - either all create/update operations will succeed or none of them will.
     * @param requestBody A dictionary of upsert request identifiers to rule upsert requests. The request               identifiers are valid for the request only and can be used to link the upserted compliance rule to the code               of a created compliance rule. (required)
     * @param effectiveAt The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Upsert compliance rules. New compliance rules must have an empty code field. Where a codeis given, this rule must already exist and will be updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertComplianceRulesAsync(Map<String, ComplianceRuleUpsertRequest> requestBody, String effectiveAt, final ApiCallback<ComplianceRuleUpsertResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertComplianceRulesValidateBeforeCall(requestBody, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<ComplianceRuleUpsertResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

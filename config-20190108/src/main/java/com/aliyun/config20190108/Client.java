// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108;

import com.aliyun.tea.*;
import com.aliyun.config20190108.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "config.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "config.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("config", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public ActiveConfigRulesResponse activeConfigRulesWithOptions(ActiveConfigRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigRuleIds", request.configRuleIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveConfigRules"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveConfigRulesResponse());
    }

    public ActiveConfigRulesResponse activeConfigRules(ActiveConfigRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activeConfigRulesWithOptions(request, runtime);
    }

    public DeleteConfigRulesResponse deleteConfigRulesWithOptions(DeleteConfigRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigRuleIds", request.configRuleIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfigRules"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigRulesResponse());
    }

    public DeleteConfigRulesResponse deleteConfigRules(DeleteConfigRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConfigRulesWithOptions(request, runtime);
    }

    public DescribeComplianceResponse describeComplianceWithOptions(DescribeComplianceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCompliance"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComplianceResponse());
    }

    public DescribeComplianceResponse describeCompliance(DescribeComplianceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeComplianceWithOptions(request, runtime);
    }

    public DescribeComplianceSummaryResponse describeComplianceSummaryWithOptions(DescribeComplianceSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComplianceSummary"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComplianceSummaryResponse());
    }

    public DescribeComplianceSummaryResponse describeComplianceSummary(DescribeComplianceSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeComplianceSummaryWithOptions(request, runtime);
    }

    public DescribeConfigRuleResponse describeConfigRuleWithOptions(DescribeConfigRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigRule"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigRuleResponse());
    }

    public DescribeConfigRuleResponse describeConfigRule(DescribeConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConfigRuleWithOptions(request, runtime);
    }

    public DescribeConfigurationRecorderResponse describeConfigurationRecorderWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigurationRecorder"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigurationRecorderResponse());
    }

    public DescribeConfigurationRecorderResponse describeConfigurationRecorder() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConfigurationRecorderWithOptions(runtime);
    }

    public DescribeDeliveryChannelsResponse describeDeliveryChannelsWithOptions(DescribeDeliveryChannelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeliveryChannels"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeliveryChannelsResponse());
    }

    public DescribeDeliveryChannelsResponse describeDeliveryChannels(DescribeDeliveryChannelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeliveryChannelsWithOptions(request, runtime);
    }

    public DescribeDiscoveredResourceResponse describeDiscoveredResourceWithOptions(DescribeDiscoveredResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiscoveredResource"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiscoveredResourceResponse());
    }

    public DescribeDiscoveredResourceResponse describeDiscoveredResource(DescribeDiscoveredResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiscoveredResourceWithOptions(request, runtime);
    }

    public DescribeEvaluationResultsResponse describeEvaluationResultsWithOptions(DescribeEvaluationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEvaluationResults"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEvaluationResultsResponse());
    }

    public DescribeEvaluationResultsResponse describeEvaluationResults(DescribeEvaluationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEvaluationResultsWithOptions(request, runtime);
    }

    public GetAggregateDiscoveredResourceResponse getAggregateDiscoveredResourceWithOptions(GetAggregateDiscoveredResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateDiscoveredResource"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateDiscoveredResourceResponse());
    }

    public GetAggregateDiscoveredResourceResponse getAggregateDiscoveredResource(GetAggregateDiscoveredResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateDiscoveredResourceWithOptions(request, runtime);
    }

    public GetDiscoveredResourceCountsResponse getDiscoveredResourceCountsWithOptions(GetDiscoveredResourceCountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiscoveredResourceCounts"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiscoveredResourceCountsResponse());
    }

    public GetDiscoveredResourceCountsResponse getDiscoveredResourceCounts(GetDiscoveredResourceCountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDiscoveredResourceCountsWithOptions(request, runtime);
    }

    public GetDiscoveredResourceSummaryResponse getDiscoveredResourceSummaryWithOptions(GetDiscoveredResourceSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiscoveredResourceSummary"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiscoveredResourceSummaryResponse());
    }

    public GetDiscoveredResourceSummaryResponse getDiscoveredResourceSummary(GetDiscoveredResourceSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDiscoveredResourceSummaryWithOptions(request, runtime);
    }

    public GetResourceComplianceTimelineResponse getResourceComplianceTimelineWithOptions(GetResourceComplianceTimelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceComplianceTimeline"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceComplianceTimelineResponse());
    }

    public GetResourceComplianceTimelineResponse getResourceComplianceTimeline(GetResourceComplianceTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceComplianceTimelineWithOptions(request, runtime);
    }

    public GetResourceConfigurationTimelineResponse getResourceConfigurationTimelineWithOptions(GetResourceConfigurationTimelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceConfigurationTimeline"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceConfigurationTimelineResponse());
    }

    public GetResourceConfigurationTimelineResponse getResourceConfigurationTimeline(GetResourceConfigurationTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceConfigurationTimelineWithOptions(request, runtime);
    }

    public GetSupportedResourceTypesResponse getSupportedResourceTypesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSupportedResourceTypes"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSupportedResourceTypesResponse());
    }

    public GetSupportedResourceTypesResponse getSupportedResourceTypes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSupportedResourceTypesWithOptions(runtime);
    }

    public ListAggregateDiscoveredResourcesResponse listAggregateDiscoveredResourcesWithOptions(ListAggregateDiscoveredResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateDiscoveredResources"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateDiscoveredResourcesResponse());
    }

    public ListAggregateDiscoveredResourcesResponse listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAggregateDiscoveredResourcesWithOptions(request, runtime);
    }

    public ListConfigRulesResponse listConfigRulesWithOptions(ListConfigRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigRules"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigRulesResponse());
    }

    public ListConfigRulesResponse listConfigRules(ListConfigRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigRulesWithOptions(request, runtime);
    }

    public ListDiscoveredResourcesResponse listDiscoveredResourcesWithOptions(ListDiscoveredResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiscoveredResources"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiscoveredResourcesResponse());
    }

    public ListDiscoveredResourcesResponse listDiscoveredResources(ListDiscoveredResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDiscoveredResourcesWithOptions(request, runtime);
    }

    public ListRemediationTemplatesResponse listRemediationTemplatesWithOptions(ListRemediationTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ManagedRuleIdentifier", request.managedRuleIdentifier);
        query.put("RemediationType", request.remediationType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRemediationTemplates"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRemediationTemplatesResponse());
    }

    public ListRemediationTemplatesResponse listRemediationTemplates(ListRemediationTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRemediationTemplatesWithOptions(request, runtime);
    }

    public PutConfigRuleResponse putConfigRuleWithOptions(PutConfigRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MemberId", request.memberId);
        query.put("MultiAccount", request.multiAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutConfigRule"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutConfigRuleResponse());
    }

    public PutConfigRuleResponse putConfigRule(PutConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putConfigRuleWithOptions(request, runtime);
    }

    public PutConfigurationRecorderResponse putConfigurationRecorderWithOptions(PutConfigurationRecorderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutConfigurationRecorder"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutConfigurationRecorderResponse());
    }

    public PutConfigurationRecorderResponse putConfigurationRecorder(PutConfigurationRecorderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putConfigurationRecorderWithOptions(request, runtime);
    }

    public PutDeliveryChannelResponse putDeliveryChannelWithOptions(PutDeliveryChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDeliveryChannel"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDeliveryChannelResponse());
    }

    public PutDeliveryChannelResponse putDeliveryChannel(PutDeliveryChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putDeliveryChannelWithOptions(request, runtime);
    }

    public PutEvaluationsResponse putEvaluationsWithOptions(PutEvaluationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEvaluations"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEvaluationsResponse());
    }

    public PutEvaluationsResponse putEvaluations(PutEvaluationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putEvaluationsWithOptions(request, runtime);
    }

    public StartConfigRuleEvaluationResponse startConfigRuleEvaluationWithOptions(StartConfigRuleEvaluationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CompliancePackId", request.compliancePackId);
        query.put("ConfigRuleId", request.configRuleId);
        query.put("RevertEvaluation", request.revertEvaluation);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartConfigRuleEvaluation"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartConfigRuleEvaluationResponse());
    }

    public StartConfigRuleEvaluationResponse startConfigRuleEvaluation(StartConfigRuleEvaluationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startConfigRuleEvaluationWithOptions(request, runtime);
    }

    public StartConfigurationRecorderResponse startConfigurationRecorderWithOptions(StartConfigurationRecorderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartConfigurationRecorder"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartConfigurationRecorderResponse());
    }

    public StartConfigurationRecorderResponse startConfigurationRecorder(StartConfigurationRecorderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startConfigurationRecorderWithOptions(request, runtime);
    }

    public StopConfigRulesResponse stopConfigRulesWithOptions(StopConfigRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConfigRuleIds", request.configRuleIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopConfigRules"),
            new TeaPair("version", "2019-01-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopConfigRulesResponse());
    }

    public StopConfigRulesResponse stopConfigRules(StopConfigRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopConfigRulesWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConfigurationVariateRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 变量名字
    @NameInMap("VariateName")
    public String variateName;

    public static ListConfigurationVariateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigurationVariateRequest self = new ListConfigurationVariateRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigurationVariateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConfigurationVariateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConfigurationVariateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConfigurationVariateRequest setVariateName(String variateName) {
        this.variateName = variateName;
        return this;
    }
    public String getVariateName() {
        return this.variateName;
    }

}

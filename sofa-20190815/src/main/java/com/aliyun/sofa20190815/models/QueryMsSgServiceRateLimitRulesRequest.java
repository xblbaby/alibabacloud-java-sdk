// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceRateLimitRulesRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Start")
    public Long start;

    public static QueryMsSgServiceRateLimitRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceRateLimitRulesRequest self = new QueryMsSgServiceRateLimitRulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceRateLimitRulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryMsSgServiceRateLimitRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsSgServiceRateLimitRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServiceRateLimitRulesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}

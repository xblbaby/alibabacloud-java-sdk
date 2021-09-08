// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceSceneRuleRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static QueryEdgeInstanceSceneRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceSceneRuleRequest self = new QueryEdgeInstanceSceneRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceSceneRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryEdgeInstanceSceneRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryEdgeInstanceSceneRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryEdgeInstanceSceneRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

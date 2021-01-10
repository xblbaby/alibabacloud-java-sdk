// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServicesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Start")
    public Long start;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryMsSgServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServicesRequest self = new QueryMsSgServicesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServicesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsSgServicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsSgServicesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryMsSgServicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServicesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryMsSgServicesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

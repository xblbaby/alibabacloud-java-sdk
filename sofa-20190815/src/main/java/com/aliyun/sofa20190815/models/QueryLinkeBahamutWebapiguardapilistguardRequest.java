// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapiguardapilistguardRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static QueryLinkeBahamutWebapiguardapilistguardRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapiguardapilistguardRequest self = new QueryLinkeBahamutWebapiguardapilistguardRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapiguardapilistguardRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}

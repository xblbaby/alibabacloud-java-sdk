// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPBizDbnodesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryODPBizDbnodesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPBizDbnodesRequest self = new QueryODPBizDbnodesRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPBizDbnodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

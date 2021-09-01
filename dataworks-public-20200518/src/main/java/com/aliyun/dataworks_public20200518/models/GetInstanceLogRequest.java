// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceLogRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public Long instanceId;

    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    public static GetInstanceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLogRequest self = new GetInstanceLogRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceLogRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceLogRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}

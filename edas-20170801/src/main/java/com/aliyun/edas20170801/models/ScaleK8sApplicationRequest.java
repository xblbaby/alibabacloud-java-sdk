// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleK8sApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Replicas")
    public Integer replicas;

    @NameInMap("Timeout")
    public Integer timeout;

    public static ScaleK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleK8sApplicationRequest self = new ScaleK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ScaleK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ScaleK8sApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public ScaleK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}

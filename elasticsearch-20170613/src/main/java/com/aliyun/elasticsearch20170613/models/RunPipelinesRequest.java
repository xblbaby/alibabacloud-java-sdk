// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RunPipelinesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static RunPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunPipelinesRequest self = new RunPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public RunPipelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

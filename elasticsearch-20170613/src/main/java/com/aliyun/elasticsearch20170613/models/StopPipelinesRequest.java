// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopPipelinesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static StopPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopPipelinesRequest self = new StopPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public StopPipelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectorRequest self = new UpdateCollectorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

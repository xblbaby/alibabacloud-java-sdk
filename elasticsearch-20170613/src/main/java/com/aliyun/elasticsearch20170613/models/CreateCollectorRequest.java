// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateCollectorRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectorRequest self = new CreateCollectorRequest();
        return TeaModel.build(map, self);
    }

    public CreateCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ReinstallCollectorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static ReinstallCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinstallCollectorRequest self = new ReinstallCollectorRequest();
        return TeaModel.build(map, self);
    }

    public ReinstallCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

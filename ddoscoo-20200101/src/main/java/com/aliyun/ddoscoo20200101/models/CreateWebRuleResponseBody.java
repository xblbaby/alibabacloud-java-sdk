// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWebRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWebRuleResponseBody self = new CreateWebRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWebRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

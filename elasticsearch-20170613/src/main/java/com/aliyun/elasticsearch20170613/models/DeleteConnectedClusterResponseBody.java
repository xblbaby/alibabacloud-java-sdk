// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteConnectedClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DeleteConnectedClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectedClusterResponseBody self = new DeleteConnectedClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConnectedClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteConnectedClusterResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveInstanceAccountResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveInstanceAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceAccountResponseBody self = new RemoveInstanceAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveInstanceAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

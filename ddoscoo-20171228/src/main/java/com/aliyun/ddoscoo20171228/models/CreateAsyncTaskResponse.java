// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateAsyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncTaskResponse self = new CreateAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAsyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

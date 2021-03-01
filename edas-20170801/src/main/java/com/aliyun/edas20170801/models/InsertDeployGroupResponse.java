// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertDeployGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertDeployGroupResponseBody body;

    public static InsertDeployGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertDeployGroupResponse self = new InsertDeployGroupResponse();
        return TeaModel.build(map, self);
    }

    public InsertDeployGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertDeployGroupResponse setBody(InsertDeployGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertDeployGroupResponseBody getBody() {
        return this.body;
    }

}

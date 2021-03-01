// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertClusterResponseBody body;

    public static InsertClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertClusterResponse self = new InsertClusterResponse();
        return TeaModel.build(map, self);
    }

    public InsertClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertClusterResponse setBody(InsertClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertClusterResponseBody getBody() {
        return this.body;
    }

}

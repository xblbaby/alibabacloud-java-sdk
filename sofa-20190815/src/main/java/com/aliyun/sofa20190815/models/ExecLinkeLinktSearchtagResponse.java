// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSearchtagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeLinktSearchtagResponseBody body;

    public static ExecLinkeLinktSearchtagResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSearchtagResponse self = new ExecLinkeLinktSearchtagResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSearchtagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeLinktSearchtagResponse setBody(ExecLinkeLinktSearchtagResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeLinktSearchtagResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayForPayUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RepayForPayUrlResponseBody body;

    public static RepayForPayUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        RepayForPayUrlResponse self = new RepayForPayUrlResponse();
        return TeaModel.build(map, self);
    }

    public RepayForPayUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RepayForPayUrlResponse setBody(RepayForPayUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public RepayForPayUrlResponseBody getBody() {
        return this.body;
    }

}

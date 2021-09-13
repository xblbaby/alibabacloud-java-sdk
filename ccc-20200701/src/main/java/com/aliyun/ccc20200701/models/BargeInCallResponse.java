// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BargeInCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BargeInCallResponseBody body;

    public static BargeInCallResponse build(java.util.Map<String, ?> map) throws Exception {
        BargeInCallResponse self = new BargeInCallResponse();
        return TeaModel.build(map, self);
    }

    public BargeInCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BargeInCallResponse setBody(BargeInCallResponseBody body) {
        this.body = body;
        return this;
    }
    public BargeInCallResponseBody getBody() {
        return this.body;
    }

}

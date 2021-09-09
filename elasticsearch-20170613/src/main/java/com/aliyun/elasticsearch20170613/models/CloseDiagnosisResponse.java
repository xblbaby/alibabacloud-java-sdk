// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CloseDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseDiagnosisResponseBody body;

    public static CloseDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDiagnosisResponse self = new CloseDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public CloseDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseDiagnosisResponse setBody(CloseDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseDiagnosisResponseBody getBody() {
        return this.body;
    }

}

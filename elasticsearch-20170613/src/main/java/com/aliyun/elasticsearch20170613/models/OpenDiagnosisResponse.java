// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class OpenDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenDiagnosisResponseBody body;

    public static OpenDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDiagnosisResponse self = new OpenDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public OpenDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenDiagnosisResponse setBody(OpenDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenDiagnosisResponseBody getBody() {
        return this.body;
    }

}

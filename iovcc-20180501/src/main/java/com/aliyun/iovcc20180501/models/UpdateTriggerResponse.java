// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTriggerResponseBody body;

    public static UpdateTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerResponse self = new UpdateTriggerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTriggerResponse setBody(UpdateTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTriggerResponseBody getBody() {
        return this.body;
    }

}

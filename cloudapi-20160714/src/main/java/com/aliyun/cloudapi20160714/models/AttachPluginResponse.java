// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachPluginResponseBody body;

    public static AttachPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPluginResponse self = new AttachPluginResponse();
        return TeaModel.build(map, self);
    }

    public AttachPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachPluginResponse setBody(AttachPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachPluginResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishSceneResponseBody body;

    public static PublishSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishSceneResponse self = new PublishSceneResponse();
        return TeaModel.build(map, self);
    }

    public PublishSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishSceneResponse setBody(PublishSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishSceneResponseBody getBody() {
        return this.body;
    }

}
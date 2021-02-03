// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEditingProjectsResponseBody body;

    public static DeleteEditingProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectsResponse self = new DeleteEditingProjectsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEditingProjectsResponse setBody(DeleteEditingProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEditingProjectsResponseBody getBody() {
        return this.body;
    }

}

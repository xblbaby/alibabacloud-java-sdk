// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCallTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCallTagsResponseBody body;

    public static CreateCallTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCallTagsResponse self = new CreateCallTagsResponse();
        return TeaModel.build(map, self);
    }

    public CreateCallTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCallTagsResponse setBody(CreateCallTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCallTagsResponseBody getBody() {
        return this.body;
    }

}

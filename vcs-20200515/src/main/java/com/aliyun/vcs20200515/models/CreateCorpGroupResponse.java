// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateCorpGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCorpGroupResponseBody body;

    public static CreateCorpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpGroupResponse self = new CreateCorpGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateCorpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCorpGroupResponse setBody(CreateCorpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCorpGroupResponseBody getBody() {
        return this.body;
    }

}

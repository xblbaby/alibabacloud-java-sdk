// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPipelineResponseBody body;

    public static GetPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineResponse self = new GetPipelineResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineResponse setBody(GetPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineResponseBody getBody() {
        return this.body;
    }

}

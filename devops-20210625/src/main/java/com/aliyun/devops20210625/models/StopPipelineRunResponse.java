// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class StopPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopPipelineRunResponseBody body;

    public static StopPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        StopPipelineRunResponse self = new StopPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public StopPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopPipelineRunResponse setBody(StopPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public StopPipelineRunResponseBody getBody() {
        return this.body;
    }

}

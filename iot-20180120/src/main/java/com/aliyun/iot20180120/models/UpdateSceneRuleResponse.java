// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSceneRuleResponseBody body;

    public static UpdateSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneRuleResponse self = new UpdateSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneRuleResponse setBody(UpdateSceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneRuleResponseBody getBody() {
        return this.body;
    }

}

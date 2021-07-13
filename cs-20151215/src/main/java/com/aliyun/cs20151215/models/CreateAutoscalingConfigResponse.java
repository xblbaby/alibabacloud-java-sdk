// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoscalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static CreateAutoscalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoscalingConfigResponse self = new CreateAutoscalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoscalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
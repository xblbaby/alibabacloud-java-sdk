// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateClusterV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClusterV2ResponseBody body;

    public static CreateClusterV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterV2Response self = new CreateClusterV2Response();
        return TeaModel.build(map, self);
    }

    public CreateClusterV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterV2Response setBody(CreateClusterV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterV2ResponseBody getBody() {
        return this.body;
    }

}
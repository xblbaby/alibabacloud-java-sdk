// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebRulesResponseBody body;

    public static DescribeWebRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebRulesResponse self = new DescribeWebRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebRulesResponse setBody(DescribeWebRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebRulesResponseBody getBody() {
        return this.body;
    }

}

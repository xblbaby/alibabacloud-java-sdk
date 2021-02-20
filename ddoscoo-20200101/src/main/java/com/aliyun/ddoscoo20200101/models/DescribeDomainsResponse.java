// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainsResponseBody body;

    public static DescribeDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponse self = new DescribeDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainsResponse setBody(DescribeDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainsResponseBody getBody() {
        return this.body;
    }

}

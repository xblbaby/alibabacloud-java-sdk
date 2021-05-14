// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyProcDetailResponseBody body;

    public static DescribePropertyProcDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcDetailResponse self = new DescribePropertyProcDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyProcDetailResponse setBody(DescribePropertyProcDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyProcDetailResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceDetailResponseBody body;

    public static GetServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDetailResponse self = new GetServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceDetailResponse setBody(GetServiceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceDetailResponseBody getBody() {
        return this.body;
    }

}

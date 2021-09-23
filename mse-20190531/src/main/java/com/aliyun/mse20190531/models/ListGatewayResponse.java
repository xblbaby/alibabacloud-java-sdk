// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGatewayResponseBody body;

    public static ListGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayResponse self = new ListGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayResponse setBody(ListGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayResponseBody getBody() {
        return this.body;
    }

}

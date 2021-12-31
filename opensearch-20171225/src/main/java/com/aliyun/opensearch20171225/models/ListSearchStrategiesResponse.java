// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSearchStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSearchStrategiesResponseBody body;

    public static ListSearchStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchStrategiesResponse self = new ListSearchStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchStrategiesResponse setBody(ListSearchStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchStrategiesResponseBody getBody() {
        return this.body;
    }

}

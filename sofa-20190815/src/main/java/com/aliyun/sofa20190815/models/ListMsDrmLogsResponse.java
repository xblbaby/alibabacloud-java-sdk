// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsDrmLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsDrmLogsResponseBody body;

    public static ListMsDrmLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsDrmLogsResponse self = new ListMsDrmLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsDrmLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsDrmLogsResponse setBody(ListMsDrmLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsDrmLogsResponseBody getBody() {
        return this.body;
    }

}

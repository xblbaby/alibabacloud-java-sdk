// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepoTagResponseBody body;

    public static ListRepoTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTagResponse self = new ListRepoTagResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoTagResponse setBody(ListRepoTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoTagResponseBody getBody() {
        return this.body;
    }

}

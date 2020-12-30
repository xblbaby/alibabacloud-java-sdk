// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagScanResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepoTagScanResultResponseBody body;

    public static ListRepoTagScanResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTagScanResultResponse self = new ListRepoTagScanResultResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoTagScanResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoTagScanResultResponse setBody(ListRepoTagScanResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoTagScanResultResponseBody getBody() {
        return this.body;
    }

}

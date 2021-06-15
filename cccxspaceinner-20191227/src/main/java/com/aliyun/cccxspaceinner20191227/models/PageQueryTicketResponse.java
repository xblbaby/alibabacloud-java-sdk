// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class PageQueryTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PageQueryTicketResponseBody body;

    public static PageQueryTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQueryTicketResponse self = new PageQueryTicketResponse();
        return TeaModel.build(map, self);
    }

    public PageQueryTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQueryTicketResponse setBody(PageQueryTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQueryTicketResponseBody getBody() {
        return this.body;
    }

}
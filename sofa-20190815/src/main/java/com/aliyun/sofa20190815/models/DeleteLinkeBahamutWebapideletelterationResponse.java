// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutWebapideletelterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutWebapideletelterationResponseBody body;

    public static DeleteLinkeBahamutWebapideletelterationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutWebapideletelterationResponse self = new DeleteLinkeBahamutWebapideletelterationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutWebapideletelterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutWebapideletelterationResponse setBody(DeleteLinkeBahamutWebapideletelterationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutWebapideletelterationResponseBody getBody() {
        return this.body;
    }

}

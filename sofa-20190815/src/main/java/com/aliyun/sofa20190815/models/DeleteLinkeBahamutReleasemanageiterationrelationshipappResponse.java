// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody body;

    public static DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse self = new DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse setBody(DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseBody getBody() {
        return this.body;
    }

}

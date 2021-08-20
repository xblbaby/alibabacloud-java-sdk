// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTableLevelResponseBody body;

    public static DeleteTableLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableLevelResponse self = new DeleteTableLevelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTableLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTableLevelResponse setBody(DeleteTableLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTableLevelResponseBody getBody() {
        return this.body;
    }

}

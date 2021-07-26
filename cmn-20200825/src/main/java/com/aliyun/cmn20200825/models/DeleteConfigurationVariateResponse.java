// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteConfigurationVariateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConfigurationVariateResponseBody body;

    public static DeleteConfigurationVariateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigurationVariateResponse self = new DeleteConfigurationVariateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigurationVariateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigurationVariateResponse setBody(DeleteConfigurationVariateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigurationVariateResponseBody getBody() {
        return this.body;
    }

}

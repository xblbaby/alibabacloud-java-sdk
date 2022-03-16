// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPrepayInstanceSpecResponseBody body;

    public static ModifyPrepayInstanceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecResponse self = new ModifyPrepayInstanceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrepayInstanceSpecResponse setBody(ModifyPrepayInstanceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrepayInstanceSpecResponseBody getBody() {
        return this.body;
    }

}

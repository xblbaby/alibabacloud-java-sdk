// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsGuardianConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsGuardianConfigResponseBody body;

    public static GetMsGuardianConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsGuardianConfigResponse self = new GetMsGuardianConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetMsGuardianConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsGuardianConfigResponse setBody(GetMsGuardianConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsGuardianConfigResponseBody getBody() {
        return this.body;
    }

}

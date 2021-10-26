// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveVpcAccessAndAbolishApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveVpcAccessAndAbolishApisResponseBody body;

    public static RemoveVpcAccessAndAbolishApisResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVpcAccessAndAbolishApisResponse self = new RemoveVpcAccessAndAbolishApisResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVpcAccessAndAbolishApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVpcAccessAndAbolishApisResponse setBody(RemoveVpcAccessAndAbolishApisResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVpcAccessAndAbolishApisResponseBody getBody() {
        return this.body;
    }

}

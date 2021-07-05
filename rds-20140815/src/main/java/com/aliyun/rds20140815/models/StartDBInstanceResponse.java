// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartDBInstanceResponseBody body;

    public static StartDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDBInstanceResponse self = new StartDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDBInstanceResponse setBody(StartDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDBInstanceResponseBody getBody() {
        return this.body;
    }

}
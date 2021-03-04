// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDeductLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySavingsPlansDeductLogResponseBody body;

    public static QuerySavingsPlansDeductLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansDeductLogResponse self = new QuerySavingsPlansDeductLogResponse();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansDeductLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySavingsPlansDeductLogResponse setBody(QuerySavingsPlansDeductLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySavingsPlansDeductLogResponseBody getBody() {
        return this.body;
    }

}

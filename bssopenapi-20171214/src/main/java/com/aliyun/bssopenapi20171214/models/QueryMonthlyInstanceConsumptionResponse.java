// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyInstanceConsumptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMonthlyInstanceConsumptionResponseBody body;

    public static QueryMonthlyInstanceConsumptionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyInstanceConsumptionResponse self = new QueryMonthlyInstanceConsumptionResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyInstanceConsumptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonthlyInstanceConsumptionResponse setBody(QueryMonthlyInstanceConsumptionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonthlyInstanceConsumptionResponseBody getBody() {
        return this.body;
    }

}

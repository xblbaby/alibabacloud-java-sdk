// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVulStatisticsResponseBody body;

    public static GetVulStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVulStatisticsResponse self = new GetVulStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetVulStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVulStatisticsResponse setBody(GetVulStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVulStatisticsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutZappinfosecarchdomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutZappinfosecarchdomainResponseBody body;

    public static QueryLinkeBahamutZappinfosecarchdomainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutZappinfosecarchdomainResponse self = new QueryLinkeBahamutZappinfosecarchdomainResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutZappinfosecarchdomainResponse setBody(QueryLinkeBahamutZappinfosecarchdomainResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutZappinfosecarchdomainResponseBody getBody() {
        return this.body;
    }

}

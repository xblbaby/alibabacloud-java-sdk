// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportMsDrmResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportMsDrmResourcesResponseBody body;

    public static ImportMsDrmResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportMsDrmResourcesResponse self = new ImportMsDrmResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ImportMsDrmResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportMsDrmResourcesResponse setBody(ImportMsDrmResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportMsDrmResourcesResponseBody getBody() {
        return this.body;
    }

}

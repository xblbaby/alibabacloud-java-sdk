// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody body;

    public static AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse self = new AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponse setBody(AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeProjectsidreviewssubscriptionsResponseBody getBody() {
        return this.body;
    }

}

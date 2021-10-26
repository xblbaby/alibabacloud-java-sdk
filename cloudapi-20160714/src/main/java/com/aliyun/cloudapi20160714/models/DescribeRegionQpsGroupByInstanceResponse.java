// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionQpsGroupByInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRegionQpsGroupByInstanceResponseBody body;

    public static DescribeRegionQpsGroupByInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionQpsGroupByInstanceResponse self = new DescribeRegionQpsGroupByInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionQpsGroupByInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionQpsGroupByInstanceResponse setBody(DescribeRegionQpsGroupByInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionQpsGroupByInstanceResponseBody getBody() {
        return this.body;
    }

}

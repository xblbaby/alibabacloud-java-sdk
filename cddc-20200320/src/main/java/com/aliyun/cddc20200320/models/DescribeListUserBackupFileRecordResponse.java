// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeListUserBackupFileRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeListUserBackupFileRecordResponseBody body;

    public static DescribeListUserBackupFileRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListUserBackupFileRecordResponse self = new DescribeListUserBackupFileRecordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListUserBackupFileRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListUserBackupFileRecordResponse setBody(DescribeListUserBackupFileRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListUserBackupFileRecordResponseBody getBody() {
        return this.body;
    }

}

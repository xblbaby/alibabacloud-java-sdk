// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ResumeElasticsearchTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static ResumeElasticsearchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeElasticsearchTaskResponseBody self = new ResumeElasticsearchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeElasticsearchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeElasticsearchTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDisableMsSgAuthRuleGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchDisableMsSgAuthRuleGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDisableMsSgAuthRuleGroupsResponseBody self = new BatchDisableMsSgAuthRuleGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDisableMsSgAuthRuleGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDisableMsSgAuthRuleGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchDisableMsSgAuthRuleGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}

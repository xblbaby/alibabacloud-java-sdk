// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmAKSClusterOpsGroupArrangementResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Success")
    public Boolean success;

    public static ConfirmAKSClusterOpsGroupArrangementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAKSClusterOpsGroupArrangementResponseBody self = new ConfirmAKSClusterOpsGroupArrangementResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmAKSClusterOpsGroupArrangementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmAKSClusterOpsGroupArrangementResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ConfirmAKSClusterOpsGroupArrangementResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmAKSClusterOpsGroupArrangementResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

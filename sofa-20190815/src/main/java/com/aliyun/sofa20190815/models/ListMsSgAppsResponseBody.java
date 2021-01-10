// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Result")
    public java.util.List<String> result;

    public static ListMsSgAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAppsResponseBody self = new ListMsSgAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgAppsResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

}

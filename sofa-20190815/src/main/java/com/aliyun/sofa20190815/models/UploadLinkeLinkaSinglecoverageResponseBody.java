// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinkaSinglecoverageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    public static UploadLinkeLinkaSinglecoverageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinkaSinglecoverageResponseBody self = new UploadLinkeLinkaSinglecoverageResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinkaSinglecoverageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadLinkeLinkaSinglecoverageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadLinkeLinkaSinglecoverageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UploadLinkeLinkaSinglecoverageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UploadLinkeLinkaSinglecoverageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UploadLinkeLinkaSinglecoverageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UploadLinkeLinkaSinglecoverageResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public UploadLinkeLinkaSinglecoverageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartLinkeBahamutPrepubpipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    public static StartLinkeBahamutPrepubpipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartLinkeBahamutPrepubpipelineResponseBody self = new StartLinkeBahamutPrepubpipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public StartLinkeBahamutPrepubpipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartLinkeBahamutPrepubpipelineResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartLinkeBahamutPrepubpipelineResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public StartLinkeBahamutPrepubpipelineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartLinkeBahamutPrepubpipelineResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public StartLinkeBahamutPrepubpipelineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartLinkeBahamutPrepubpipelineResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public StartLinkeBahamutPrepubpipelineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

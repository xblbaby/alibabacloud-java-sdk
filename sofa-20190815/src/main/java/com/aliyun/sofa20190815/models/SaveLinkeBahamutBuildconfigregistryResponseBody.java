// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutBuildconfigregistryResponseBody extends TeaModel {
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

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Success")
    public Boolean success;

    public static SaveLinkeBahamutBuildconfigregistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutBuildconfigregistryResponseBody self = new SaveLinkeBahamutBuildconfigregistryResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutBuildconfigregistryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveLinkeBahamutBuildconfigregistryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveLinkeBahamutBuildconfigregistryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SaveLinkeBahamutBuildconfigregistryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SaveLinkeBahamutBuildconfigregistryResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public SaveLinkeBahamutBuildconfigregistryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveLinkeBahamutBuildconfigregistryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public SaveLinkeBahamutBuildconfigregistryResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public SaveLinkeBahamutBuildconfigregistryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

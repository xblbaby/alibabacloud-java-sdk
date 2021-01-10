// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkelinkflowLinkflowAttachmentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Total")
    public Long total;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Current")
    public Long current;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkelinkflowLinkflowAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkelinkflowLinkflowAttachmentsResponseBody self = new DeleteLinkelinkflowLinkflowAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteLinkelinkflowLinkflowAttachmentsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}

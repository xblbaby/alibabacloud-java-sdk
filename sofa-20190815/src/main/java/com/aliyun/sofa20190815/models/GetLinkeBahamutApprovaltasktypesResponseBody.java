// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApprovaltasktypesResponseBody extends TeaModel {
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

    @NameInMap("Result")
    public GetLinkeBahamutApprovaltasktypesResponseBodyResult result;

    public static GetLinkeBahamutApprovaltasktypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApprovaltasktypesResponseBody self = new GetLinkeBahamutApprovaltasktypesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApprovaltasktypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutApprovaltasktypesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutApprovaltasktypesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutApprovaltasktypesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutApprovaltasktypesResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutApprovaltasktypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutApprovaltasktypesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutApprovaltasktypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutApprovaltasktypesResponseBody setResult(GetLinkeBahamutApprovaltasktypesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutApprovaltasktypesResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutApprovaltasktypesResponseBodyResult extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Data")
        public java.util.List<String> data;

        public static GetLinkeBahamutApprovaltasktypesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutApprovaltasktypesResponseBodyResult self = new GetLinkeBahamutApprovaltasktypesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutApprovaltasktypesResponseBodyResult setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetLinkeBahamutApprovaltasktypesResponseBodyResult setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutApprovaltasktypesResponseBodyResult setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutApprovaltasktypesResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetLinkeBahamutApprovaltasktypesResponseBodyResult setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}

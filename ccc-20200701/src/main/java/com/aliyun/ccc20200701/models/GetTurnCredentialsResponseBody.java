// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTurnCredentialsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("Data")
    public GetTurnCredentialsResponseBodyData data;

    public static GetTurnCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTurnCredentialsResponseBody self = new GetTurnCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTurnCredentialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTurnCredentialsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTurnCredentialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTurnCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTurnCredentialsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetTurnCredentialsResponseBody setData(GetTurnCredentialsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTurnCredentialsResponseBodyData getData() {
        return this.data;
    }

    public static class GetTurnCredentialsResponseBodyData extends TeaModel {
        @NameInMap("UserName")
        public String userName;

        @NameInMap("Password")
        public String password;

        public static GetTurnCredentialsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTurnCredentialsResponseBodyData self = new GetTurnCredentialsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTurnCredentialsResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetTurnCredentialsResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}

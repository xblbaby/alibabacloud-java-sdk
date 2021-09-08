// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetupStudioAppAuthModeOpenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public SetupStudioAppAuthModeOpenResponseBodyData data;

    public static SetupStudioAppAuthModeOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetupStudioAppAuthModeOpenResponseBody self = new SetupStudioAppAuthModeOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public SetupStudioAppAuthModeOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetupStudioAppAuthModeOpenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetupStudioAppAuthModeOpenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetupStudioAppAuthModeOpenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetupStudioAppAuthModeOpenResponseBody setData(SetupStudioAppAuthModeOpenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetupStudioAppAuthModeOpenResponseBodyData getData() {
        return this.data;
    }

    public static class SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo extends TeaModel {
        @NameInMap("IsEnable")
        public String isEnable;

        @NameInMap("Type")
        public String type;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Token")
        public String token;

        @NameInMap("BizId")
        public String bizId;

        public static SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo build(java.util.Map<String, ?> map) throws Exception {
            SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo self = new SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo();
            return TeaModel.build(map, self);
        }

        public SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo setIsEnable(String isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public String getIsEnable() {
            return this.isEnable;
        }

        public SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

    public static class SetupStudioAppAuthModeOpenResponseBodyData extends TeaModel {
        @NameInMap("AuthMode")
        public Integer authMode;

        @NameInMap("TokenInfo")
        public SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo tokenInfo;

        public static SetupStudioAppAuthModeOpenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetupStudioAppAuthModeOpenResponseBodyData self = new SetupStudioAppAuthModeOpenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetupStudioAppAuthModeOpenResponseBodyData setAuthMode(Integer authMode) {
            this.authMode = authMode;
            return this;
        }
        public Integer getAuthMode() {
            return this.authMode;
        }

        public SetupStudioAppAuthModeOpenResponseBodyData setTokenInfo(SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo tokenInfo) {
            this.tokenInfo = tokenInfo;
            return this;
        }
        public SetupStudioAppAuthModeOpenResponseBodyDataTokenInfo getTokenInfo() {
            return this.tokenInfo;
        }

    }

}

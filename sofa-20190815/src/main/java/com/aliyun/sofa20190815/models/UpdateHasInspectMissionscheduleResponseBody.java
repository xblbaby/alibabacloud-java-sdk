// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectMissionscheduleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public UpdateHasInspectMissionscheduleResponseBodyResultContent resultContent;

    public static UpdateHasInspectMissionscheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectMissionscheduleResponseBody self = new UpdateHasInspectMissionscheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectMissionscheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHasInspectMissionscheduleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateHasInspectMissionscheduleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateHasInspectMissionscheduleResponseBody setResultContent(UpdateHasInspectMissionscheduleResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateHasInspectMissionscheduleResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode self = new UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason self = new UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateHasInspectMissionscheduleResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason topErrorReason;

        public static UpdateHasInspectMissionscheduleResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateHasInspectMissionscheduleResponseBodyResultContent self = new UpdateHasInspectMissionscheduleResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContent setTopErrorCode(UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public UpdateHasInspectMissionscheduleResponseBodyResultContent setTopErrorReason(UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public UpdateHasInspectMissionscheduleResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}

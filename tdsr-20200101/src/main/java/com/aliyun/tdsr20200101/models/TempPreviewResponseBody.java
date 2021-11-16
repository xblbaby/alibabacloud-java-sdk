// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class TempPreviewResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 预览链接
    @NameInMap("PreviewUrl")
    public String previewUrl;

    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static TempPreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TempPreviewResponseBody self = new TempPreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public TempPreviewResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public TempPreviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TempPreviewResponseBody setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public TempPreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TempPreviewResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public TempPreviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

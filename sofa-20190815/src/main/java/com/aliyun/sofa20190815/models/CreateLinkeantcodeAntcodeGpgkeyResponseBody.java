// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeGpgkeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("PrimaryKeyid")
    public String primaryKeyid;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Key")
    public String key;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeGpgkeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeGpgkeyResponseBody self = new CreateLinkeantcodeAntcodeGpgkeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponseBody setPrimaryKeyid(String primaryKeyid) {
        this.primaryKeyid = primaryKeyid;
        return this;
    }
    public String getPrimaryKeyid() {
        return this.primaryKeyid;
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}

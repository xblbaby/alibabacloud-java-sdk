// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasDatabaseSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateCasDatabaseSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCasDatabaseSchemaResponseBody self = new CreateCasDatabaseSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCasDatabaseSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCasDatabaseSchemaResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateCasDatabaseSchemaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateCasDatabaseSchemaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}

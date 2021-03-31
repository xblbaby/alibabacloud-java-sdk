// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSensitiveDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SensitiveData")
    public java.util.Map<String, ?> sensitiveData;

    public static GetSensitiveDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveDataResponseBody self = new GetSensitiveDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSensitiveDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSensitiveDataResponseBody setSensitiveData(java.util.Map<String, ?> sensitiveData) {
        this.sensitiveData = sensitiveData;
        return this;
    }
    public java.util.Map<String, ?> getSensitiveData() {
        return this.sensitiveData;
    }

}
// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateIpBlockRecordResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpBlockRecordResponseBody self = new UpdateIpBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

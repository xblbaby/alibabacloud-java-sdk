// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskResponseBody extends TeaModel {
    @NameInMap("ScanTaskId")
    public Long scanTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static StartVirusScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartVirusScanTaskResponseBody self = new StartVirusScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartVirusScanTaskResponseBody setScanTaskId(Long scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public Long getScanTaskId() {
        return this.scanTaskId;
    }

    public StartVirusScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

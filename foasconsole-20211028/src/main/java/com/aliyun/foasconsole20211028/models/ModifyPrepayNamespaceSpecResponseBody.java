// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyPrepayNamespaceSpecResponseBody extends TeaModel {
    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static ModifyPrepayNamespaceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayNamespaceSpecResponseBody self = new ModifyPrepayNamespaceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayNamespaceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPrepayNamespaceSpecResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

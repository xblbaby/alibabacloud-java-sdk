// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddExistedNodesResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddExistedNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddExistedNodesResponseBody self = new AddExistedNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddExistedNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AddExistedNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

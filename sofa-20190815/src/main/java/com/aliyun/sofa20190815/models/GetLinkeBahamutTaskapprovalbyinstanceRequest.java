// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTaskapprovalbyinstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetLinkeBahamutTaskapprovalbyinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTaskapprovalbyinstanceRequest self = new GetLinkeBahamutTaskapprovalbyinstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTaskapprovalbyinstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TransformClientIdRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("ClientId")
    @Validation(required = true)
    public String clientId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static TransformClientIdRequest build(java.util.Map<String, ?> map) throws Exception {
        TransformClientIdRequest self = new TransformClientIdRequest();
        return TeaModel.build(map, self);
    }

    public TransformClientIdRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public TransformClientIdRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public TransformClientIdRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

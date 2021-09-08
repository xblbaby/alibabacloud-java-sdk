// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceGroupResponseBody body;

    public static UpdateDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceGroupResponse self = new UpdateDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceGroupResponse setBody(UpdateDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceGroupResponseBody getBody() {
        return this.body;
    }

}

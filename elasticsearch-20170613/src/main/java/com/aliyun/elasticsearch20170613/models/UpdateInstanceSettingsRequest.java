// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceSettingsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateInstanceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSettingsRequest self = new UpdateInstanceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

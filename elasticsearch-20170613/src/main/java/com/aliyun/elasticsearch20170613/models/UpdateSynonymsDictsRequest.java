// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSynonymsDictsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateSynonymsDictsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSynonymsDictsRequest self = new UpdateSynonymsDictsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSynonymsDictsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DisableKeyRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    public static DisableKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableKeyRequest self = new DisableKeyRequest();
        return TeaModel.build(map, self);
    }

    public DisableKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}

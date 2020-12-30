// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AllocatePublicNetworkAddressRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AllocatePublicNetworkAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicNetworkAddressRequest self = new AllocatePublicNetworkAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocatePublicNetworkAddressRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AllocatePublicNetworkAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

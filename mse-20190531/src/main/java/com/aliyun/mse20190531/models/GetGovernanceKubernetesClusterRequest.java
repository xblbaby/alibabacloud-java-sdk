// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static GetGovernanceKubernetesClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceKubernetesClusterRequest self = new GetGovernanceKubernetesClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetGovernanceKubernetesClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetGovernanceKubernetesClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

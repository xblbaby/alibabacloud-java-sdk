// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RollbackInstanceVersionRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static RollbackInstanceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackInstanceVersionRequest self = new RollbackInstanceVersionRequest();
        return TeaModel.build(map, self);
    }

    public RollbackInstanceVersionRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public RollbackInstanceVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

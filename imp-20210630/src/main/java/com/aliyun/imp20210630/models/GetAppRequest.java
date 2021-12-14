// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetAppRequest extends TeaModel {
    // 应用唯一标识
    @NameInMap("AppId")
    public String appId;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static GetAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppRequest self = new GetAppRequest();
        return TeaModel.build(map, self);
    }

    public GetAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

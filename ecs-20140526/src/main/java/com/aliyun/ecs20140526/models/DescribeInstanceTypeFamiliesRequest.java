// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeFamiliesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Generation")
    public String generation;

    public static DescribeInstanceTypeFamiliesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeFamiliesRequest self = new DescribeInstanceTypeFamiliesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeFamiliesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceTypeFamiliesRequest setGeneration(String generation) {
        this.generation = generation;
        return this;
    }
    public String getGeneration() {
        return this.generation;
    }

}

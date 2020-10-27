// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSupportInstanceTypesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("Filter")
    public java.util.List<DescribeImageSupportInstanceTypesRequestFilter> filter;

    public static DescribeImageSupportInstanceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSupportInstanceTypesRequest self = new DescribeImageSupportInstanceTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSupportInstanceTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageSupportInstanceTypesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageSupportInstanceTypesRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public DescribeImageSupportInstanceTypesRequest setFilter(java.util.List<DescribeImageSupportInstanceTypesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeImageSupportInstanceTypesRequestFilter> getFilter() {
        return this.filter;
    }

    public static class DescribeImageSupportInstanceTypesRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeImageSupportInstanceTypesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSupportInstanceTypesRequestFilter self = new DescribeImageSupportInstanceTypesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeImageSupportInstanceTypesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImageSupportInstanceTypesRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

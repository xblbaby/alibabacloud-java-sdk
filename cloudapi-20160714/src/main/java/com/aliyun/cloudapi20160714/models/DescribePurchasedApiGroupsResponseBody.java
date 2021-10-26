// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PurchasedApiGroupAttributes")
    public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes purchasedApiGroupAttributes;

    public static DescribePurchasedApiGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiGroupsResponseBody self = new DescribePurchasedApiGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePurchasedApiGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurchasedApiGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePurchasedApiGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePurchasedApiGroupsResponseBody setPurchasedApiGroupAttributes(DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes purchasedApiGroupAttributes) {
        this.purchasedApiGroupAttributes = purchasedApiGroupAttributes;
        return this;
    }
    public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes getPurchasedApiGroupAttributes() {
        return this.purchasedApiGroupAttributes;
    }

    public static class DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PurchasedTime")
        public String purchasedTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("InvokeTimesMax")
        public Long invokeTimesMax;

        @NameInMap("InvokeTimesNow")
        public Long invokeTimesNow;

        @NameInMap("BillingType")
        public String billingType;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute self = new DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setPurchasedTime(String purchasedTime) {
            this.purchasedTime = purchasedTime;
            return this;
        }
        public String getPurchasedTime() {
            return this.purchasedTime;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setInvokeTimesMax(Long invokeTimesMax) {
            this.invokeTimesMax = invokeTimesMax;
            return this;
        }
        public Long getInvokeTimesMax() {
            return this.invokeTimesMax;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setInvokeTimesNow(Long invokeTimesNow) {
            this.invokeTimesNow = invokeTimesNow;
            return this;
        }
        public Long getInvokeTimesNow() {
            return this.invokeTimesNow;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes extends TeaModel {
        @NameInMap("PurchasedApiGroupAttribute")
        public java.util.List<DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute> purchasedApiGroupAttribute;

        public static DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes self = new DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes();
            return TeaModel.build(map, self);
        }

        public DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributes setPurchasedApiGroupAttribute(java.util.List<DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute> purchasedApiGroupAttribute) {
            this.purchasedApiGroupAttribute = purchasedApiGroupAttribute;
            return this;
        }
        public java.util.List<DescribePurchasedApiGroupsResponseBodyPurchasedApiGroupAttributesPurchasedApiGroupAttribute> getPurchasedApiGroupAttribute() {
            return this.purchasedApiGroupAttribute;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeInstanceInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceInfo")
    public DescribeInstanceInfoResponseBodyInstanceInfo instanceInfo;

    public static DescribeInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceInfoResponseBody self = new DescribeInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceInfoResponseBody setInstanceInfo(DescribeInstanceInfoResponseBodyInstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public DescribeInstanceInfoResponseBodyInstanceInfo getInstanceInfo() {
        return this.instanceInfo;
    }

    public static class DescribeInstanceInfoResponseBodyInstanceInfo extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("EndDate")
        public Long endDate;

        @NameInMap("Version")
        public String version;

        @NameInMap("RemainDay")
        public Integer remainDay;

        @NameInMap("Region")
        public String region;

        @NameInMap("PayType")
        public Integer payType;

        @NameInMap("InDebt")
        public Integer inDebt;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("Trial")
        public Integer trial;

        public static DescribeInstanceInfoResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceInfoResponseBodyInstanceInfo self = new DescribeInstanceInfoResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setRemainDay(Integer remainDay) {
            this.remainDay = remainDay;
            return this;
        }
        public Integer getRemainDay() {
            return this.remainDay;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setInDebt(Integer inDebt) {
            this.inDebt = inDebt;
            return this;
        }
        public Integer getInDebt() {
            return this.inDebt;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setTrial(Integer trial) {
            this.trial = trial;
            return this;
        }
        public Integer getTrial() {
            return this.trial;
        }

    }

}

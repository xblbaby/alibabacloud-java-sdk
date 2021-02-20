// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceDetailsResponseBody extends TeaModel {
    @NameInMap("InstanceDetails")
    public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetails> instanceDetails;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDetailsResponseBody self = new DescribeInstanceDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDetailsResponseBody setInstanceDetails(java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetails> instanceDetails) {
        this.instanceDetails = instanceDetails;
        return this;
    }
    public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetails> getInstanceDetails() {
        return this.instanceDetails;
    }

    public DescribeInstanceDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Eip")
        public String eip;

        public static DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos self = new DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

    }

    public static class DescribeInstanceDetailsResponseBodyInstanceDetails extends TeaModel {
        @NameInMap("Line")
        public String line;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("EipInfos")
        public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos> eipInfos;

        public static DescribeInstanceDetailsResponseBodyInstanceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDetailsResponseBodyInstanceDetails self = new DescribeInstanceDetailsResponseBodyInstanceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetails setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetails setEipInfos(java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos> eipInfos) {
            this.eipInfos = eipInfos;
            return this;
        }
        public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos> getEipInfos() {
            return this.eipInfos;
        }

    }

}

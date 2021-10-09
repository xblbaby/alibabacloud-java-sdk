// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigurationRecorderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigurationRecorder")
    public DescribeConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder;

    public static DescribeConfigurationRecorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationRecorderResponseBody self = new DescribeConfigurationRecorderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationRecorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigurationRecorderResponseBody setConfigurationRecorder(DescribeConfigurationRecorderResponseBodyConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
        return this;
    }
    public DescribeConfigurationRecorderResponseBodyConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    public static class DescribeConfigurationRecorderResponseBodyConfigurationRecorder extends TeaModel {
        @NameInMap("ConfigurationRecorderStatus")
        public String configurationRecorderStatus;

        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static DescribeConfigurationRecorderResponseBodyConfigurationRecorder build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationRecorderResponseBodyConfigurationRecorder self = new DescribeConfigurationRecorderResponseBodyConfigurationRecorder();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationRecorderResponseBodyConfigurationRecorder setConfigurationRecorderStatus(String configurationRecorderStatus) {
            this.configurationRecorderStatus = configurationRecorderStatus;
            return this;
        }
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        public DescribeConfigurationRecorderResponseBodyConfigurationRecorder setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeConfigurationRecorderResponseBodyConfigurationRecorder setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

}

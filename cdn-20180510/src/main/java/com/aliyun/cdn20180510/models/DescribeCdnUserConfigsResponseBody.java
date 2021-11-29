// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserConfigsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<DescribeCdnUserConfigsResponseBodyConfigs> configs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnUserConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserConfigsResponseBody self = new DescribeCdnUserConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserConfigsResponseBody setConfigs(java.util.List<DescribeCdnUserConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<DescribeCdnUserConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public DescribeCdnUserConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnUserConfigsResponseBodyConfigs extends TeaModel {
        @NameInMap("ArgName")
        public String argName;

        @NameInMap("ArgValue")
        public String argValue;

        @NameInMap("FunctionName")
        public String functionName;

        public static DescribeCdnUserConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserConfigsResponseBodyConfigs self = new DescribeCdnUserConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserConfigsResponseBodyConfigs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeCdnUserConfigsResponseBodyConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public DescribeCdnUserConfigsResponseBodyConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

}

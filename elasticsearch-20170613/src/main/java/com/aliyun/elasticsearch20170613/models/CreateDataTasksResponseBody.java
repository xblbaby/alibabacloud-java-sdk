// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateDataTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<CreateDataTasksResponseBodyResult> result;

    public static CreateDataTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataTasksResponseBody self = new CreateDataTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataTasksResponseBody setResult(java.util.List<CreateDataTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CreateDataTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class CreateDataTasksResponseBodyResultSinkCluster extends TeaModel {
        @NameInMap("dataSourceType")
        public String dataSourceType;

        @NameInMap("index")
        public String index;

        @NameInMap("mapping")
        public String mapping;

        @NameInMap("password")
        public String password;

        @NameInMap("routing")
        public String routing;

        @NameInMap("settings")
        public String settings;

        @NameInMap("type")
        public String type;

        @NameInMap("username")
        public String username;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("vpcInstancePort")
        public String vpcInstancePort;

        public static CreateDataTasksResponseBodyResultSinkCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksResponseBodyResultSinkCluster self = new CreateDataTasksResponseBodyResultSinkCluster();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksResponseBodyResultSinkCluster setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setMapping(String mapping) {
            this.mapping = mapping;
            return this;
        }
        public String getMapping() {
            return this.mapping;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setRouting(String routing) {
            this.routing = routing;
            return this;
        }
        public String getRouting() {
            return this.routing;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public CreateDataTasksResponseBodyResultSinkCluster setVpcInstancePort(String vpcInstancePort) {
            this.vpcInstancePort = vpcInstancePort;
            return this;
        }
        public String getVpcInstancePort() {
            return this.vpcInstancePort;
        }

    }

    public static class CreateDataTasksResponseBodyResultSourceCluster extends TeaModel {
        @NameInMap("dataSourceType")
        public String dataSourceType;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("index")
        public String index;

        @NameInMap("password")
        public String password;

        @NameInMap("type")
        public String type;

        @NameInMap("username")
        public String username;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("vpcInstancePort")
        public Integer vpcInstancePort;

        public static CreateDataTasksResponseBodyResultSourceCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksResponseBodyResultSourceCluster self = new CreateDataTasksResponseBodyResultSourceCluster();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksResponseBodyResultSourceCluster setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public CreateDataTasksResponseBodyResultSourceCluster setVpcInstancePort(Integer vpcInstancePort) {
            this.vpcInstancePort = vpcInstancePort;
            return this;
        }
        public Integer getVpcInstancePort() {
            return this.vpcInstancePort;
        }

    }

    public static class CreateDataTasksResponseBodyResult extends TeaModel {
        @NameInMap("sinkCluster")
        public CreateDataTasksResponseBodyResultSinkCluster sinkCluster;

        @NameInMap("sourceCluster")
        public CreateDataTasksResponseBodyResultSourceCluster sourceCluster;

        public static CreateDataTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDataTasksResponseBodyResult self = new CreateDataTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateDataTasksResponseBodyResult setSinkCluster(CreateDataTasksResponseBodyResultSinkCluster sinkCluster) {
            this.sinkCluster = sinkCluster;
            return this;
        }
        public CreateDataTasksResponseBodyResultSinkCluster getSinkCluster() {
            return this.sinkCluster;
        }

        public CreateDataTasksResponseBodyResult setSourceCluster(CreateDataTasksResponseBodyResultSourceCluster sourceCluster) {
            this.sourceCluster = sourceCluster;
            return this;
        }
        public CreateDataTasksResponseBodyResultSourceCluster getSourceCluster() {
            return this.sourceCluster;
        }

    }

}

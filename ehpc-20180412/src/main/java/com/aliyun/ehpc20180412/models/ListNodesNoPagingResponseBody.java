// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesNoPagingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Nodes")
    public ListNodesNoPagingResponseBodyNodes nodes;

    public static ListNodesNoPagingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesNoPagingResponseBody self = new ListNodesNoPagingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesNoPagingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesNoPagingResponseBody setNodes(ListNodesNoPagingResponseBodyNodes nodes) {
        this.nodes = nodes;
        return this;
    }
    public ListNodesNoPagingResponseBodyNodes getNodes() {
        return this.nodes;
    }

    public static class ListNodesNoPagingResponseBodyNodesNodeInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Id")
        public String id;

        public static ListNodesNoPagingResponseBodyNodesNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodesNodeInfo self = new ListNodesNoPagingResponseBodyNodesNodeInfo();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesNoPagingResponseBodyNodesNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListNodesNoPagingResponseBodyNodes extends TeaModel {
        @NameInMap("NodeInfo")
        public java.util.List<ListNodesNoPagingResponseBodyNodesNodeInfo> nodeInfo;

        public static ListNodesNoPagingResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesNoPagingResponseBodyNodes self = new ListNodesNoPagingResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesNoPagingResponseBodyNodes setNodeInfo(java.util.List<ListNodesNoPagingResponseBodyNodesNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<ListNodesNoPagingResponseBodyNodesNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

}

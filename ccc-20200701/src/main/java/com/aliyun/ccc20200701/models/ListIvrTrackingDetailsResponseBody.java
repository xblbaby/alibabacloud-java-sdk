// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIvrTrackingDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListIvrTrackingDetailsResponseBodyData data;

    public static ListIvrTrackingDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIvrTrackingDetailsResponseBody self = new ListIvrTrackingDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIvrTrackingDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIvrTrackingDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIvrTrackingDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIvrTrackingDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIvrTrackingDetailsResponseBody setData(ListIvrTrackingDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIvrTrackingDetailsResponseBodyData getData() {
        return this.data;
    }

    public static class ListIvrTrackingDetailsResponseBodyDataList extends TeaModel {
        @NameInMap("Instance")
        public String instance;

        @NameInMap("Callee")
        public String callee;

        @NameInMap("EnterTime")
        public Long enterTime;

        @NameInMap("NodeVariables")
        public java.util.Map<String, ?> nodeVariables;

        @NameInMap("NodeExitCode")
        public String nodeExitCode;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("NodeProperties")
        public java.util.Map<String, ?> nodeProperties;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("LeaveTime")
        public Long leaveTime;

        @NameInMap("ChannelVariables")
        public String channelVariables;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("NodeId")
        public String nodeId;

        public static ListIvrTrackingDetailsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListIvrTrackingDetailsResponseBodyDataList self = new ListIvrTrackingDetailsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListIvrTrackingDetailsResponseBodyDataList setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setEnterTime(Long enterTime) {
            this.enterTime = enterTime;
            return this;
        }
        public Long getEnterTime() {
            return this.enterTime;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeVariables(java.util.Map<String, ?> nodeVariables) {
            this.nodeVariables = nodeVariables;
            return this;
        }
        public java.util.Map<String, ?> getNodeVariables() {
            return this.nodeVariables;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeExitCode(String nodeExitCode) {
            this.nodeExitCode = nodeExitCode;
            return this;
        }
        public String getNodeExitCode() {
            return this.nodeExitCode;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeProperties(java.util.Map<String, ?> nodeProperties) {
            this.nodeProperties = nodeProperties;
            return this;
        }
        public java.util.Map<String, ?> getNodeProperties() {
            return this.nodeProperties;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setLeaveTime(Long leaveTime) {
            this.leaveTime = leaveTime;
            return this;
        }
        public Long getLeaveTime() {
            return this.leaveTime;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setChannelVariables(String channelVariables) {
            this.channelVariables = channelVariables;
            return this;
        }
        public String getChannelVariables() {
            return this.channelVariables;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ListIvrTrackingDetailsResponseBodyDataList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class ListIvrTrackingDetailsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("List")
        public java.util.List<ListIvrTrackingDetailsResponseBodyDataList> list;

        public static ListIvrTrackingDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIvrTrackingDetailsResponseBodyData self = new ListIvrTrackingDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIvrTrackingDetailsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListIvrTrackingDetailsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIvrTrackingDetailsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListIvrTrackingDetailsResponseBodyData setList(java.util.List<ListIvrTrackingDetailsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListIvrTrackingDetailsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}

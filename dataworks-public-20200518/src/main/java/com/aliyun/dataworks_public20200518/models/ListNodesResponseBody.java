// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ListNodesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodesResponseBody setData(ListNodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNodesResponseBodyData getData() {
        return this.data;
    }

    public ListNodesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNodesResponseBodyDataNodes extends TeaModel {
        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("Repeatability")
        public Boolean repeatability;

        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        @NameInMap("ProgramType")
        public String programType;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("ParamValues")
        public String paramValues;

        @NameInMap("Connection")
        public String connection;

        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("DqcType")
        public Integer dqcType;

        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        @NameInMap("Description")
        public String description;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ResGroupName")
        public String resGroupName;

        @NameInMap("DqcDescription")
        public String dqcDescription;

        @NameInMap("CronExpress")
        public String cronExpress;

        @NameInMap("NodeId")
        public Long nodeId;

        public static ListNodesResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyDataNodes self = new ListNodesResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyDataNodes setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListNodesResponseBodyDataNodes setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public ListNodesResponseBodyDataNodes setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListNodesResponseBodyDataNodes setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public ListNodesResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListNodesResponseBodyDataNodes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListNodesResponseBodyDataNodes setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListNodesResponseBodyDataNodes setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListNodesResponseBodyDataNodes setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public ListNodesResponseBodyDataNodes setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListNodesResponseBodyDataNodes setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public ListNodesResponseBodyDataNodes setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public ListNodesResponseBodyDataNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodesResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodesResponseBodyDataNodes setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public ListNodesResponseBodyDataNodes setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public ListNodesResponseBodyDataNodes setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public ListNodesResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

    public static class ListNodesResponseBodyData extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<ListNodesResponseBodyDataNodes> nodes;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyData self = new ListNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyData setNodes(java.util.List<ListNodesResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListNodesResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public ListNodesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListNodesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListNodesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableFullInfoResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public GetMetaTableFullInfoResponseBodyData data;

    public static GetMetaTableFullInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableFullInfoResponseBody self = new GetMetaTableFullInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableFullInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableFullInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableFullInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableFullInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableFullInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableFullInfoResponseBody setData(GetMetaTableFullInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableFullInfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetMetaTableFullInfoResponseBodyDataColumnList extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnGuid")
        public String columnGuid;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("IsPrimaryKey")
        public Boolean isPrimaryKey;

        @NameInMap("Position")
        public Integer position;

        @NameInMap("Caption")
        public String caption;

        @NameInMap("IsForeignKey")
        public Boolean isForeignKey;

        public static GetMetaTableFullInfoResponseBodyDataColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableFullInfoResponseBodyDataColumnList self = new GetMetaTableFullInfoResponseBodyDataColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setColumnGuid(String columnGuid) {
            this.columnGuid = columnGuid;
            return this;
        }
        public String getColumnGuid() {
            return this.columnGuid;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public GetMetaTableFullInfoResponseBodyDataColumnList setIsForeignKey(Boolean isForeignKey) {
            this.isForeignKey = isForeignKey;
            return this;
        }
        public Boolean getIsForeignKey() {
            return this.isForeignKey;
        }

    }

    public static class GetMetaTableFullInfoResponseBodyData extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("LifeCycle")
        public Integer lifeCycle;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("EnvType")
        public Integer envType;

        @NameInMap("LastAccessTime")
        public Long lastAccessTime;

        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("IsVisible")
        public Integer isVisible;

        @NameInMap("TotalColumnCount")
        public Long totalColumnCount;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("PartitionKeys")
        public String partitionKeys;

        @NameInMap("LastDdlTime")
        public Long lastDdlTime;

        @NameInMap("Location")
        public String location;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("ColumnList")
        public java.util.List<GetMetaTableFullInfoResponseBodyDataColumnList> columnList;

        public static GetMetaTableFullInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableFullInfoResponseBodyData self = new GetMetaTableFullInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableFullInfoResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMetaTableFullInfoResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTableFullInfoResponseBodyData setLifeCycle(Integer lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Integer getLifeCycle() {
            return this.lifeCycle;
        }

        public GetMetaTableFullInfoResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableFullInfoResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMetaTableFullInfoResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaTableFullInfoResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetMetaTableFullInfoResponseBodyData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public GetMetaTableFullInfoResponseBodyData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetMetaTableFullInfoResponseBodyData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetMetaTableFullInfoResponseBodyData setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetMetaTableFullInfoResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetMetaTableFullInfoResponseBodyData setIsVisible(Integer isVisible) {
            this.isVisible = isVisible;
            return this;
        }
        public Integer getIsVisible() {
            return this.isVisible;
        }

        public GetMetaTableFullInfoResponseBodyData setTotalColumnCount(Long totalColumnCount) {
            this.totalColumnCount = totalColumnCount;
            return this;
        }
        public Long getTotalColumnCount() {
            return this.totalColumnCount;
        }

        public GetMetaTableFullInfoResponseBodyData setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTableFullInfoResponseBodyData setPartitionKeys(String partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public String getPartitionKeys() {
            return this.partitionKeys;
        }

        public GetMetaTableFullInfoResponseBodyData setLastDdlTime(Long lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public Long getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetMetaTableFullInfoResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetMetaTableFullInfoResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMetaTableFullInfoResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetMetaTableFullInfoResponseBodyData setColumnList(java.util.List<GetMetaTableFullInfoResponseBodyDataColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<GetMetaTableFullInfoResponseBodyDataColumnList> getColumnList() {
            return this.columnList;
        }

    }

}

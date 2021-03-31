// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ListCalcEnginesResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    public static ListCalcEnginesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCalcEnginesResponseBody self = new ListCalcEnginesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCalcEnginesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCalcEnginesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCalcEnginesResponseBody setData(ListCalcEnginesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCalcEnginesResponseBodyData getData() {
        return this.data;
    }

    public ListCalcEnginesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCalcEnginesResponseBodyDataCalcEngines extends TeaModel {
        @NameInMap("BindingProjectName")
        public String bindingProjectName;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("EngineId")
        public Integer engineId;

        @NameInMap("DwRegion")
        public String dwRegion;

        @NameInMap("CalcEngineType")
        public String calcEngineType;

        @NameInMap("TaskAuthType")
        public String taskAuthType;

        @NameInMap("EngineInfo")
        public java.util.Map<String, ?> engineInfo;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Region")
        public String region;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("BindingProjectId")
        public Integer bindingProjectId;

        @NameInMap("TenantId")
        public Long tenantId;

        public static ListCalcEnginesResponseBodyDataCalcEngines build(java.util.Map<String, ?> map) throws Exception {
            ListCalcEnginesResponseBodyDataCalcEngines self = new ListCalcEnginesResponseBodyDataCalcEngines();
            return TeaModel.build(map, self);
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setBindingProjectName(String bindingProjectName) {
            this.bindingProjectName = bindingProjectName;
            return this;
        }
        public String getBindingProjectName() {
            return this.bindingProjectName;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setEngineId(Integer engineId) {
            this.engineId = engineId;
            return this;
        }
        public Integer getEngineId() {
            return this.engineId;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setDwRegion(String dwRegion) {
            this.dwRegion = dwRegion;
            return this;
        }
        public String getDwRegion() {
            return this.dwRegion;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setCalcEngineType(String calcEngineType) {
            this.calcEngineType = calcEngineType;
            return this;
        }
        public String getCalcEngineType() {
            return this.calcEngineType;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setTaskAuthType(String taskAuthType) {
            this.taskAuthType = taskAuthType;
            return this;
        }
        public String getTaskAuthType() {
            return this.taskAuthType;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setEngineInfo(java.util.Map<String, ?> engineInfo) {
            this.engineInfo = engineInfo;
            return this;
        }
        public java.util.Map<String, ?> getEngineInfo() {
            return this.engineInfo;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setBindingProjectId(Integer bindingProjectId) {
            this.bindingProjectId = bindingProjectId;
            return this;
        }
        public Integer getBindingProjectId() {
            return this.bindingProjectId;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListCalcEnginesResponseBodyData extends TeaModel {
        @NameInMap("CalcEngines")
        public java.util.List<ListCalcEnginesResponseBodyDataCalcEngines> calcEngines;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCalcEnginesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCalcEnginesResponseBodyData self = new ListCalcEnginesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCalcEnginesResponseBodyData setCalcEngines(java.util.List<ListCalcEnginesResponseBodyDataCalcEngines> calcEngines) {
            this.calcEngines = calcEngines;
            return this;
        }
        public java.util.List<ListCalcEnginesResponseBodyDataCalcEngines> getCalcEngines() {
            return this.calcEngines;
        }

        public ListCalcEnginesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCalcEnginesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCalcEnginesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceListPageResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetServiceListPageResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetServiceListPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListPageResponseBody self = new GetServiceListPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceListPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceListPageResponseBody setData(GetServiceListPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceListPageResponseBodyData getData() {
        return this.data;
    }

    public GetServiceListPageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetServiceListPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceListPageResponseBodyDataContent extends TeaModel {
        @NameInMap("EdasAppName")
        public String edasAppName;

        @NameInMap("InstanceNum")
        public Integer instanceNum;

        @NameInMap("Version")
        public String version;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("EdasAppId")
        public String edasAppId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("RegisterType")
        public String registerType;

        @NameInMap("Group")
        public String group;

        public static GetServiceListPageResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListPageResponseBodyDataContent self = new GetServiceListPageResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public GetServiceListPageResponseBodyDataContent setEdasAppName(String edasAppName) {
            this.edasAppName = edasAppName;
            return this;
        }
        public String getEdasAppName() {
            return this.edasAppName;
        }

        public GetServiceListPageResponseBodyDataContent setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public GetServiceListPageResponseBodyDataContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetServiceListPageResponseBodyDataContent setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetServiceListPageResponseBodyDataContent setEdasAppId(String edasAppId) {
            this.edasAppId = edasAppId;
            return this;
        }
        public String getEdasAppId() {
            return this.edasAppId;
        }

        public GetServiceListPageResponseBodyDataContent setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceListPageResponseBodyDataContent setRegisterType(String registerType) {
            this.registerType = registerType;
            return this;
        }
        public String getRegisterType() {
            return this.registerType;
        }

        public GetServiceListPageResponseBodyDataContent setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class GetServiceListPageResponseBodyData extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("TotalPages")
        public Integer totalPages;

        @NameInMap("TotalElements")
        public Integer totalElements;

        @NameInMap("Content")
        public java.util.List<GetServiceListPageResponseBodyDataContent> content;

        public static GetServiceListPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListPageResponseBodyData self = new GetServiceListPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceListPageResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetServiceListPageResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public GetServiceListPageResponseBodyData setTotalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Integer getTotalElements() {
            return this.totalElements;
        }

        public GetServiceListPageResponseBodyData setContent(java.util.List<GetServiceListPageResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<GetServiceListPageResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}

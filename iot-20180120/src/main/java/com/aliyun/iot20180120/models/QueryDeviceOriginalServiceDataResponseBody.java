// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalServiceDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDeviceOriginalServiceDataResponseBodyData data;

    public static QueryDeviceOriginalServiceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalServiceDataResponseBody self = new QueryDeviceOriginalServiceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalServiceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalServiceDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceOriginalServiceDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalServiceDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalServiceDataResponseBody setData(QueryDeviceOriginalServiceDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalServiceDataResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("InputData")
        public String inputData;

        @NameInMap("OutputData")
        public String outputData;

        public static QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo self = new QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

    }

    public static class QueryDeviceOriginalServiceDataResponseBodyDataList extends TeaModel {
        @NameInMap("ServiceInfo")
        public java.util.List<QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo> serviceInfo;

        public static QueryDeviceOriginalServiceDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalServiceDataResponseBodyDataList self = new QueryDeviceOriginalServiceDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataList setServiceInfo(java.util.List<QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo> serviceInfo) {
            this.serviceInfo = serviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo> getServiceInfo() {
            return this.serviceInfo;
        }

    }

    public static class QueryDeviceOriginalServiceDataResponseBodyData extends TeaModel {
        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("NextValid")
        public Boolean nextValid;

        @NameInMap("List")
        public QueryDeviceOriginalServiceDataResponseBodyDataList list;

        public static QueryDeviceOriginalServiceDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalServiceDataResponseBodyData self = new QueryDeviceOriginalServiceDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalServiceDataResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalServiceDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceOriginalServiceDataResponseBodyData setList(QueryDeviceOriginalServiceDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalServiceDataResponseBodyDataList getList() {
            return this.list;
        }

    }

}

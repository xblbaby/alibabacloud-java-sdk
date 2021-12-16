// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainWebsocketHttpCodeDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("HttpCodeDataPerInterval")
    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerInterval httpCodeDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainWebsocketHttpCodeDataResponseBody self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setHttpCodeDataPerInterval(DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerInterval httpCodeDataPerInterval) {
        this.httpCodeDataPerInterval = httpCodeDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerInterval getHttpCodeDataPerInterval() {
        return this.httpCodeDataPerInterval;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Count")
        public Float count;

        @NameInMap("Proportion")
        public Float proportion;

        public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule setProportion(Float proportion) {
            this.proportion = proportion;
            return this;
        }
        public Float getProportion() {
            return this.proportion;
        }

    }

    public static class DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCode extends TeaModel {
        @NameInMap("HttpCodeDataModule")
        public java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule> httpCodeDataModule;

        public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCode self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCode();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCode setHttpCodeDataModule(java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule> httpCodeDataModule) {
            this.httpCodeDataModule = httpCodeDataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCodeHttpCodeDataModule> getHttpCodeDataModule() {
            return this.httpCodeDataModule;
        }

    }

    public static class DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModule extends TeaModel {
        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("WebsocketHttpCode")
        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCode websocketHttpCode;

        public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModule self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModule setWebsocketHttpCode(DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCode websocketHttpCode) {
            this.websocketHttpCode = websocketHttpCode;
            return this;
        }
        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModuleWebsocketHttpCode getWebsocketHttpCode() {
            return this.websocketHttpCode;
        }

    }

    public static class DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerInterval self = new DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainWebsocketHttpCodeDataResponseBodyHttpCodeDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

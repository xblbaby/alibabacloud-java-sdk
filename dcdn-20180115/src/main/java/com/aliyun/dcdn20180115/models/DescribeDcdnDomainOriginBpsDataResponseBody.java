// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainOriginBpsDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OriginBpsDataPerInterval")
    public DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval originBpsDataPerInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainOriginBpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainOriginBpsDataResponseBody self = new DescribeDcdnDomainOriginBpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainOriginBpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainOriginBpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainOriginBpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainOriginBpsDataResponseBody setOriginBpsDataPerInterval(DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval originBpsDataPerInterval) {
        this.originBpsDataPerInterval = originBpsDataPerInterval;
        return this;
    }
    public DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval getOriginBpsDataPerInterval() {
        return this.originBpsDataPerInterval;
    }

    public DescribeDcdnDomainOriginBpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainOriginBpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule extends TeaModel {
        @NameInMap("DynamicHttpOriginBps")
        public Float dynamicHttpOriginBps;

        @NameInMap("DynamicHttpsOriginBps")
        public Float dynamicHttpsOriginBps;

        @NameInMap("OriginBps")
        public Float originBps;

        @NameInMap("StaticHttpOriginBps")
        public Float staticHttpOriginBps;

        @NameInMap("StaticHttpsOriginBps")
        public Float staticHttpsOriginBps;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule self = new DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setDynamicHttpOriginBps(Float dynamicHttpOriginBps) {
            this.dynamicHttpOriginBps = dynamicHttpOriginBps;
            return this;
        }
        public Float getDynamicHttpOriginBps() {
            return this.dynamicHttpOriginBps;
        }

        public DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setDynamicHttpsOriginBps(Float dynamicHttpsOriginBps) {
            this.dynamicHttpsOriginBps = dynamicHttpsOriginBps;
            return this;
        }
        public Float getDynamicHttpsOriginBps() {
            return this.dynamicHttpsOriginBps;
        }

        public DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setOriginBps(Float originBps) {
            this.originBps = originBps;
            return this;
        }
        public Float getOriginBps() {
            return this.originBps;
        }

        public DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setStaticHttpOriginBps(Float staticHttpOriginBps) {
            this.staticHttpOriginBps = staticHttpOriginBps;
            return this;
        }
        public Float getStaticHttpOriginBps() {
            return this.staticHttpOriginBps;
        }

        public DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setStaticHttpsOriginBps(Float staticHttpsOriginBps) {
            this.staticHttpsOriginBps = staticHttpsOriginBps;
            return this;
        }
        public Float getStaticHttpsOriginBps() {
            return this.staticHttpsOriginBps;
        }

        public DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval self = new DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerInterval setDataModule(java.util.List<DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainOriginBpsDataResponseBodyOriginBpsDataPerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

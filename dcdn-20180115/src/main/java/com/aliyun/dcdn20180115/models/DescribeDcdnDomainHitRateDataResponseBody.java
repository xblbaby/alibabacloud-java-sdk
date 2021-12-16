// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainHitRateDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("HitRatePerInterval")
    public DescribeDcdnDomainHitRateDataResponseBodyHitRatePerInterval hitRatePerInterval;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainHitRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainHitRateDataResponseBody self = new DescribeDcdnDomainHitRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainHitRateDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainHitRateDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainHitRateDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainHitRateDataResponseBody setHitRatePerInterval(DescribeDcdnDomainHitRateDataResponseBodyHitRatePerInterval hitRatePerInterval) {
        this.hitRatePerInterval = hitRatePerInterval;
        return this;
    }
    public DescribeDcdnDomainHitRateDataResponseBodyHitRatePerInterval getHitRatePerInterval() {
        return this.hitRatePerInterval;
    }

    public DescribeDcdnDomainHitRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainHitRateDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule extends TeaModel {
        @NameInMap("ByteHitRate")
        public Float byteHitRate;

        @NameInMap("ReqHitRate")
        public Float reqHitRate;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule self = new DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule setByteHitRate(Float byteHitRate) {
            this.byteHitRate = byteHitRate;
            return this;
        }
        public Float getByteHitRate() {
            return this.byteHitRate;
        }

        public DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule setReqHitRate(Float reqHitRate) {
            this.reqHitRate = reqHitRate;
            return this;
        }
        public Float getReqHitRate() {
            return this.reqHitRate;
        }

        public DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainHitRateDataResponseBodyHitRatePerInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule> dataModule;

        public static DescribeDcdnDomainHitRateDataResponseBodyHitRatePerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainHitRateDataResponseBodyHitRatePerInterval self = new DescribeDcdnDomainHitRateDataResponseBodyHitRatePerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainHitRateDataResponseBodyHitRatePerInterval setDataModule(java.util.List<DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDcdnDomainHitRateDataResponseBodyHitRatePerIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}

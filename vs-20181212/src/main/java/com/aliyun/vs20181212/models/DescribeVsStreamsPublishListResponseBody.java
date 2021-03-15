// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStreamsPublishListResponseBody extends TeaModel {
    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PublishInfo")
    public DescribeVsStreamsPublishListResponseBodyPublishInfo publishInfo;

    public static DescribeVsStreamsPublishListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStreamsPublishListResponseBody self = new DescribeVsStreamsPublishListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsStreamsPublishListResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeVsStreamsPublishListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeVsStreamsPublishListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeVsStreamsPublishListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVsStreamsPublishListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsStreamsPublishListResponseBody setPublishInfo(DescribeVsStreamsPublishListResponseBodyPublishInfo publishInfo) {
        this.publishInfo = publishInfo;
        return this;
    }
    public DescribeVsStreamsPublishListResponseBodyPublishInfo getPublishInfo() {
        return this.publishInfo;
    }

    public static class DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo extends TeaModel {
        @NameInMap("EdgeNodeAddr")
        public String edgeNodeAddr;

        @NameInMap("PublishUrl")
        public String publishUrl;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("TranscodeId")
        public String transcodeId;

        @NameInMap("PublishDomain")
        public String publishDomain;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("Transcoded")
        public String transcoded;

        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("StreamUrl")
        public String streamUrl;

        public static DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo self = new DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setEdgeNodeAddr(String edgeNodeAddr) {
            this.edgeNodeAddr = edgeNodeAddr;
            return this;
        }
        public String getEdgeNodeAddr() {
            return this.edgeNodeAddr;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishUrl(String publishUrl) {
            this.publishUrl = publishUrl;
            return this;
        }
        public String getPublishUrl() {
            return this.publishUrl;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setTranscodeId(String transcodeId) {
            this.transcodeId = transcodeId;
            return this;
        }
        public String getTranscodeId() {
            return this.transcodeId;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishDomain(String publishDomain) {
            this.publishDomain = publishDomain;
            return this;
        }
        public String getPublishDomain() {
            return this.publishDomain;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setTranscoded(String transcoded) {
            this.transcoded = transcoded;
            return this;
        }
        public String getTranscoded() {
            return this.transcoded;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class DescribeVsStreamsPublishListResponseBodyPublishInfo extends TeaModel {
        @NameInMap("LiveStreamPublishInfo")
        public java.util.List<DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo> liveStreamPublishInfo;

        public static DescribeVsStreamsPublishListResponseBodyPublishInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsStreamsPublishListResponseBodyPublishInfo self = new DescribeVsStreamsPublishListResponseBodyPublishInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVsStreamsPublishListResponseBodyPublishInfo setLiveStreamPublishInfo(java.util.List<DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo> liveStreamPublishInfo) {
            this.liveStreamPublishInfo = liveStreamPublishInfo;
            return this;
        }
        public java.util.List<DescribeVsStreamsPublishListResponseBodyPublishInfoLiveStreamPublishInfo> getLiveStreamPublishInfo() {
            return this.liveStreamPublishInfo;
        }

    }

}
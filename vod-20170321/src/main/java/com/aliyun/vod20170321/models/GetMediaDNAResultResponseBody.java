// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaDNAResultResponseBody extends TeaModel {
    @NameInMap("DNAResult")
    public GetMediaDNAResultResponseBodyDNAResult DNAResult;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaDNAResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaDNAResultResponseBody self = new GetMediaDNAResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaDNAResultResponseBody setDNAResult(GetMediaDNAResultResponseBodyDNAResult DNAResult) {
        this.DNAResult = DNAResult;
        return this;
    }
    public GetMediaDNAResultResponseBodyDNAResult getDNAResult() {
        return this.DNAResult;
    }

    public GetMediaDNAResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Start")
        public String start;

        public static GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication self = new GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Start")
        public String start;

        public static GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput self = new GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetMediaDNAResultResponseBodyDNAResultVideoDNADetail extends TeaModel {
        @NameInMap("Duplication")
        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication duplication;

        @NameInMap("Input")
        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput input;

        public static GetMediaDNAResultResponseBodyDNAResultVideoDNADetail build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResultVideoDNADetail self = new GetMediaDNAResultResponseBodyDNAResultVideoDNADetail();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetail setDuplication(GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication duplication) {
            this.duplication = duplication;
            return this;
        }
        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailDuplication getDuplication() {
            return this.duplication;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetail setInput(GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput input) {
            this.input = input;
            return this;
        }
        public GetMediaDNAResultResponseBodyDNAResultVideoDNADetailInput getInput() {
            return this.input;
        }

    }

    public static class GetMediaDNAResultResponseBodyDNAResultVideoDNA extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNADetail> detail;

        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("Similarity")
        public String similarity;

        public static GetMediaDNAResultResponseBodyDNAResultVideoDNA build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResultVideoDNA self = new GetMediaDNAResultResponseBodyDNAResultVideoDNA();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNA setDetail(java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNADetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNADetail> getDetail() {
            return this.detail;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNA setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetMediaDNAResultResponseBodyDNAResultVideoDNA setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

    }

    public static class GetMediaDNAResultResponseBodyDNAResult extends TeaModel {
        @NameInMap("VideoDNA")
        public java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNA> videoDNA;

        public static GetMediaDNAResultResponseBodyDNAResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaDNAResultResponseBodyDNAResult self = new GetMediaDNAResultResponseBodyDNAResult();
            return TeaModel.build(map, self);
        }

        public GetMediaDNAResultResponseBodyDNAResult setVideoDNA(java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNA> videoDNA) {
            this.videoDNA = videoDNA;
            return this;
        }
        public java.util.List<GetMediaDNAResultResponseBodyDNAResultVideoDNA> getVideoDNA() {
            return this.videoDNA;
        }

    }

}

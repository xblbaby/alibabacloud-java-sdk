// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAnalysisJobListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AnalysisJobList")
    public QueryAnalysisJobListResponseBodyAnalysisJobList analysisJobList;

    @NameInMap("NonExistAnalysisJobIds")
    public QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds nonExistAnalysisJobIds;

    public static QueryAnalysisJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisJobListResponseBody self = new QueryAnalysisJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAnalysisJobListResponseBody setAnalysisJobList(QueryAnalysisJobListResponseBodyAnalysisJobList analysisJobList) {
        this.analysisJobList = analysisJobList;
        return this;
    }
    public QueryAnalysisJobListResponseBodyAnalysisJobList getAnalysisJobList() {
        return this.analysisJobList;
    }

    public QueryAnalysisJobListResponseBody setNonExistAnalysisJobIds(QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds nonExistAnalysisJobIds) {
        this.nonExistAnalysisJobIds = nonExistAnalysisJobIds;
        return this;
    }
    public QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds getNonExistAnalysisJobIds() {
        return this.nonExistAnalysisJobIds;
    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl extends TeaModel {
        @NameInMap("MethodStreaming")
        public String methodStreaming;

        @NameInMap("RateQuality")
        public String rateQuality;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl setMethodStreaming(String methodStreaming) {
            this.methodStreaming = methodStreaming;
            return this;
        }
        public String getMethodStreaming() {
            return this.methodStreaming;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl setRateQuality(String rateQuality) {
            this.rateQuality = rateQuality;
            return this;
        }
        public String getRateQuality() {
            return this.rateQuality;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop extends TeaModel {
        @NameInMap("Top")
        public String top;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Left")
        public String left;

        @NameInMap("Mode")
        public String mode;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl extends TeaModel {
        @NameInMap("Deinterlace")
        public String deinterlace;

        @NameInMap("Crop")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop crop;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl setDeinterlace(String deinterlace) {
            this.deinterlace = deinterlace;
            return this;
        }
        public String getDeinterlace() {
            return this.deinterlace;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl setCrop(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop crop) {
            this.crop = crop;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop getCrop() {
            return this.crop;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig extends TeaModel {
        @NameInMap("QualityControl")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl qualityControl;

        @NameInMap("PropertiesControl")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl propertiesControl;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig setQualityControl(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl qualityControl) {
            this.qualityControl = qualityControl;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl getQualityControl() {
            return this.qualityControl;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig setPropertiesControl(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl propertiesControl) {
            this.propertiesControl = propertiesControl;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl getPropertiesControl() {
            return this.propertiesControl;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo extends TeaModel {
        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("BitrateBnd")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd bitrateBnd;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Height")
        public String height;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Maxrate")
        public String maxrate;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Width")
        public String width;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Preset")
        public String preset;

        @NameInMap("ScanMode")
        public String scanMode;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setBitrateBnd(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig extends TeaModel {
        @NameInMap("TransMode")
        public String transMode;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif extends TeaModel {
        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("Loop")
        public String loop;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif gif;

        @NameInMap("Segment")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment segment;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig setGif(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif getGif() {
            return this.gif;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig setSegment(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio extends TeaModel {
        @NameInMap("Profile")
        public String profile;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Bitrate")
        public String bitrate;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate extends TeaModel {
        @NameInMap("Video")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo video;

        @NameInMap("TransConfig")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig transConfig;

        @NameInMap("State")
        public String state;

        @NameInMap("MuxConfig")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig muxConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("Audio")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio audio;

        @NameInMap("Id")
        public String id;

        @NameInMap("Container")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer container;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setVideo(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo video) {
            this.video = video;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo getVideo() {
            return this.video;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setTransConfig(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig getTransConfig() {
            return this.transConfig;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setMuxConfig(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setAudio(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio audio) {
            this.audio = audio;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio getAudio() {
            return this.audio;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setContainer(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer container) {
            this.container = container;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer getContainer() {
            return this.container;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList extends TeaModel {
        @NameInMap("Template")
        public java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate> template;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList setTemplate(java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate> getTemplate() {
            return this.template;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Percent")
        public Long percent;

        @NameInMap("State")
        public String state;

        @NameInMap("AnalysisConfig")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig analysisConfig;

        @NameInMap("Message")
        public String message;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("MNSMessageResult")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult MNSMessageResult;

        @NameInMap("TemplateList")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList templateList;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("InputFile")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile inputFile;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Id")
        public String id;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setAnalysisConfig(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig analysisConfig) {
            this.analysisConfig = analysisConfig;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig getAnalysisConfig() {
            return this.analysisConfig;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setMNSMessageResult(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setTemplateList(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList templateList) {
            this.templateList = templateList;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList getTemplateList() {
            return this.templateList;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setInputFile(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobList extends TeaModel {
        @NameInMap("AnalysisJob")
        public java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob> analysisJob;

        public static QueryAnalysisJobListResponseBodyAnalysisJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobList self = new QueryAnalysisJobListResponseBodyAnalysisJobList();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobList setAnalysisJob(java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob> analysisJob) {
            this.analysisJob = analysisJob;
            return this;
        }
        public java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob> getAnalysisJob() {
            return this.analysisJob;
        }

    }

    public static class QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds self = new QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}

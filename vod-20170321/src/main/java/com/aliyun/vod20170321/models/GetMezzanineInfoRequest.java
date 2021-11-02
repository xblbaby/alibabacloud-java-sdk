// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMezzanineInfoRequest extends TeaModel {
    @NameInMap("AdditionType")
    public String additionType;

    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("OutputType")
    public String outputType;

    @NameInMap("VideoId")
    public String videoId;

    public static GetMezzanineInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMezzanineInfoRequest self = new GetMezzanineInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMezzanineInfoRequest setAdditionType(String additionType) {
        this.additionType = additionType;
        return this;
    }
    public String getAdditionType() {
        return this.additionType;
    }

    public GetMezzanineInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetMezzanineInfoRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public GetMezzanineInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}

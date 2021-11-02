// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateDetectionJobRequest extends TeaModel {
    @NameInMap("BeginTime")
    public String beginTime;

    @NameInMap("CopyrightBeginTime")
    public String copyrightBeginTime;

    @NameInMap("CopyrightEndTime")
    public String copyrightEndTime;

    @NameInMap("CopyrightFile")
    public String copyrightFile;

    @NameInMap("CopyrightStatus")
    public String copyrightStatus;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("WhiteListUrls")
    public String whiteListUrls;

    public static UpdateDetectionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectionJobRequest self = new UpdateDetectionJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDetectionJobRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public UpdateDetectionJobRequest setCopyrightBeginTime(String copyrightBeginTime) {
        this.copyrightBeginTime = copyrightBeginTime;
        return this;
    }
    public String getCopyrightBeginTime() {
        return this.copyrightBeginTime;
    }

    public UpdateDetectionJobRequest setCopyrightEndTime(String copyrightEndTime) {
        this.copyrightEndTime = copyrightEndTime;
        return this;
    }
    public String getCopyrightEndTime() {
        return this.copyrightEndTime;
    }

    public UpdateDetectionJobRequest setCopyrightFile(String copyrightFile) {
        this.copyrightFile = copyrightFile;
        return this;
    }
    public String getCopyrightFile() {
        return this.copyrightFile;
    }

    public UpdateDetectionJobRequest setCopyrightStatus(String copyrightStatus) {
        this.copyrightStatus = copyrightStatus;
        return this;
    }
    public String getCopyrightStatus() {
        return this.copyrightStatus;
    }

    public UpdateDetectionJobRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public UpdateDetectionJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateDetectionJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateDetectionJobRequest setWhiteListUrls(String whiteListUrls) {
        this.whiteListUrls = whiteListUrls;
        return this;
    }
    public String getWhiteListUrls() {
        return this.whiteListUrls;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotHotKnowledgesRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("RobotInstanceId")
    public String robotInstanceId;

    @NameInMap("StartTime")
    public String startTime;

    public static ListBotHotKnowledgesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBotHotKnowledgesRequest self = new ListBotHotKnowledgesRequest();
        return TeaModel.build(map, self);
    }

    public ListBotHotKnowledgesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBotHotKnowledgesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListBotHotKnowledgesRequest setRobotInstanceId(String robotInstanceId) {
        this.robotInstanceId = robotInstanceId;
        return this;
    }
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    public ListBotHotKnowledgesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

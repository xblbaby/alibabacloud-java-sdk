// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class AddFCTriggerRequest extends TeaModel {
    @NameInMap("EventMetaName")
    public String eventMetaName;

    @NameInMap("EventMetaVersion")
    public String eventMetaVersion;

    @NameInMap("FunctionARN")
    public String functionARN;

    @NameInMap("Notes")
    public String notes;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RoleARN")
    public String roleARN;

    @NameInMap("SourceARN")
    public String sourceARN;

    @NameInMap("TriggerARN")
    public String triggerARN;

    public static AddFCTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFCTriggerRequest self = new AddFCTriggerRequest();
        return TeaModel.build(map, self);
    }

    public AddFCTriggerRequest setEventMetaName(String eventMetaName) {
        this.eventMetaName = eventMetaName;
        return this;
    }
    public String getEventMetaName() {
        return this.eventMetaName;
    }

    public AddFCTriggerRequest setEventMetaVersion(String eventMetaVersion) {
        this.eventMetaVersion = eventMetaVersion;
        return this;
    }
    public String getEventMetaVersion() {
        return this.eventMetaVersion;
    }

    public AddFCTriggerRequest setFunctionARN(String functionARN) {
        this.functionARN = functionARN;
        return this;
    }
    public String getFunctionARN() {
        return this.functionARN;
    }

    public AddFCTriggerRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public AddFCTriggerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddFCTriggerRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public AddFCTriggerRequest setSourceARN(String sourceARN) {
        this.sourceARN = sourceARN;
        return this;
    }
    public String getSourceARN() {
        return this.sourceARN;
    }

    public AddFCTriggerRequest setTriggerARN(String triggerARN) {
        this.triggerARN = triggerARN;
        return this;
    }
    public String getTriggerARN() {
        return this.triggerARN;
    }

}
